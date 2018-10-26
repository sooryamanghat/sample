package com.nissan.trainingcorejava;
import java.util.*;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map =new HashMap<Integer,String>();
		map.put(100,"Rahul");
		map.put(101,"NISSAN");
		map.put(102,"Mahesh");
		map.put(102,"Jerin");//values get replaced
		
		for(Map.Entry m:map.entrySet()) {//method conversion
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
