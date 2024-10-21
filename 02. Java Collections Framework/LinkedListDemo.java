// package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
   This program demonstrates the LinkedList class.
*/
public class LinkedListDemo
{  
   public static void main(String[] args)
   {  
      LinkedList<String> staff = new LinkedList<String>();
      staff.addLast("Diana");
      staff.addLast("Harry");
      staff.addLast("Romeo");
      staff.addLast("Marco");
      staff.addLast("Tom"); //DHRMT

      staff.addFirst("Samanta");//SDHRMT
 
      String name1 = staff.getFirst();//S
      String name2 = staff.getLast();//T
      staff.removeFirst();//DHRMT
      
      // | in the comments indicates the iterator position

      ListIterator<String> iterator = staff.listIterator(); // |DHRMT
      iterator.next(); // D|HRMT
      iterator.next(); // DH|RMT

      // Add more elements after second element
      
      iterator.add("Juliet"); // DHJ|RMT
      iterator.add("Nina"); // DHJN|RMT

      iterator.next(); // DHJNR|MT

      // Remove last traversed element 

      iterator.remove(); // DHJN|MT
      iterator.add("Ella"); // DHJNE|MT
     
      // Print all elements

      System.out.println(name1); // Samanta
      System.out.println(name2); // Tom
      System.out.println(staff); // [Diana, Harry, Juliet, Nina, Ella, Marco, Tom]

      // Process all the elements

      //using iterator to process the contents of a linked list
      iterator = staff.listIterator();
      while (iterator.hasNext()){
         String name = iterator.next();
         System.out.print(name+"...");
      }

      System.out.println(" ");

      //the enhanced for loop uses an iterator behind the scenes
      for (String s : staff){
         System.out.print(s+"---");
      }

      LinkedList<String> students = (LinkedList)staff.clone();

      System.out.println("\n\n" + students.toString());
      students.add("Harry");
      students.add("Ella");
      students.add("Anna");
      students.add("Harry");
      System.out.println("\n" + students.toString()); // DHJNEMTHEAH
      // Harry appears 3 times
      // Ella appears 2 times

      System.out.println("\nIndex of last Harry element: " + students.lastIndexOf("Harry"));

      Iterator<String> studentIterator = students.descendingIterator();
      while (studentIterator.hasNext()){
         String name = studentIterator.next();
         System.out.print(name+"...");
      } // HAEHTMENJHD

      System.out.println("\n\n" + students.toString());

      students.removeFirstOccurrence("Harry");
      students.removeLastOccurrence("Ella");
      students.removeLastOccurrence("Harry");

      System.out.println("\n" + students.toString() + "\n"); // DJNEMTHA

      System.out.println(students.element()); //Retries 1st element (head) but does not remove
      System.out.println(students.peek()); //Retries 1st element (head) but does not remove
      System.out.println(students.poll()); //Retries and removes 1st element (head)
      System.out.println(students.toString()); // JNEMTHA
      students.push("Giacomo"); // Adds element at the start
      System.out.println(students.toString()); // GJNEMTHA
      students.pop(); //Removes and returns 1st element
      System.out.println(students.toString()); // JNEMTHA
      students.offer("Roksi"); // Adds element at the end (tail)
      System.out.println(students.toString()); // JNEMTHAR

   }
}
