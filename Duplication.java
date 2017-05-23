package test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Properties;
import java.util.Scanner;
import java.util.TreeSet;

public class Duplication {
    public static void main(String[] args) throws IOException {
    	LinkedHashSet<String> hs=new LinkedHashSet<String>();
		String line;
		String []c=new String[10000];

	    try {

	        BufferedReader bufferreader = new BufferedReader(new FileReader("src/test/duplication.properties"));
	        line = bufferreader.readLine();

	        while (line != null) {     
	          //do whatever here 
	            
	           // System.out.println(line);
	        	String b=line.substring(line.lastIndexOf("=")+1);
	            //System.out.println(b);
	    		
	    		CharSequence obj = ",";
	    		if(b.contains(obj)){
	    			c=b.split(",");
	    		
	    		for(String s:c)
	    			hs.add(s);
	    		}
	    		else
	    			hs.add(b);
	    		
	    		line = bufferreader.readLine();
	            
	        }

	    } catch (FileNotFoundException ex) {
	        ex.printStackTrace();
	    } catch (IOException ex) {
	        ex.printStackTrace();
	    }
	    Iterator iter = hs.iterator();
	    while (iter.hasNext()) {
	        System.out.println(iter.next());
	    }	
	}
}
