package com.example.hash;

public class HashMap<K, V> {
	
	private HashNode<K, V>[] table;
	private int cap;
	
	@SuppressWarnings("unchecked")
	public HashMap(int bucket) {
		// TODO Auto-generated constructor stub
		this.cap = bucket;
		table = new HashNode[cap];
//		System.out.println(table.length);
	}
	
	void put(K newKey, V val){
		if(newKey == null){
			return;
		}
		int hash = hash(newKey);
//		System.out.println("The hash code " + hash);
		HashNode<K, V> newHashNode = new HashNode<K,V>(newKey, val);
		if(table[hash] == null){
			table[hash] = newHashNode;
		}
		else{
			HashNode<K,V> previous = null;
	           HashNode<K,V> current = table[hash];
	           
	           while(current != null){ 
	           if(current.key.equals(newKey)){           
	               if(previous==null){  
	                     newHashNode.next=current.next;
	                     table[hash]=newHashNode;
	                     System.out.println("Hash For table " + hash);
	                     return;
	               }
	               else{
	                   newHashNode.next=current.next;
	                   previous.next=newHashNode;
	                   return;
	               }
	           }
	           previous=current;
	             current = current.next;
	         }
	         previous.next = newHashNode;
	        }
	}

	private int hash(K newKey) {
		// TODO Auto-generated method stub
		//System.out.println("Hash Code = " + newKey.hashCode());
		int h = (newKey.hashCode())%cap;

		System.out.println("h = " + h);

		if(h < 0){
			return h*(-1);
		}
		//System.out.println(newKey.hashCode()+"%"+cap + " = " + h);
		return h;
	}
	
	void display(){
		for(int i=0;i<cap;i++){
			if(table[i] != null){
				HashNode<K, V> node = table[i];
				while(node != null){
					System.out.print("{"+node.key+" = "+node.val+"}");
					node = node.next;
				}
				System.out.println();
			}
		}
	}
	
	
	V get(K key){
		int hash = hash(key);				
		HashNode<K, V> temp = table[hash];
		if(table[hash] == null){
			return null; 
		}
		else{
			while(temp != null){
				if(temp.key.equals(key)){
					return temp.val;
				}
				temp = temp.next;
			}
		}
		return null;
	}
	
	boolean remove(K key){
		int hash = hash(key);
		if(table[hash] == null){
			return false;
		}
		else{
			HashNode<K, V> prev = null;
			HashNode<K, V> current = table[hash];
			while(current != null){
				if(current.key.equals(key)){
					if(prev == null){
						table[hash] = table[hash].next;
						return true;
					}
					else{
						prev.next = current.next;
						return true;
					}
				}
				prev = current;
				current = current.next;
			}
		}
		return false;
	}
}
