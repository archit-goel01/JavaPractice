package com.argo;

public class Challange {
	public static String firstNonRepeatingLetter( String str ) {
	    char count[] = new char[256]; 
	    for(int i=0 ;i<str.length();i++){
	    	count[str.charAt(i)]++;
	      System.out.println(str.charAt(i));
	      //System.out.println(count[str.charAt(i)]);
	    }
	    for(char c : count) {
	    	System.out.println(c);
	    }
	    
	    int index= -1;
	    for(int j=0 ;j<str.length();j++){
	      if(count[str.charAt(j)]==1){
	        index = j;
	        return Character.toString(str.charAt(index)); 
	      }
	    }
	    return new String("");
	  }
	
	public static void main (String args []) {
		
		System.out.println(Challange.firstNonRepeatingLetter("stress"));
	}
}
