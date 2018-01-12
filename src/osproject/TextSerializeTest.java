package osproject;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TextSerializeTest {

	public static void main(String[] args) throws EOFException, FileNotFoundException, IOException{
		Test test = new Test();
		//long begin = System.currentTimeMillis();
		Scanner input = new Scanner(new File("temp/War_and_Peace.txt"));
		while(input.hasNextLine()){
		setHash(input.nextLine(), 60, test);
		}
		input = new Scanner(new File("temp/Iliad"));
		while(input.hasNextLine()){
		setHash(input.nextLine(), 70, test);
		}
		input = new Scanner(new File("temp/Moby_Dick"));
		while(input.hasNextLine()){
		setHash(input.nextLine(), 80, test);
		}
		input = new Scanner(new File("temp/SherlockHolmes"));
		while(input.hasNextLine()){
		setHash(input.nextLine(), 90, test);
		}
		input = new Scanner(new File("temp/Dracula"));
		while(input.hasNextLine()){
		setHash(input.nextLine(), 100, test);
		}
		input = new Scanner(new File("temp/Frankenstein"));
		while(input.hasNextLine()){
		setHash(input.nextLine(), 1100, test);
		}
		
		long begin = System.currentTimeMillis();
		

		String stringToTest = "Sherlock Holmesziz";//is ithave is some test textaaa  abacadaeafagahaiajakalaoamanaoapaqarasatauavawaxayazhttps://www.google.com/search?bhttps://www.google.com/search?biw=1855&bih=860&ei=TpgYWrWKJ8q_jwS6opvgCQ&q=random+gibberish+text+without+punctuation&oq=random+gibberish+text+without+punct&gs_l=psy-ab.3.0.33i21k1.1995.5344.0.8454.22.18.0.0.0.0.236.2137.3j8j3.14.0....0...1.1.64.psy-ab..8.11.1666...0i22i30k1j33i160k1.0.zLP9eCP2wUshttps://www.google.com/search?biw=1855&bih=860&ei=TpgYWrWKJ8q_jwS6opvgCQ&q=random+gibberish+text+without+punctuation&oq=random+gibberish+text+without+punct&gs_l=psy-ab.3.0.33i21k1.1995.5344.0.8454.22.18.0.0.0.0.236.2137.3j8j3.14.0....0...1.1.64.psy-ab..8.11.1666...0i22i30k1j33i160k1.0.zLP9eCP2wUsiw=1855&bih=860&ei=TpgYWrWKJ8q_jwS6opvgCQ&q=random+gibberish+text+without+punctuation&oq=random+gibberish+text+without+punct&gs_l=psy-ab.3.0.33i21k1.1995.5344.0.8454.22.18.0.0.0.0.236.2137.3j8j3.14.0....0...1.1.64.psy-ab..8.11.1666...0i22i30k1j33i160k1.0.zLP9eCP2wUs";
		String[] stringArr = new String[stringToTest.length()-1];
		for(int i = 1 ; i < stringToTest.length(); i++){
			stringArr[i-1] = stringToTest.charAt(i-1) + "" +  stringToTest.charAt(i);
		}
		
		boolean hasAtLeastOneFile = true;
		Set workingSet = test.dict.get(stringArr[0]).keySet();
		Set setOfInodes = test.dict.get(stringArr[0]).keySet();
		
		
		if(stringArr.length==1){
			if(test.dict.get(stringArr[0]) != null){
				System.out.println("String has length 2" + setOfInodes);
			}
			else{
				System.out.println("the set of files does not contain this string.");
			}
		}
		else{
			for(int i = 0; i < stringArr.length & hasAtLeastOneFile; i++){
				

			
				if(test.dict.get(stringArr[i]) != null){
					setOfInodes = test.dict.get(stringArr[i]).keySet();
					System.out.println("current set " + setOfInodes + " and " + "working set" + workingSet);
					
					//ArrayList added to prevent concurrent exception for set
					ArrayList list = new ArrayList<Integer>();
					Iterator it2 = workingSet.iterator();
					for(int x = 0; x < workingSet.size(); x++){
						list.add(it2.next());
					}
					Iterator it = list.iterator();
					
					while(it.hasNext() & hasAtLeastOneFile){
						int f = (int)it.next();
						if(!setOfInodes.contains(f)){
							workingSet.remove(f);
							if(workingSet.isEmpty()){
								hasAtLeastOneFile = false;
							}
						}
					}
				}
				//the current bigram is contained nowhere
				else{
					workingSet.clear();
				}
				
				//all of these sets need to be returned and ANDed
			//	if(test.dict.get(stringArr[i]) != null){
					//System.out.println("contains " + stringArr[i] + " " + test.dict.get(stringArr[i]).keySet());
				//}
			}
		}
		System.out.println("total set of inodes is " + workingSet);
		
		//ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("writetofile.dat"));
		//output.writeObject(test);

		System.out.println(System.currentTimeMillis()-begin);
		/*
		try {
			BufferedReader reader = new BufferedReader(new FileReader("War_and_Peace.txt"));
			System.out.print("a");
			System.out.println(reader.readLine());
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/


	}

	private static void setHash(String string, int inode, Test map){
		for(int i = 1; i < string.length(); i++){
			String temp = string.charAt(i-1) + "" +  string.charAt(i);
			map.updateHashMap(temp, inode);
		}
		
	}
	
	
	
	
}
