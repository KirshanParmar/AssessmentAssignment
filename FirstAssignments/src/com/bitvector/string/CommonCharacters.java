package com.bitvector.string;

public class CommonCharacters {

	private static boolean findCommonCharacter(String s1, String s2) {
		int checker=0;

		for(int i=0;i<s1.length();i++){
            int charToIntS1=(s1.charAt(i)-'a');
            if((checker&(1<<charToIntS1))>0)
             	return true;
             checker |=(1<<charToIntS1);
		}
		for(int j=0;j<s2.length();j++){
			if((checker&(1<<s2.charAt(j)-'a'))>0)
	        	System.out.println("Common Characters: " +s2.charAt(j));
		}
		return false;
	}
	public static void main(String []args){
        String s1="kirshan";
        String s2="kumar";
        findCommonCharacter(s1,s2);
	}

}
