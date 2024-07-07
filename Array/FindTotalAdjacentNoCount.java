Find and return the count of the adjacent occurrence of a number in the numbers array passed to the findTotalCount() method. Implement the logic inside findTotalCount() method.
Test the functionalities using the main method of the Tester class.

Example 1:
Input: {1,1,5,100,2,-3,0,0}
Output: 2
----------------------------------------------------------------------------------------------------------------------------------------------------------------
class Tester {
	public static int findTotalCount(int[] numbers) {
		//Implement your code here and change the return value accordingly
		int ans = 0;
		for(int i=0;i<numbers.length-1; ++i){
		    if(numbers[i]==numbers[i+1]){
		        ++ans;
		    }
		}
        return ans;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 1, 5, 100, -20, 6, 0, 0 };
		System.out.println("Count of adjacent occurrence: "+findTotalCount(numbers));
	}
} 
