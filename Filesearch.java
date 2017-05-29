package test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Try1 {
	
	 public static List<File> listf(String destpath) {
		 //System.out.println("enters here");
	        File directory = new File(destpath);

	        List<File> resultList = new ArrayList<File>();

	        // get all the files from a directory
	        File[] fList = directory.listFiles();
	   
	        //resultList.addAll(Arrays.asList(fList));
	        for(File file1 : fList){
	        	if(!file1.isHidden())
	        		resultList.add(file1);
	        }
	        for (File file : fList) {
	        	if (file.isFile()) {
	            	
	                //System.out.println(file.getAbsolutePath());
	            } else if (file.isDirectory()) {
	                resultList.addAll(listf(file.getAbsolutePath()));
	            }
	        	
	        }
	        //System.out.println(fList);
	       
	        return resultList;
	       
	    } 
	
       public static void main(String[] args) {
    	   List<File> resultList = new ArrayList<File>();

		String srcpath="/Users/aravindh/Desktop/compare1/";
		String destpath="/Users/aravindh/Desktop/compare2/config/ivrconfig/TH/";
		File[] srcfile=new File(srcpath).listFiles();
		Try1 t=new Try1();
		resultList=t.listf(destpath);
		for(int i=1;i<srcfile.length;i++){
			if(!srcfile[i].isHidden()){
			//System.out.println(srcfile[i].getName());
			for(int j=0;j<resultList.size();j++){
				if(srcfile[i].getName().equals(resultList.get(j).getName())){
				System.out.println(srcfile[i].getName()+"=="+resultList.get(j));
				}
			}
			}
		}
		
		
	}
}
