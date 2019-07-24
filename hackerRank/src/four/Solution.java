package four;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'efficientJanitor' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts FLOAT_ARRAY weight as parameter.
     */

    public static int efficientJanitor(List<Float> weight) {
    // Write your code here
    	
    	HashMap<Integer, Float> prevSum = new HashMap<>();
    	int result =0;
    	double sum = 3.0;
    	   	
    	int current_running_sum =0;
    	 
    	for (int i =0 ; i <weight.size(); i ++ )
    	{
    		current_running_sum+=weight.get(i);
    		if (current_running_sum == sum)
    			result++;
    		
    		if (prevSum.containsKey(current_running_sum - sum))   
                result += prevSum.get(current_running_sum - sum);  
    		
    		Float count = prevSum.get(current_running_sum); 
            if (count == null) 
                prevSum.put(current_running_sum, (float) 1); 
            else
                prevSum.put(current_running_sum, (float) (count+1));  
                
    	}
    	return result;
    	
    	

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int weightCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Float> weight = new ArrayList<>();

        for (int i = 0; i < weightCount; i++) {
            float weightItem = Float.parseFloat(bufferedReader.readLine().trim());
            weight.add(weightItem);
        }

        int result = Result.efficientJanitor(weight);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
