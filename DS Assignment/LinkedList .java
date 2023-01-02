import java.io.*; 
import java.util.*;

// Java program to implement 
// a Singly Linked List 
 class LinkedList { 

	Node head; // head of list 

	static class Node { 
	
		String name; 
		int age;
		double salary;
		Node link; 

		// Constructor 
		Node(String name, int age, double salary) 
		{ 
			this.name = name;
			this.age = age;
			this.salary = salary;
			link = null; 
		} 
	} 
	
	
	public static LinkedList sort(LinkedList list)
	{
		Node current = list.head; 
		int i = 0;
		do{
			i += 1;
			current = current.link;
		}while (current != null);
		System.out.println(i);
		
		
		while( i != 0)
		{
			current = list.head;			
			int j = i;
			while (j != 1)
			{
				Node n1 = current;
				Node n2 = current.link;
				int check = n1.name.compareTo(n2.name);
				System.out.println("Before : " + check + n1.name + n2.name);
				if (check > 0)
				{
					String name = n1.name;
					int age = n1.age;
					double salary = n1.salary;
					
					n1.name = n2.name;
					n1.age = n2.age;
					n1.salary = n2.salary;
					
					n2.name = name;
					n2.age = age;
					n2.salary = salary;				
				}
				System.out.println("After : " + check + n1.name + n2.name);

				current = current.link;
				j--;
			}
			
			i--;
		}
		
		
		
		/*
		bakro
		oil 1.5
		5/6 rice
		2 onion
		2 briyani 
		*/
		
		
		return list;
	}
	
	public static LinkedList insert(LinkedList list, String name, int age, double salary) 
    { 
        Node new_node = new Node(name, age, salary); 
        new_node.link = null; 

		if (list.head == null) { 
            list.head = new_node; 
        } 
        else {
			Node last = list.head; 
            while (last.link != null) { 
                last = last.link; 
            }
			last.link = new_node; 
        }   
        return list; 
    } 
	
	
	// Driver code 
	public static void main(String[] args) 
	{ 
		Scanner inp = new Scanner(System.in);
		/* Start with the empty list. */
		LinkedList list = new LinkedList(); 
		for(int i = 1; i < 7; i++){
			System.out.println("Enter Record for " + i + " person: ");
			System.out.print("Name    : ");
			String name = inp.next();
			System.out.print("Age     : ");
			int age = inp.nextInt();
			System.out.print("Salary  : ");
			double salary = inp.nextDouble();
			list = insert(list, name, age, salary);
		}
		//Sort the linked list method or class, don't know ;P 
		list = sort(list);
		Node current = list.head;
		System.out.println();
		while(current != null)
		{
			System.out.println(current.name + " " +current.age+ " "+current.salary);
			current = current.link;
		}
		
		
	} 
} 
