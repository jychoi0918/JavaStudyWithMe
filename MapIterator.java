package sist.com.util;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterator {

 public static void mapIteration() {
    
    Map<String, String> map = new HashMap<String, String>();
    map.put("key1", "value01");  //map : put ���� �� �߰�
    map.put("key2", "value02");
    map.put("key3", "value03");
    map.put("key4", "value04");
    map.put("key5", "value05");
    
    //��� 01 : entrySet 
    //  Entry��� �������̽�                                                    entrySet() : key �� value ¦���� ��µǴ� �迭
    for(Map.Entry<String, String> entry : map.entrySet()) {
       System.out.println("[key] :"+entry.getKey()+", [value] :"+entry.getValue());
    }
    
    System.out.println();
    
    //��� 02 : keySet
    for(String key : map.keySet()) {
       String value = map.get(key);
       System.out.println("[key] :"+key+", [value] :"+value);
         }
    System.out.println();
	
    //��� 03 : entrySet().iterator()
    Iterator<Map.Entry<String,String>> i = map.entrySet().iterator();
    while(i.hasNext()) {
    	Map.Entry<String, String> entry = (Map.Entry<String, String>)i.next();
    	String key = entry.getKey();
    	String value = entry.getValue();
    	System.out.println("[key] :"+key+", [value] :"+value);    	
    }
    
    System.out.println();
    
   //��� 04 : keySet().iterator();         
   //map���� ketSet(): Ű���� ��� �޼ҵ� 
    Iterator<String> k = map.keySet().iterator();
    while(k.hasNext()) {
    	String key = k.next();
    	String value = map.get(key);       
   //get(key) : key���� ������ value ���� ��� �޼ҵ�
    
    	System.out.println("[key] :"+key+", [value] :"+value);    	
		
    	
    }
    
    
 	}
 
 	public static void main(String[] args) {
 		mapIteration();
 		
 		
	}
 
}
