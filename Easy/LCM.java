Implement a program to find and display the least common multiple (LCM) of two whole numbers.
Least Common Multiple (LCM) of two numbers, num1 and num2 is the smallest positive number that is divisible by both num1 and num2.

Example:
num1 = 7 | num2 = 9
LCM = 63
--------------------------------------------------------------------------------------------------------------------------------------------------------
class Tester {
	public static void main(String[] args) {
		// Implement your code here 
		int num1 = 7;
		int num2 = 9;
		int i = 2;
		while(true){
			if(i%num1 == 0 && i%num2 == 0)
			{
				System.out.println(i);
				break;
			}
			else{
				++i;
			}
		}
	}
}
