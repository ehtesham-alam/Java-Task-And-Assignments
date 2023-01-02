import java.util.*;
class Students{
	String name;
	int age;
	Students(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	public String getName(){
		return this.name;
	}
}
class AgeComparator implements Comparator<Students>{
	public int compare(Students s1, Students s2){
		if(s1.age==s2.age){
			return new NameComparator().compare(s1,s2);
		}
		else if(s1.age>s2.age) return 1;
		else return -1;
		
	}
	
}
class NameComparator implements Comparator<Students>{
	public int compare(Students s1, Students s2){
		return s1.name.compareTo(s2.name);
	}
	
}
class TestComparator{
	public static void main(String[] args){
		ArrayList<Students> l = new ArrayList<>();
		Students s1 = new Students("Sanjay",18);
		Students s2 = new Students("Asad",10);
		Students s3 = new Students("Samad",19);
		Students s4 = new Students("Samrat",19);
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		Collections.sort(l,new AgeComparator());
		for(Students s: l){
			System.out.println(s.getAge()+" ,"+s.getName());
		}
	}
}