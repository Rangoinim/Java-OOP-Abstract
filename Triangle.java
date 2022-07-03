//******************************************************************************
//
//  Developer:     Cory Munselle
//
//  Project #:     Project 2
//
//  File Name:     Triangle.java
//
//  Course:        COSC 4301 - Modern Programming
//
//  Due Date:      2/20/2022
//
//  Instructor:    Fred Kumi
//
//  Description:   Concrete class that implements getArea for a triangle
//
//
//******************************************************************************

package project2;

public class Triangle extends TwoDimensionalShape{

    private final double base;
    private final double height;

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
    public Triangle(double base, double height) {

        if (base >= 0 && height >= 0) {
            this.base = base;
            this.height = height;
        }
        else
            throw new IllegalArgumentException("Base and height must be equal or greater than zer.");
    }

    //***************************************************************
    //
    //  Method:       getArea
    //
    //  Description:  Calculates and returns the area of a triangle
    //
    //  Parameters:   None
    //
    //  Returns:      double 1/2 * b * h
    //
    //**************************************************************
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

}
