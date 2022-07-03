//******************************************************************************
//
//  Developer:     Instructor
//
//  Project #:     Project 2
//
//  File Name:     Shape.java
//
//  Course:        COSC 4301 - Modern Programming
//
//  Due Date:      2/20/2022
//
//  Instructor:    Fred Kumi 
//
//  Description:   This abstract superclass provides the general design
//	               of Shape objects. Please do NOT modify this class.
//                 If you do, you will not receive credit for this project.
//
//******************************************************************************

package project2;

public abstract class Shape
{
	protected final double PI = 3.14159; // For calculations involving radius

	public abstract double getArea();
}
