package com.nissan.trainingcorejava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				LinkedHashMap<Integer,String> map =new LinkedHashMap<Integer,String>(); //treeMap prints in ascending order
				map.put(100,"Rahul");
				map.put(101,"NISSAN");
				map.put(102,"Mahesh");
				map.put(102,"Jerin");//values get replaced
				
				for(Map.Entry m:map.entrySet()) {//method conversion
					System.out.println(m.getKey()+" "+m.getValue());
				}

			}

		}
