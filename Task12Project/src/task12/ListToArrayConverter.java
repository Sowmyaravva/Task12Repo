package task12;

import java.io.*; 
import java.util.LinkedList; 
import java.util.List; 

public class ListToArrayConverter {
    public static void main(String[] args) {
    	
        List<String> list = new LinkedList<String>(); 
  
        list.add("Geeks"); 
        list.add("for"); 
        list.add("Geeks"); 
        list.add("Practice"); 
  
        String[] arr = new String[list.size()]; 
  
        for (int i = 0; i < list.size(); i++) 
            arr[i] = list.get(i); 
  
      for (String x : arr) 
            System.out.print(x + " "); 
    } 
}