package collection.mappe;

import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class TreeMapExample {
    public static void main(String[] args) {
    	
    	/*
      	//<chiave, valore>
        Map< Integer, String> treeMap = new TreeMap<>();
  
         // Adding elements
         treeMap.put( 150, "ciao");
         treeMap.put(200, "viva");
         treeMap.put(300, "hello");
         
   
         String j = treeMap.get(200);
         System.out.println(j);
     */    
        
        //CHIAVE E VALORE possono essere dello stesso tipo
        //Map<String, String> treeMapDUE = new TreeMap<>(); 
    	
    	
    	//<chiave, valore>
       Map<String, Integer> treeMap = new TreeMap<>();
       
        // Adding elements
        treeMap.put("ciao", 150);
        treeMap.put("viva", 200);
        treeMap.put("hello", 300);
        
        // nNON SI PUO FARE
  //     String f =  treeMap.get(23);
  //     System.out.println(f);
        
        int j = treeMap.get("viva");
        System.out.println(j);

        System.out.println(treeMap);
        
        
        
  /*      
        // Insieme Chiavi
        for( String f1: treeMap.keySet())
        	System.out.println("chiave:"+f1 + " valore:"+treeMap.get(f1));
  */      
        
   /*    
        
        //Insieme Valori
       for( Integer f2: treeMap.values())
        	System.out.println( " valore:"+f2);
   
    */   
       
       // Insieme Coppie Chiavi,valori
       for (Map.Entry<String, Integer> e : treeMap.entrySet()) {
       	
           System.out.println(e.getKey() + ": " + e.getValue());
       }
       
      
        
  
    	
        Map<Person, Integer> treeMap2 = new TreeMap<>();

        // Adding elements
        treeMap2.put(new Person("Antonio", "Pagano",18), 1);
        treeMap2.put(new Person("Michele", "Pagano",18), 1);
        treeMap2.put(new Person("Giovanni", "Pagano",18), 1);

        // Automatically sorted by key
        System.out.println("Sorted map:");
        for (Map.Entry<Person, Integer> entry : treeMap2.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        
    }
}

