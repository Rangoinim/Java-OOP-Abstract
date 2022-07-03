//******************************************************************************
//
//  Developer:     Cory Munselle
//
//  Project #:     Project 2
//
//  File Name:     Tetrahedron.java
//
//  Course:        COSC 4301 - Modern Programming
//
//  Due Date:      2/20/2022
//
//  Instructor:    Fred Kumi
//
//  Description:   Concrete class that implements getArea and getVolume for a
//                 tetrahedron
//
//******************************************************************************

package project2;

public class Tetrahedron extends ThreeDimensionalShape{

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
    public Tetrahedron(double edge) {

        if (edge > 0)
            this.edge = edge;
        else
            throw new IllegalArgumentException("Edge must be greater than zero.");
    }

    //***************************************************************
    //
    //  Method:       getArea
    //
    //  Description:  Calculates and returns the surface area of a tetrahedron
    //
    //  Parameters:   None
    //
    //  Returns:      double sqrt(3) * edge^2
    //
    //**************************************************************
    @Override
    public double getArea() {
        return Math.sqrt(3) * (edge * edge);
    }

    //***************************************************************
    //
    //  Method:       getVolume
    //
    //  Description:  Calculates and returns the volume of a tetrahedron
    //
    //  Parameters:   None
    //
    //  Returns:      double edge^3 / 6 * sqrt(2)
    //
    //**************************************************************
    @Override
    public double getVolume() {
        return (edge * edge * edge) / (6 * Math.sqrt(2));
    }

}
