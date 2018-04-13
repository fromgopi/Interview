package com.example.hash;



public class HashMapDemo {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Object, Integer> hashMap = new HashMap<>(10);
		/*hashMap.put(11, 5000);
		hashMap.put(11, 9966);
		hashMap.put(528, 8888);
		hashMap.put(7, 1542);
		*///hashMap.put("asdasdasdasd", 55224444);
		String s = "sriniG";
		hashMap.display();
		System.out.println(s.hashCode());
		hashMap.get(s);
		hashMap.get(s);
		/*hashMap.display();
		hashMap.remove(4);
		System.out.println("After deleting....");
		hashMap.display();*/
		
		
	}

}
