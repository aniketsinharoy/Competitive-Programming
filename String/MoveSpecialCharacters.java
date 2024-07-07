Complete the moveSpecialCharacters() method given in the Tester class.
Method Description
moveSpecialCharacters(String str)

Move all the special characters present in the string passed to the method to the end of the string and return the modified string.
Note: Assume that the input string does not have any space.

Test the functionalities using the main() method of the Tester class. 
Input: "He@#$llo!*&"
Output: "Hello@#$!*&"
-------------------------------------------------------------------------------------------------
class Tester{
    public static String moveSpecialCharacters(String str){
		//Implement your code here and change the return value accordingly
		String ans = "";
		String alpha = "";
		String special = "";
		for(int i=0;i<str.length();++i){
			if(str.charAt(i)>=65 && str.charAt(i)<=90 || str.charAt(i)>=97 && str.charAt(i)<=122){
				alpha = alpha.substring(0) + str.charAt(i);
			}
			else{
				special = special.substring(0)+ str.charAt(i);
			}
		}
		ans = alpha + special;
		return ans;
	}
	
	public static void main(String args[]){
	    String str = "He@#$llo!*&";
	    System.out.println(moveSpecialCharacters(str));
	}
	
}
