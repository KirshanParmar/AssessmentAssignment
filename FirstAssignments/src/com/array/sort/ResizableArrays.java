package com.array.sort;

public class ResizableArrays {

	private int array[];
	private int count;
	private int sizeofarray;
	//creating a constructor of the class that initializes the values
	public ResizableArrays()
	{
	array = new int[1];
	count = 0;
	sizeofarray = 1;
	}
	//creating a function that appends an element at the end of the array
	public void addElement(int a)
	{
	//compares if the number of elements is equal to the size of the array or not
	if (count == sizeofarray)
	{
	//invoking the growSize() method that creates an array of double size
	growSize();
	}
	//appens an element at the end of the array
	array[count] = a;
	count++;
	}
	//function that creates an array of double size
	public void growSize()
	{
	//declares a temp[] array
	int temp[] = null;
	if (count == sizeofarray)
	{
	temp = new int[sizeofarray * 2];
	{
	for (int i = 0; i < sizeofarray; i++)
	{
	//copies all the elements of the old array
	temp[i] = array[i];
	}
	}
	}
	array = temp;
	sizeofarray= sizeofarray * 2;
	}
	//creating a function that deletes an element at the specified index
	public void addElementAt(int index, int a)
	{
	//compare the size with the number of elements if not equal grows the array size
	if (count == sizeofarray)
	{
	//invoking growSize() method
	growSize();
	}
	for (int i = count - 1; i >= index; i--)
	{
	//shifting all the elements to the left from the specified index
	array[i + 1] = array[i];
	}
	//inserts an element at the specified index
	array[index] = a;
	count++;
	}
	public static void main(String[] args)
	{
	ResizableArrays ra=new ResizableArrays();
	ra.addElement(10);
	ra.addElement(20);
	ra.addElement(30);
	ra.addElement(40);
	ra.addElement(80);
	ra.addElement(22);
	ra.addElement(70);
	ra.addElement(90);
	ra.addElement(100);
	ra.addElement(50);
	System.out.println("Elements of the array:");
	//iterate over the array for accessing the elements
	for (int i = 0; i < ra.sizeofarray; i++)
	{
	System.out.print(ra.array[i] + " ");
	}

	//determines and prints the size and number of elements of the array
	System.out.println("Size of the array: " + ra.sizeofarray);
	System.out.println("No. of elements in the array: " + ra.count);
	//invoking the method to add an element at the specified index
	ra.addElementAt(5, 99); //where 5 is the index number and 99 is the element to be add
	System.out.println("\n Elements of the array after adding an element at index 5:");
	//iterate over the array for accessing the elements after adding the element at index 5
	for (int i = 0; i < ra.sizeofarray; i++)
	{
	System.out.print(ra.array[i] + " ");
	}
	System.out.println();
	//determines and prints the size and number of elements of the array
	System.out.println("Size of the array: " + ra.sizeofarray);
	System.out.println("No. of elements in the array: " + ra.count);
}
}
