import java.util.*;
class MapTest{
	public static void main(String args[]){
	List<String> list=new ArrayList<String>();
	Map<Integer ,List<String>> map=new HashMap<Integer ,List<String>>();
	list.add("Sanjay");
	Map<Integer ,String> map1=new HashMap<Integer ,String>();
	map1.put(19,"Mohsin");
	map1.put(20,"SanjayHot");
	//list.add("Hotchand");
	map.put(19,list);
	System.out.println("Using Get Method");
	System.out.println(map.get(19));
	Set set=map.entrySet();
	Iterator itr=set.iterator();
	System.out.println("Using Iterator Method");
	while(itr.hasNext()){
		Map.Entry entry=(Map.Entry)(itr.next());
		System.out.println("Key is "+entry.getKey());
		System.out.println("Values  are "+entry.getValue());	
	}
	System.out.println("Using Stream Api");
	map1.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		System.out.println("Using ForEach  Method");
		for(Map.Entry mp: map.entrySet()){
			System.out.println(mp.getKey()+"  "+mp.getValue());
		}
	
	}

}