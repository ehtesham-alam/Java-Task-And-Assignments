import java.util.Scanner;

public class Move
{	public static Node head;
	
	static class Node{
		int info;
		Node link;
		
		Node(int info){
			this.info = info;
			link = null;
		}
	}

	public static Move insert(Move list, int info){
		Node new_node = new Node(info);
		new_node.link = null;
		
		if(list.head == null){
			list.head = new_node;
		}else{
			Node current = list.head;
			
			while(current.link != null){
				current = current.link;
			}current.link = new_node;
		}
		return list;
	}
	
	public static Move swap(Move list, int info, int k){
		Node current = list.head;
		Node p = current;
		int match = info;
		int flag = 0;
		
		while(current != null){
			if(current.info == match){
				flag = 1;
				p.link = current.link; //remove the link 
			}
			p = current;
			current = current.link;
		}
		current = list.head;
		Node temp2 = current;
		while(k != 0){
			temp2 = current;
			current = current.link;
			k -= 1;
		}
		Node temp = new Node(match);
		temp2.link = temp;
		temp.link = current;
		
		System.out.println(flag);
		
		
		
		return list;
	}
	
	public static void main(String [] args){
		Move list = new Move();
		Scanner inp = new Scanner(System.in);
		
		for ( int i = 1; i < 10; i++){
			System.out.print("Enter " + i + " item : ");
			int info = inp.nextInt();
			list = insert(list, info);
		}
		Node current = list.head;
		while(current != null){
			System.out.print(current.info + " -> ");
			current = current.link;
		}
		System.out.println();
		System.out.print("Select info : ");
		int info = inp.nextInt();
		System.out.print("Move to : ");
		int k = inp.nextInt();
		
		list = swap(list, info, k);

		current = list.head;
		while(current != null){
			System.out.print(current.info + " -> ");
			current = current.link;
		}

		}
}//end of Move class