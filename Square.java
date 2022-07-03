//******************************************************************************
//
//  Developer:     Cory Munselle
//
//  Project #:     Project 2
//
//  File Name:     Square.java
//
//  Course:        COSC 4301 - Modern Programming
//
//  Due Date:      2/20/2022
//
//  Instructor:    Fred Kumi
//
//  Description:   Concrete class that implements getArea for a square
//
//
//******************************************************************************

package project2;

public class Square extends TwoDimensionalShape {

    private final double length;

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
    public Square(double length) {

        if (length > 0)
            this.length = length;
        else
            throw new IllegalArgumentException("Length must be greater than zero.");

    }

    //***************************************************************
    //
    //  Method:       getArea
    //
    //  Description:  Calculates and returns the area of a square
    //
    //  Parameters:   None
    //
    //  Returns:      double length^2
    //
    //**************************************************************
    @Override
    public double getArea() {
        return length * length;
    }
}
