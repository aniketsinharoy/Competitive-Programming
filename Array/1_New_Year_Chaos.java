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
