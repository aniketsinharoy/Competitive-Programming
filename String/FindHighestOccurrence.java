Complete the findHighestOccurrence() method given in the Tester class.

Method Description
findHighestOccurrence(String str)
Find the count of the highest occurring character in the string passed to the method and return the count.
Test the functionalities using the main() method of the Tester class. 

Sample Input and Output
Input: "success"
Output: 3
-------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;
class Tester {
	public static int findHighestOccurrence(String str){
		//Implement your code here and change the return value accordingly
        char[] charrArray = str.toCharArray();
		Arrays.sort(charrArray);
		System.out.println(Arrays.toString(charrArray));
		int max = 0;
		int temp = 0;
		char tempChar = charrArray[0];
		for(int i=0;i<charrArray.length;++i){
			if(tempChar == charrArray[i])
			{
				++temp;
			}
			else if(max < temp)
			{
				max = temp;
				temp = 0;
				++temp;
				tempChar = charrArray[i];
			}
			else{
				temp = 0;
				++temp;
				tempChar = charrArray[i];
			}
		}
		return max;
	}
	
	public static void main(String args[]){
	    String str = "success";
	    System.out.println(findHighestOccurrence(str));
	}
}
