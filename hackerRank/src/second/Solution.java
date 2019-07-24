package second;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'funWithAnagrams' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY s as parameter.
     */
	public static String key(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static List<String> funWithAnagrams(List<String> s) {
    	List<String> answer = new LinkedList<String>();
        Set<String> foundY = new HashSet<String>();
       for (int i=0; i<s.size(); i++) {
            String word = s.get(i);
            String key = key(word);
            if (!foundY.contains(key)) {
                answer.add(word);
                foundY.add(key);
            }
    }
	return answer;

}
}

public class Solution {
    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int sCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> s = new ArrayList<>();

        for (int i = 0; i < sCount; i++) 
        {
            String sItem = bufferedReader.readLine();
            s.add(sItem);
        }

        List<String> result = Result.funWithAnagrams(s);

        for (int i = 0; i < result.size(); i++) 
        {
            bufferedWriter.write(result.get(i));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

