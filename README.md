DataSorter

Description
DataSorter is a Java implementation of the merge sort algorithm that works with custom IList data structures. This project is part of the CSE 205 course on Object-Oriented Programming and Data Structures. It showcases the implementation of a recursive sorting algorithm, following the principles of divide and conquer.

Features
- Implements a merge sort algorithm that sorts IList<Integer> objects.
- Composed of several methods to manage the sorting process:
  - mergesort: Initiates the sorting process.
  - mergesortHelper: Recursively sorts the list.
  - getLeftHalf: Retrieves the left half of the list.
  - getRightHalf: Retrieves the right half of the list.
  - merge: Combines two sorted lists into a single sorted list.

Files
- IList.java: Interface defining the IList structure (no changes required).
- MyArrayList.java: Implementation of IList (no changes required).
- MySorts.java: Contains the merge sort implementation (to be completed).
- Main.java: Used for testing the sorting algorithm.

Usage
To use this implementation, create an instance of IList<Integer>, populate it with integers, and call the mergesort method from the MySorts class. The original list will be sorted in place.
