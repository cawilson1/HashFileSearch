package osproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class CommandLineTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		

		long begin = System.currentTimeMillis();
		
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("writetofile.dat"));
		Test test = (Test)input.readObject();
		
		String stringToTest = "Sherlock Holmeszbiz";//is ithave is some test textaaa  abacadaeafagahaiajakalaoamanaoapaqarasatauavawaxayazhttps://www.google.com/search?bhttps://www.google.com/search?biw=1855&bih=860&ei=TpgYWrWKJ8q_jwS6opvgCQ&q=random+gibberish+text+without+punctuation&oq=random+gibberish+text+without+punct&gs_l=psy-ab.3.0.33i21k1.1995.5344.0.8454.22.18.0.0.0.0.236.2137.3j8j3.14.0....0...1.1.64.psy-ab..8.11.1666...0i22i30k1j33i160k1.0.zLP9eCP2wUshttps://www.google.com/search?biw=1855&bih=860&ei=TpgYWrWKJ8q_jwS6opvgCQ&q=random+gibberish+text+without+punctuation&oq=random+gibberish+text+without+punct&gs_l=psy-ab.3.0.33i21k1.1995.5344.0.8454.22.18.0.0.0.0.236.2137.3j8j3.14.0....0...1.1.64.psy-ab..8.11.1666...0i22i30k1j33i160k1.0.zLP9eCP2wUsiw=1855&bih=860&ei=TpgYWrWKJ8q_jwS6opvgCQ&q=random+gibberish+text+without+punctuation&oq=random+gibberish+text+without+punct&gs_l=psy-ab.3.0.33i21k1.1995.5344.0.8454.22.18.0.0.0.0.236.2137.3j8j3.14.0....0...1.1.64.psy-ab..8.11.1666...0i22i30k1j33i160k1.0.zLP9eCP2wUs";
		
		Set workingSet = searchHash(test, stringToTest);
		

		
		System.out.println("total set of inodes is " + workingSet);
		System.out.println(System.currentTimeMillis()-begin);

	}
	
	public static Set searchHash(Test test, String stringToTest){
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
				
			}
		}
		return workingSet;
	}

}
