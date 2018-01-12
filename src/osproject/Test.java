package osproject;

import java.util.HashMap;

public class Test implements java.io.Serializable{
	public HashMap<String, HashMap<Integer, MutableInt>> dict = new HashMap<String, HashMap<Integer, MutableInt>>();
	public String stringValue;
	public int hashValue;
	
	public Test(){
		
	}
	
	public Test(String val){
		this.stringValue = val;
		this.hashValue = stringValue.hashCode();
	}
	
	public void updateHashMap(String bigram, Integer inode){

		
		if(dict.get(bigram)==null){
		//	System.out.println(bigram);//prints the keys created
			HashMap<Integer, MutableInt> temp = new HashMap<Integer, MutableInt>();
			temp.put(inode, new MutableInt(1));
			this.dict.put(bigram, temp);
		}
		else{
			HashMap<Integer, MutableInt> temp = dict.get(bigram);
			if(dict.get(bigram).get(inode)== null){
				temp.put(inode, new MutableInt(1));
			}
			else{
				temp.get(inode).increment();
			}
		}
	}
}
