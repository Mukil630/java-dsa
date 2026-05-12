
import java.util.ArrayList;

public class Day1 {
     static ArrayList<Integer> subarraySum(int[] arr, int target) {

        
        int start = 0;
        int sum = 0;
        
        for(int end = 0; end < arr.length; end++)
        {
            sum += arr[end];
            
            while(sum > target)
            {
                sum -= arr[start];
                start++;
            }
            
            if(sum == target)
            {
                ArrayList<Integer> res = new ArrayList<>();
                res.add(start + 1);
                res.add(end + 1);
                return res;
            }
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        res.add(-1);
        return res;
    }
//}

//Missing In Array

//public class Day1{  
    int missingNum(int arr[]) {
        
        long n = arr.length + 1;  
        long total = n * (n + 1) / 2;
        
        long sum = 0;
        
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        
        return (int)(total - sum);
    }
//}

//Second Largest

//public class Day1 {
     public int getSecondLargest(int[] arr) {
        

        int first = -1;
        int second = -1;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > first)
            {
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second && arr[i] != first)
            {
                second = arr[i];
            }
        }

        return second;
    }
}
