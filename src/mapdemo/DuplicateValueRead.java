package mapdemo;
import java.util.HashMap;
import java.util.Map;
public class DuplicateValueRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// give a string and given string multiple duplicate value store 
		String a= "i love my my india becouse india is a beautyfull country and nature agricaulture ";
		 
		
		// converting the string of an array 
		String arr[]=a.split(" ");
		
		Map<String,Integer> map=new HashMap();
		
		// print the Array with the help of ForEachLoop
		for(String b:arr) {
	//	System.out.println(b);	
		
		
		// counting the duplicate value 
		if(map.containsKey(b)) {
			map.put(b, map.get(b)+1);
		}
		else {
			map.put(b, 1);
		}
		System.out.print(map);
	}
	}

}
