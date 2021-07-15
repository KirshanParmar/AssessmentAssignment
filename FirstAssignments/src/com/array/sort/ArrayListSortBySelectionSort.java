package com.array.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSortBySelectionSort {

		private static void selectionSort(ArrayList<Integer> list){
			for(int i=0;i<list.size()-1;i++){ //This loop used for passes for much passes create wich is create by size-1
                int max=i;//max initialize with i value
				for(int j=0;j<list.size()-i;j++){//This loop check values and assign minimum value to max
					if(list.get(max).compareTo(list.get(j))<0){
					   max=j; //here if j value less then max value then swap it.
					}
				}
				//Here our elements are swapped...
				int temp=list.get(max);
				int lastPosition=list.size()-1-i;
				int valueInLastPosition=list.get(lastPosition);
				list.set(max, valueInLastPosition);
                //here swapped values set in list..
				list.set(lastPosition, temp);
			}
			    System.out.println("Sorted Elements....!!");
			  //print our sorted elements...
				Iterator <Integer>it=list.iterator();
				for(int j=0;it.hasNext();j++){
					System.out.println(" "+it.next());
				}
		}

	 public static void main(String []srgs) throws NumberFormatException, IOException{

		    String list="";
			ArrayList<Integer> alist=new ArrayList<Integer>();
			System.out.println("Selection Sort Program Started...!!");
			System.out.println("Enter Element of ArrayList in Unsorted??");
			System.out.println("After enter please write stop for stopping elements.");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			//reading list string iterates and convert into integer and add list.
			while(!(list=br.readLine()).equalsIgnoreCase("stop")){
				int element=Integer.parseInt(list);
				alist.add(element);
			}

			selectionSort(alist);
	}

}
