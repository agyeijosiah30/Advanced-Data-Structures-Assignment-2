/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
 // Josiah Aboagye Agyei 219017700


import java.util.*;
import java.util.LinkedList;
import java.util.ArrayList;

public class SinglyLinkedList {
    public static void main(String args[]) {

        LinkedList<String> list = new LinkedList<String>();
        // adding elements in the list
        list.add("Steve");
        list.add("Ronald");
        list.add("Wilson");
        list.add("50");
        list.add("30"); 
        

        //creating a collection
        Collection<String> collect = new ArrayList<String>();
        collect.add("Ama");
        collect.add("Kofi");
        collect.add("Harry");
        collect.add("Luke");
        collect.add("Brandon");
        
        // displaying the list

        System.out.println("The LinkedList is: " + list);
        
        // clearing the list
        list.clear();
        System.out.println("The list after clearing all elements is :" + list);

        //adding collection to the list

       list.addAll(collect);

        System.out.println("The new linked list is: " + list); 

        // adding new elements at the first
        list.addFirst("Hello");
        list.addFirst("Hey there");

        System.out.println("The added list is:" + list);

        //adding elements at the end of the list 
        list.addLast("The");
        list.addLast("Last");
        System.out.println("The new list with elements at the last is: " + list);

        //displaying the first element of the list
        System.out.println("The first element is:" + list.getFirst());

        //displaying the last element from the list
        System.out.println("The last element is:" + list.getLast());
        
        //displaying the first position of an element is returned
        System.out.println("The first occurence of Steve is at the index:" + list.indexOf("Steve"));
        System.out.println("The first occurence of 30 is at the index:" + list.indexOf("30"));

        //using the removeFirst() method
        System.out.println("The first element is: " + list.removeFirst());

        // using the removeLast() method
        System.out.println("The last  element is removed: " + list.removeLast());

         //displaying the size of the list
        System.out.println("The size of the linked list is:" + list.size()); 
    }
    
    
}
