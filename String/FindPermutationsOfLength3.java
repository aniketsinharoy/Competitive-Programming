Find out all the possible permutations of the characters in the string passed to the method findPermutations(). Implement the logic inside findPermutations() method and return a string array containing all the permutations.
Assumption: The length of the string will be 3.

E.g.: For the string "abc", the permutations will be abc, acb, bac, bca, cab and cba.
----------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;
class Tester{
    public static String[] findPermutations(String str){
        //Implement your code here and change the return value accordingly
        HashSet<String> hm = new HashSet<>();
        String temp="";
        for(int i=0;i<3;++i){
            for(int j=0;j<3;++j){
               for(int k=0;k<3;++k){
                temp = str.substring(i,i+1); 
                if((i!=k && i!=j)&&(j!=k)){
                    temp = temp + str.substring(j,j+1) + str.substring(k,k+1);
                    hm.add(temp);
                }
               }
            }
        }
        String[] permutation = new String[hm.size()];
        int i=0;
        for(String s : hm){
            permutation[i] = s;
            ++i;
        }
        Arrays.sort(permutation);
        return permutation;
    }
    
    public static void main(String args[]){
        String str = "abc";
        String permutations[] = findPermutations(str);
        for(String permutation: permutations){
            if (permutation!=null)
                System.out.println(permutation);
        }
    }
}
