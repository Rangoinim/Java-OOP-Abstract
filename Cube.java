//******************************************************************************
//
//  Developer:     Cory Munselle
//
//  Project #:     Project 2
//
//  File Name:     Cube.java
//
//  Course:        COSC 4301 - Modern Programming
//
//  Due Date:      2/20/2022
//
//  Instructor:    Fred Kumi
//
//  Description:   Concrete class that implements getArea and getVolume for a
//                 cube
//
//******************************************************************************

package project2;

public class Cube extends ThreeDimensionalShape{

    private final double edge;

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
    public Cube(double edge) {

        if (edge > 0)
            this.edge = edge;
        else
            throw new IllegalArgumentException("Edge must be greater than zero.");
    }

    //***************************************************************
    //
    //  Method:       getArea
    //
    //  Description:  Calculates and returns the surface area of a cube
    //
    //  Parameters:   None
    //
    //  Returns:      double 6 * edge^2
    //
    //**************************************************************
    @Override
    public double getArea() {
        return 6 * (edge * edge);
    }

    //***************************************************************
    //
    //  Method:       getVolume
    //
    //  Description:  Calculates and returns the volume of a cube
    //
    //  Parameters:   None
    //
    //  Returns:      double edge^3
    //
    //**************************************************************
    @Override
    public double getVolume() {
        return edge * edge * edge;
    }

}
