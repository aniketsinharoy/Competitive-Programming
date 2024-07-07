Implement a program to check whether a given number is an Armstrong number.
An Armstrong number is an n-digit number that is equal to the sum of the nth powers of its individual digits.

E.g.: 371 is an Armstrong number as 33 + 73 + 13=371
1634 is an Armstrong number as 1^4 + 6^4 + 3^4+ 4^4=1634
----------------------------------------------------------------------------------------------------------------------
class Tester {
	public static void main(String[] args) {
		// Implement your code here 
		int number = 1635;
		int remender, originalNumber = number;
		int sum=0;
		int count = 0;
		while(number>0)
		{
			++count;
			number/=10;
		}
		number = originalNumber;
		while(number>0)
		{
			remender = number%10;
			sum=sum + (int) Math.pow(remender, count);
			number/=10;
		}
		if(originalNumber==sum)
		{
			System.out.println(originalNumber+" is an Armstrong number");
		}
		else{
			System.out.println(originalNumber+" is not an Armstrong number");
		}
	}
}
