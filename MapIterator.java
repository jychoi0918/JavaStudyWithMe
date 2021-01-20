package sist.com.util;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterator {

 public static void mapIteration() {
    
    Map<String, String> map = new HashMap<String, String>();
    map.put("key1", "value01");  //map : put 으로 값 추가
    map.put("key2", "value02");
    map.put("key3", "value03");
    map.put("key4", "value04");
    map.put("key5", "value05");
    
    //방법 01 : entrySet 
    //  Entry라는 인터페이스                                                    entrySet() : key 와 value 짝으로 출력되는 배열
    for(Map.Entry<String, String> entry : map.entrySet()) {
       System.out.println("[key] :"+entry.getKey()+", [value] :"+entry.getValue());
    }
    
    System.out.println();
    
    //방법 02 : keySet
    for(String key : map.keySet()) {
       String value = map.get(key);
       System.out.println("[key] :"+key+", [value] :"+value);
         }
    System.out.println();
	
    //방법 03 : entrySet().iterator()
    Iterator<Map.Entry<String,String>> i = map.entrySet().iterator();
    while(i.hasNext()) {
    	Map.Entry<String, String> entry = (Map.Entry<String, String>)i.next();
    	String key = entry.getKey();
    	String value = entry.getValue();
    	System.out.println("[key] :"+key+", [value] :"+value);    	
    }
    
    System.out.println();
    
   //방법 04 : keySet().iterator();         
   //map에서 ketSet(): 키값을 얻는 메소드 
    Iterator<String> k = map.keySet().iterator();
    while(k.hasNext()) {
    	String key = k.next();
    	String value = map.get(key);       
   //get(key) : key값을 넣으면 value 값을 얻는 메소드
    
    	System.out.println("[key] :"+key+", [value] :"+value);    	
		
    	
    }
    
    
 	}
 
 	public static void main(String[] args) {
 		mapIteration();
 		
 		
	}
 
}
