package com.example.arrays;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TopKFrequent {

	List<Integer> find(int nums[], int k){
		List<Integer> res = new  LinkedList<Integer>();
		Map<Integer, Integer> map = new HashMap<>();
		for(int n : nums){
			map.put(n, map.getOrDefault(n,0)+1);
		}
		List<Integer>[] bucket = new List[nums.length + 1];
		for(int i : map.keySet()){
			int freq = map.get(i);
			//System.out.println(freq + " , " + i);
			if(bucket[freq] == null){
				bucket[freq] = new LinkedList<>();
			}
			bucket[freq].add(i);
		}
		
		for(int i=bucket.length-1;i>0 && k>0;i--){
			if(bucket[i] != null){
				List<Integer> list = bucket[i];
				res.addAll(list);
				k -= list.size();
			}
		}
		return res;
	}
}
