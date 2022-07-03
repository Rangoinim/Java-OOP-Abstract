//******************************************************************************
//
//  Developer:     Cory Munselle
//
//  Project #:     Project 2
//
//  File Name:     Circle.java
//
//  Course:        COSC 4301 - Modern Programming
//
//  Due Date:      2/20/2022
//
//  Instructor:    Fred Kumi
//
//  Description:   Concrete class that implements getArea for a circle
//
//
//******************************************************************************

package project2;

public class Circle extends TwoDimensionalShape {

    private final double radius;

    //***************************************************************
    //
    //  Method:       Constructor
    //
    //  Description:  Defines variables if they're within acceptable bounds
    //
    //  Parameters:   double
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public Circle(double radius) {

        if (radius > 0)
            this.radius = radius;
        else
            throw new IllegalArgumentException("Radius must be at least zero.");
    }

    //***************************************************************
    //
    //  Method:       getArea
    //
    //  Description:  Calculates and returns the area of a circle
    //
    //  Parameters:   None
    //
    //  Returns:      double pi * r^2
    //
    //**************************************************************
    public double getArea() {
        return PI*(radius * radius);
    }

}
