package com.array.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListBubbleSort {

	private static void bubbleSort(ArrayList<Integer> list){
		for(int i=0;i<list.size()-1;i++){//This loop used for passes for how much passes create which is create by size-1
			for(int j=0;j<list.size()-1-i;j++){
				if(list.get(j).compareTo(list.get(j+1))>0){
					//Swapping by third variable
					int temp=list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, temp);
				}
			}
		}
		//print our sorted elements...
		Iterator <Integer>it=list.iterator();
		for(int j=0;it.hasNext();j++){
			System.out.print(" "+it.next());
		}
	}
	public static void main(String []srgs) throws NumberFormatException, IOException{

		String list="";
		System.out.println("BubbleSort Program Started...!!");
		System.out.println("Enter Element of ArrayList in Unsorted??");
		System.out.println("After enter please write stop for stopping elements.");

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Integer> alist=new ArrayList<Integer>();
		//reading list string iterates and convert into integer and add elements to list.
		while(!(list=br.readLine()).equalsIgnoreCase("stop")){
			int element=Integer.parseInt(list);
			alist.add(element);
		}
		bubbleSort(alist);
	}
}
