import java.util.Scanner;

public class Union2A
{
	static Node head1;	//A
	static Node head2;	//B
	static Node head3;	//Common
	static Node head4;	//All
	
	static class Node 
	{ 
		int info;
		Node link; 

		// Constructor 
		Node(int info) 
		{ 
			this.info = info;
			link = null; 
		} 
	}
	
	
	public static void main(String [] agrs)
	{
		Union2A listA = new Union2A();
		Node first = head1;
		Node second = head2;
		Node current;
		
		Scanner inp = new Scanner(System.in);

		int i = 0;
		current = first;
		int size = 5;
		while( i < size)
		{
			System.out.print("Enter Item : ");
			int item = inp.nextInt();
			
			Node new_node = new Node(item); 
			new_node.link = null;
			current = head1;
			if(current == null)
			{
				head1 = new_node;
			}
			else{
				first = head1;
				while(first.link != null){
					first = first.link;
				}first.link = new_node;
			}

			i += 1;
		}
		System.out.println("2: ");
		i = 0;
		current = second;
		while( i < size)
		{
			System.out.print("Enter Item : ");
			int item = inp.nextInt();
			
			Node new_node = new Node(item); 
			new_node.link = null;
			current = head2;
			if(current == null)
			{
				head2 = new_node;
			}
			else{
				first = head2;
				while(first.link != null){
					first = first.link;
				}first.link = new_node;
			}

			i += 1;
		}
		//Common
		Node current1 = head1;
		Node current2 = head2;
		while(current1 != null){
			current2 = head2;
			while(current2 != null){
				if(current2.info == current1.info){
					Node new_node = new Node(current1.info);
					new_node.link = null;
					first = head3;
					if(first == null){
						head3 = new_node;
					}else{
					while(first.link != null){
						first = first.link;
						}first.link = new_node;
					}
				}
				current2 = current2.link;
			}
			current1 = current1.link;
		}
		
		//Union
		current = head1;
		do{
			Node new_node = new Node(current.info);
			new_node.link = null;
			current1 = head4;
			if(current1 == null){
				head4 = new_node;
			}else{
				while(current1.link != null){
					current1 = current1.link;
				}current1.link = new_node;
			}
			current = current.link;			
		}while(current != null);
		
		//2nd linkedlist item append 
		current = head2;
		while(current != null){
			current1 = head4;
			int found = 0;
			while(current1 != null){
				if(current1.info == current.info){
					found += 1;
				}
				current1 = current1.link;
			}
			if(found == 1){
				Node new_node = new Node(current.info);
				new_node.link = null;
				current.link = new_node;
			}
			
			current = current.link;
		}

		
		System.out.print("\nA : ");		
		current = head1;
		while (current != null)
		{
			System.out.print(current.info + " -> ");
			current = current.link;
		}
		System.out.print("\nB : ");
		current = head2;
		while (current != null)
		{
			System.out.print(current.info + " -> ");
			current = current.link;
		}
		System.out.print("\nCommon : ");
		current = head3;
		while (current != null)
		{
			System.out.print(current.info + " -> ");
			current = current.link;
		}
		System.out.print("\n----   : ");
		current = head4;
		while (current != null)
		{
			System.out.print(current.info + " -> ");
			current = current.link;
		}
		
	}

}//end of Union2A  class