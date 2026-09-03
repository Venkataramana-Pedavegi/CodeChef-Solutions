class Codechef
{
	public static void main (String[] args) 
	{
		int[] values = {2, 10, 12, 6, 15};
        for (int x : values) 
        {
            if (x > 10) 
            {
                continue;
            }
            System.out.print(x * x + " ");
        }        
    }
}