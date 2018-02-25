package com.practice.after2017.traveloka.interview;

public class IndexOfImplementation {
	int indexOf(String a, String b) {
	    if(a.equals("") || !a.contains(b)) return -1;
	    if(b.equals("")) return 0;
	    int lenA = a.length();
	    int lenB = b.length();
	    
	    for(int i = 0, j = 0; i < lenA; i++) {
	        if(a.charAt(i) == b.charAt(j)) {
	            int currI = i;
	            while(currI <= lenA - 1 
	            && j <= lenB - 1
	            && a.charAt(currI) == b.charAt(j)) {
	                currI++;
	                j++;
	            }
	            if(j == lenB) {
	                return i;
	            } else {
	                j = 0;
	            }
	        }
	    }
		return -1;
	}

//	indexOf("abcdef", "de") -> 3
//	indexOf("abc", "cd") -> -1
//	indexOf("abc", "") -> 0
//	indexOf("", "a") -> -1

	private char WILDCARD = '*';

	private boolean containsPatternNotWorking(String a, String b) {
	    if(a.equals("")) return false;
	    if((a.equals("") && b.equals("")) || b.equals("")) return true;
	    if(indexOf(a,b) != -1) return true;
	    int lenA = a.length();
	    int lenB = b.length();
	    for(int i = 0, j = 0;i < lenA; i++) {
	        if(a.charAt(i) == b.charAt(j) 
	           || b.charAt(j) == WILDCARD) {
	           
	            int currI = i;
	            while(currI <= lenA - 1 
	                   && j <= lenB - 1) { 
	            
	            if(a.charAt(currI) == b.charAt(j)) {
	               j++;
	               currI++;
	            } else if (b.charAt(j) == WILDCARD) {
	               currI++;
	            } else {
	               break;
	            }
	            
	            //to break out of wildcard condition
	            if(a.charAt(currI) == b.charAt(j+1)) {
	               j++;
	            }
	            
	            if(j == lenB) {
	                return true;
	            } else {
	                j = 0;
	            }
	        }
	    }
	    }
		return false;
	}

	private boolean containsPattern(String a, String b) {
	    if(a.equals("")) return false;
	    if((a.equals("") && b.equals("")) || b.equals("")) return true;
	    if(indexOf(a,b) != -1) return true;
	    if(a.length() < b.length()) return false;
	    
	    String[] partitioned = b.split(""+WILDCARD);
	    if(partitioned[0] == "") {
	    	return indexOf(a, partitioned[1]) != 1; 
	    }
	    
	    if(partitioned[1] == "") {
	    	return indexOf(a, partitioned[0]) != 1; 
	    }
	    int firstIdx = indexOf(a, partitioned[0]);
	    int secondIdx = a.lastIndexOf(partitioned[1]);
	    if((firstIdx <  secondIdx) && (firstIdx + partitioned[0].length() < secondIdx)) {
	       return true;
	    }
	    return false;
	}


//	"*" -> can replace 1 or more characters
//	containsPattern("abcdef", "b*e") -> true
//	containsPattern("abcdef", "*cd") -> true
//	containsPattern("abcdef", "cd*") -> true
//	containsPattern("abcdef", "b*e*") -> invalid case, no need to handle this
//	containsPattern("", "") -> true
//	containsPattern("abcecdef", "*cd") -> true
//	containsPattern("abcecdef", "a*cd") -> true
//	containsPattern("cdcdabcecdef", "a*cd") -> true
//	containsPattern("bbbbaaaaa", "aaa*aaa") -> false
//	containsPattern("bbbbaaaaa", "aa*aaa") -> false
//	containsPattern("bbbbaaaaa", "aa*aa") -> true

}
