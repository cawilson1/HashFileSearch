package osproject;

public class MutableInt implements java.io.Serializable{

	public int value;
	
	public MutableInt(int integer){
		this.value = integer;
	}
	
	public void increment(){
		this.value++;
	}
	
}
