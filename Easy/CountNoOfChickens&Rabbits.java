Implement a program to find the number of rabbits and chickens in a farm. Given the number of heads and legs of the chickens and rabbits in a farm, identify and display the number of chickens and rabbits in the farm.
If the given input cannot make a valid number of rabbits and chickens, then display an appropriate message.

Example 1:
Heads: 150 | Legs: 500
Ans: Chickens: 50 | Rabbits: 100
-------------------------------------------------------------------------------------------------------------------------------------------------------------
class Tester {
	public static void main(String[] args) {
		// Implement your code here 
		int heads = 150;
		int legs = 500;
		int totalLegs=0;
		int rabbits=0, chickens;
		for (chickens = 0; chickens <= heads; chickens++) {
            rabbits = heads - chickens;
            totalLegs = 2 * chickens + 4 * rabbits;
			if (totalLegs == legs) {
				System.out.println("Chickens: " + chickens + ", Rabbits: " + rabbits);
				break;
			}
		}
		if(totalLegs != legs){
			System.out.println("The numbers of chicken and rabbits can't be found");
		}
	}
}
