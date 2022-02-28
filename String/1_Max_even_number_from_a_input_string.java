import java.util.*;
class Max_even_number_from_a_input_string
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine();
      int even_no=0;
      int i;
      String temp="8";
      TreeMap<String,Integer> count = new TreeMap<>();
      for(i=0;i<9;++i)
      {
         count.put(String.valueOf(i),0);
      }
      for(i=0;i<input.length();++i)
      {
         if(input.charAt(i)>='0' && input.charAt(i)<='9')
         {
            count.put(input.substring(i,i+1), count.get(input.substring(i,i+1))+1);
            if(Integer.parseInt(input.substring(i,i+1))%2==0)
            {
               ++even_no;
               if(temp.compareTo(input.substring(i,i+1))>=0)
               {
                  temp=input.substring(i,i+1);
               }
            }
         }
      }
      if(even_no==0)
      {
         System.out.println("-1");
      }
      else
      {
         String ans="";
         i=0;
         for(String key : count.keySet())
         {
            if(count.get(key)!=0 && key.compareTo(temp)!=0)
            {
               ans=key+ans;
            }
         }
         ans=ans+temp;
         System.out.println(ans);
      }
   }
}
