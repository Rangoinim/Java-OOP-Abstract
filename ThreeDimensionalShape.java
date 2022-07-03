//******************************************************************************
//
//  Developer:     Cory Munselle
//
//  Project #:     Project 2
//
//  File Name:     ThreeDimensionalShape.java
//
//  Course:        COSC 4301 - Modern Programming
//
//  Due Date:      2/20/2022
//
//  Instructor:    Fred Kumi
//
//  Description:   Abstract class that contains definitions of getArea and
//                 getVolume, with an overridden toString method
//
//******************************************************************************

package project2;

public abstract class ThreeDimensionalShape extends Shape {

    // Abstract method definition for getArea
    // This was defined in Shape, but I'm redefining it here
    // because it makes little sense to implement it here
    public abstract double getArea();

    // Same thing applies to this method
    public abstract double getVolume();

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
    //  Notes:        When you use this in an abstract class
    //                it calls the first concrete subclass, which
    //                means that I can define toString here for all
    //                subclasses
    //**************************************************************
    @Override
    public String toString() {
        return String.format("%-12s%s%n" + "%-12s%s%n" + "%-12s%.1f%n" + "%-12s%.1f%n", "Shape: ", this.getClass().getSimpleName(), "Dimension: ", "Three-Dimensional", "Area: ", getArea(), "Volume: ", getVolume());
    }

}
