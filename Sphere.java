//******************************************************************************
//
//  Developer:     Cory Munselle
//
//  Project #:     Project 2
//
//  File Name:     Sphere.java
//
//  Course:        COSC 4301 - Modern Programming
//
//  Due Date:      2/20/2022
//
//  Instructor:    Fred Kumi
//
//  Description:   Concrete class that implements getArea and getVolume for a
//                 sphere
//
//******************************************************************************

package project2;

public class Sphere extends ThreeDimensionalShape{

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
    public Sphere(double radius) {

        if(radius > 0)
            this.radius = radius;
        else
            throw new IllegalArgumentException("Radius must be greater than zero.");

    }

    //***************************************************************
    //
    //  Method:       getArea
    //
    //  Description:  Calculates and returns the surface area of a sphere
    //
    //  Parameters:   None
    //
    //  Returns:      double 4 * pi * r^2
    //
    //**************************************************************
    @Override
    public double getArea() {
        return 4 * PI * (radius * radius);
    }

    //***************************************************************
    //
    //  Method:       getVolume
    //
    //  Description:  Calculates and returns the volume of a sphere
    //
    //  Parameters:   None
    //
    //  Returns:      double 4/3 * pi * r^3
    //
    //**************************************************************
    @Override
    public double getVolume() {
        return (4.0 / 3.0) * (PI * (radius * radius * radius));
    }

}
