import java.util.*;
class Students implements Comparable<Students>{
	String name;
	int age;
	Students(String name, int age){
	this.name = name;
	this.age= age;
	}
	public int compareTo(Students s){
		if(s.age==age) return 0;
		else if(age>s.age) return 1;
		else return -1;
	}
}
class TestComparable{
	public static void main(String[] args){
		Students s1 = new Students("Asad",18);
		Students s2 = new Students("Salshan",10);
		Students s3 = new Students("Sanjay",20);
		ArrayList<Students> l = new ArrayList<>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		for(Students s: l){
			System.out.println(s.name+"  "+s.age);
		}
	}
}