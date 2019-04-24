package com.company;

public class Main {

    public static void main(String[] args) {
	// Declare an array of integers
    // Define the array by listing the data type first
    // Then use 2 square brackets []
    // Then give the array a name followed by a semicolon
    int [] myArray;

    //Allocating memory to the array
    // List the array name, followed by an = sign, followed by the key word "new"
    // followed by the data type, followed by the [] with the number of elements inside
    // then the semicolon.
    myArray = new int[10];

    //initialize the array
    //List the array name, followed by [], with the index number inserted into the brackets
    // followed by an equal sign then the content of that cell
    myArray[0] = 1;
    myArray[1] = 2;
    myArray[2] = 3;
    myArray[3] = 4;
    myArray[4] = 5;
    myArray[5] = 6;
    myArray[6] = 7;
    myArray[7] = 8;
    myArray[8] = 9;
    myArray[9] = 10;

    // Print the elements in the array
        System.out.println("Elements at index 0: "
        + myArray[0]);
        System.out.println("Elements at index 5: "
        + myArray[5]);
        System.out.println("Elements at index 9: "
        + myArray[9]);

    }
}
