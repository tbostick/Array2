package com.company;

public class Main {

    public static void main(String[] args) {
	// Declare an array of doubles
    // Define the array by listing the data type first
    // Then use 2 square brackets []
    // Then give the array a name followed by a semicolon
    double [] myArray2;

    //Allocating memory to the array
    // List the array name, followed by an = sign, followed by the key word "new"
    // followed by the data type, followed by the [] with the number of elements inside
    // then the semicolon.
    myArray2 = new double[5];

    //initialize the array
    //List the array name, followed by [], with the index number inserted into the brackets
    // followed by an equal sign then the content of that cell
    myArray2[0] = 1.1;
    myArray2[1] = 2.0;
    myArray2[2] = 3.5;
    myArray2[3] = 4.3;
    myArray2[4] = 5.98;


    // Print the elements in the array
        System.out.println("Element at index 0: "
        + myArray2[0]);
        System.out.println("Element at index 1: "
        + myArray2[1]);
        System.out.println("Element at index 2: "
        + myArray2[2]);
        System.out.println("Element at index 3: "
        + myArray2[3]);
        System.out.println("Element at index 4: "
        + myArray2[4]);

    }
}
