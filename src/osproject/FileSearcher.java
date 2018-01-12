package osproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FileSearcher {

	public static void main(String[] args) throws IOException {

		long begin = System.currentTimeMillis();
		
		File file = new File("temp");
		File[] list = file.listFiles();
		
		ArrayList<File[]> dirList = new ArrayList<File[]>();
		ArrayList<File> fileList= new ArrayList<File>();
		
		for(int i = 0; i < list.length; i++){
			if(list[i].isDirectory()){
				dirList.add(list[i].listFiles());
			}
			else{
				fileList.add(list[i]);
			}
		}
		
		for(File[] fr: dirList){
			for(File f: fr){
				fileList.add(f);
			}
		}	
		
		for(File f: fileList){
			System.out.println(f);
		}

		System.out.println( fileList.size() + " files");
		
		Test test = new Test();
		test = goToInsert(test, fileList);
		//ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("BigramDictionary2.dat"));
		//output.writeObject(test);

		System.out.println(System.currentTimeMillis()-begin + " milliseconds");
		
	

	}
	
	public static Test goToInsert(Test test, ArrayList<File> fileList) throws FileNotFoundException{
		Scanner input;
		int counter = 0;
		for(File file:fileList){
			input = new Scanner(file);
			System.out.println(file + "" + counter);
			while(input.hasNextLine()){
				setHash(input.nextLine(), counter, test);
			}
			counter++;
		}
		return test;
	}
	
	
	private static void setHash(String string, int inode, Test map){
		for(int i = 1; i < string.length(); i++){
			String temp = string.charAt(i-1) + "" +  string.charAt(i);
			map.updateHashMap(temp, inode);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void findFile(File file){
		File[] fileList = file.listFiles();
		
		if(fileList!=null){
			for(File f: fileList){
				if(!f.isDirectory()){
					//findFile(f);
				}
			}
		}
	}

}
