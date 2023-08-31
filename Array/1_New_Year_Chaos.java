It is New Year's Day and people are in line for the Wonderland rollercoaster ride. Each person wears a sticker indicating their initial position in the queue from  to . Any person can bribe the person directly in front of them to swap positions, but they still wear their original sticker. One person can bribe at most two others.

Determine the minimum number of bribes that took place to get to a given queue order. Print the number of bribes, or, if anyone has bribed more than two people, print Too chaotic.

Example
q=[1,2,3,5,4,6,7,8]
If person 5 bribes person 4, the queue will look like this:[1,2,3,5,4,6,7,8] . Only 1 bribe is required. Print 1.
q=[4,1,2,3]
Person 4 had to bribe 3 people to get to the current position. Print Too chaotic.

Function Description
Complete the function minimumBribes in the editor below.
1. minimumBribes has the following parameter(s):
2. int q[n]: the positions of the people after all bribes

Returns
No value is returned. Print the minimum number of bribes necessary or Too chaotic if someone has bribed more than  people.

Input Format
The first line contains an integer t, the number of test cases.
Each of the next t pairs of lines are as follows:
- The first line contains an integer t, the number of people in the queue
- The second line has n space-separated integers describing the final state of the queue.

Sample Input

STDIN       Function
-----       --------
2           t = 2
5           n = 5
2 1 5 3 4   q = [2, 1, 5, 3, 4]
5           n = 5
2 5 1 3 4   q = [2, 5, 1, 3, 4]

Sample Output
3
Too chaotic

Solution:

class Result 
{
    public static void minimumBribes(List<Integer> q) 
    {
        int total_bride=0;
        int first_pos=1;
        int second_pos=2;
        int third_pos=3;
        int flag=0;
        for (int i=0;i<q.size();++i) 
        {
            if(q.get(i)==first_pos)
            {
                first_pos=second_pos;
                second_pos=third_pos;
                ++third_pos;
            }
            else if(q.get(i)==second_pos) 
            {
                second_pos=third_pos;
                ++third_pos;
                ++total_bride;    
            } 
            else if(q.get(i)==third_pos)
            {
                ++third_pos;
                total_bride+=2;    
            }
            else
            {
                System.out.println("Too chaotic");
                flag=1;
                break;
            }    
        }
        if(flag==0)
        {
            System.out.println(total_bride);
        }
    }
}
