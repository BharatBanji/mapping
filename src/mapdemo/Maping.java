package mapdemo;
import java.util.Map;
import java.util.HashMap;

	
public class Maping {        

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // there are three type to initialization of the map
	  //this is first type of in initialize
	  Map map=new HashMap();
      
	  //this is second type of initialize
	  
	  Map<Integer,String> map1=new HashMap();
	  
	 // this is third type of the initialize
	  
	  Map<Integer,String> map2=new HashMap<Integer,String>(); 
	  
	  //Duplicate value Store allowed
	 //Multiple null value allowed
	  
	  map1.put(01, "Bharat");
      map1.put(02, "Banji");
      map1.put(03, "Baliyan");
      map1.put(04, "Om");
      map1.put(05, "Pal");
      map1.put(06, "Master");
      map1.put(07, "Banji2");
      map1.put(8, "Baliyan2");
      
      //print the keys and values
      
      System.out.print(map);

      
      
      //print the keys only with the help of forEachLoop
    	 for(Integer key:map1.keySet()) {
    		 System.out.print(key);
    	 }
      }
	}


