package com.linkedList;

import com.util.LinkedList;

public class LinkedListImp {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
        list.insert(15);
        list.insert(20);
        list.insert(10);
        list.insert(60);
        list.delete(1);

        list.print();
	}

}
