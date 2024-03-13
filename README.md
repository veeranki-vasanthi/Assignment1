class sumOfNum
{
    public static void main(String args[])
    {
        int[] values = {10,51,53,39,47,44,21};
        int n=values.length;
        //Arrays.sort(values);
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(values[i]>values[j])
                {
                    int temp=values[j];
                    values[j]=values[i];
                    values[i]=temp;
                }
            }
        }
        System.out.print("Sum of 2nd and 3rd largest number : ");
        System.out.println(values[n-2]+values[n-3]);
    }
}
