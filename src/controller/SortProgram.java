/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Admin
 */
import common.Algorithms;
import common.Library;
import model.Element;
import view.Menu;

/**
 *
 * @author ACER
 */
public class SortProgram extends Menu<String> {

    static String[] mc = {"Bubble Sort", "Quick sort", "Exit"};

    protected Library library;
    protected Algorithms algorithm;
    protected int[] array;
    protected int size_array;

    public SortProgram(Element element) {
        super("PROGRAMMING", mc);
        library = new Library();
        algorithm = new Algorithms();
        size_array = element.getSize_array();
        array = element.getArray();
        //1. Enter a possitive number
        //size_array = library.getInt("Enter number of array", 1, 100);
        //2. Create array by generate random integer in range
        //array = library.createArray(size_array);
    }

    @Override
    public void execute(int n) {
        System.out.println("Unsorted array: ");
        library.display(array);
        switch (n) {
            case 1:
                algorithm.buddleSort(array);
                System.out.println("\nSorted array by Buddle Sort: ");
                library.display(array);
                System.out.println("");
                break;
            case 2:
                algorithm.quickSort(array, 0, size_array - 1);
                System.out.println("\nSorted array by Quick Sort: ");
                library.display(array);
                System.out.println("");
                break;
            case 3:
                System.exit(0);
                break;
        }
    }
    
    public static void main(String[] args) {
        Library library = new Library();
        Element element = new Element();
        //1. Enter a possitive number
        element.setSize_array(library.getInt("Enter number of array", 1, 100));
        //2. Create array by generate random integer in range
        element.setArray(library.createArray(element.size_array));
        new SortProgram(element).run();
    }
}
