//******************************************************************************
//
//  Developer:     Cory Munselle
//
//  Project #:     Project 2
//
//  File Name:     TwoDimensionalShape.java
//
//  Course:        COSC 4301 - Modern Programming
//
//  Due Date:      2/20/2022
//
//  Instructor:    Fred Kumi
//
//  Description:   Abstract class that contains a definition of getArea
//                 with an overridden toString method
//
//******************************************************************************

package project2;

public abstract class TwoDimensionalShape extends Shape {

    // Abstract method definition for getArea
    public abstract double getArea();

    //***************************************************************
    //
    //  Method:       toString
    //
    //  Description:  Returns a formatted string representation of the class
    //
    //  Parameters:   None
    //
    //  Returns:      String
    //
    //**************************************************************
    @Override
    public String toString() {
        return String.format("%-12s%s%n" + "%-12s%s%n" + "%-12s%.1f%n","Shape: ", this.getClass().getSimpleName(), "Dimension: ", "Two-Dimensional", "Area: ", getArea());
    }

}
