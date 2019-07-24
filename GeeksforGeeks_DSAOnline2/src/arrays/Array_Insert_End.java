package arrays;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Scanner;
//import java.util.StringTokenizer;

 public class Array_Insert_End {
	
	
	public void insertAtEnd(int arr[],int sizeofArray,int Felement)
    {
        
        // just assign the element to the sizeofArray-1
        arr[sizeofArray-1]= Felement;
       // arr[sizeofArray-2]= Selement;
        
    }

	public static void main(String[] args) {
		
	
		
		Scanner s = new Scanner(System.in);
		
		//key code line 
		int sizeofArray = s.nextInt();
		
		int[] array1 = new int[sizeofArray];
		
		for (int i =0; i< sizeofArray-1; i++)
		{
			int x;
			x = s.nextInt();
			array1[i] = x;
			
		}
		
		int element1 = s.nextInt();
	//	int element2 = s.nextInt();
		
		
		Array_Insert_End obj = new Array_Insert_End();
		obj.insertAtEnd(array1, sizeofArray, element1 );
		for (int i =0; i<sizeofArray; i++)
		{
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		s.close();
		//}
		
		
		
	

}
}
