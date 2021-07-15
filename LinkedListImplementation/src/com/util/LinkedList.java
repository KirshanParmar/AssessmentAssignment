package com.util;

public class LinkedList {
    Node head;
/**********Start Insert Node Method****************************************************************/
	public void insert(int data){
		Node node=new Node();
		node.dataElement=data;
     /**verify if first node is our head and it's null because by default head is null**/
		if(head==null){
			head=node;
		}else{
		    //Assign first head node.
			Node n=head;
            //while used for add a new node where our last node which have a null address
			while(n.nextNode!=null){
				n=n.nextNode;
			}
		    //Here our node null in while loop then add our new node in the last position
			n.nextNode=node;
		}
	}
/**********Start Print Values Method****************************************************************/
	public void print(){
		Node node=head;
		while(node.nextNode!=null){
			System.out.println(node.dataElement);
			node=node.nextNode;
		}
	 /**Here our last node is null will be printed**/
		System.out.println(node.dataElement);
	}
/**********Start Add Node By Index Method***********************************************************/
	public void insertAtIndex(int index,int data){
		Node node=new Node();
		node.dataElement=data;
        node.nextNode=null;
     /**Here we add element at the 0 index..**/
        if(index==0){
          inserAtStart(data);
        }else{
        Node n=head;
     /**loop checking index to point a new node**/
		for(int i=0;i<index-1;i++){
			n=n.nextNode;
		}
		node.nextNode=n.nextNode;
        n.nextNode=node;
        }
	}
/**********Start IsertAtStart Node Method**********************************************************/
	public void inserAtStart(int data){
		Node node=new Node();
		node.dataElement=data;
		node.nextNode=null;
		node.nextNode=head;
		head=node;

	}
/**********Start Delete Node Method****************************************************************/
	public void delete(int index){
		if(index==0){
	    /**If index 0 then assign head to next node*/
	       head=head.nextNode;
		}else{
		   Node n=head;
		   Node n1=null;
		/**loop checking index to point a new node*/
		   for(int i=0;i<index-1;i++){
			   n=n.nextNode;
			}
		 /**hold new node address which one we want to delete*/
			n1=n.nextNode;
		 /**Assign address to next node*/
	        n.nextNode=n1.nextNode;
		}
	}


}
