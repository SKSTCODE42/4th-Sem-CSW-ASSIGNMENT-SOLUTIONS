public class q8 
{
    public static int sumDistinct(int[] arr) 
    {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) 
        {
            if (arr[i] != -1) 
            {
                int count = 1;
                for (int j = i + 1; j < n; j++) 
                {
                    if (arr[j] == arr[i]) 
                    {
                        count++;
                        arr[j] = -1;
                    }
                }
                sum += arr[i] * count;
            }
        }
        return sum;
    }
}
