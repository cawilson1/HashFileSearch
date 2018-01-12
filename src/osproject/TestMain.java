package osproject;

import java.util.HashMap;

public class TestMain {

	public static void main(String[] args) {
		System.out.println("aa".hashCode());
		System.out.println("av".hashCode());

	
	//	HashMap<String, HashMap<Integer, Integer>> dict = new HashMap<String, HashMap<Integer, Integer>>();
	//	if(dict.get("ab")==null){
	//	HashMap<Integer, Integer> temp1 = new HashMap<Integer, Integer>();
	//	temp1.put(500, 9);
	//	dict.put("ab", temp1);


		
	//	HashMap<Integer, Integer> temp = dict.get("ab");
	//	System.out.println(temp.get(500));
		Test test = new Test();
		//HashMap<String, HashMap<Integer, Integer>> dict = test.dict;
		test.updateHashMap("ab", 500);
		test.updateHashMap("ab", 500);
		test.updateHashMap("ab", 500);
		//System.out.println(test.dict.get(600)==null);
		test.updateHashMap("ab", 600);
		test.updateHashMap("zZ", 500);
		test.updateHashMap("in", 12);
		System.out.println(test.dict.get("ab").get(500).value + " " + test.dict.get("ab").get(600).value);
		System.out.println(test.dict.get("zZ").get(500).value);
		
	}

}
