package array_Study2;
import java.util.Arrays;
public class ArrayEg2 {

	public static void main(String[] args) {
		// string array
		String name[]={"Sachin","Sourao","Rahul","Virendra","Zaheer"};
		int rollno[]= {23,43,55,66,77};
		System.out.println("===========================================");
		System.out.println("Original order");
		for(int i=0;i<=rollno.length-1;i++)
		{
			System.out.println(rollno[i]);//displaying roll no
		}
		System.out.println("===========================================");
		System.out.println("Array in ascending order->Ascending order");
		Arrays.sort(rollno);
		for (int i=0;i<=rollno.length-1;i++)  //ascending order
		{		
		System.out.println(rollno[i]);

	}
		System.out.println("============================================");
		System.out.println("Sorted array->Desending order");
		for (int i=rollno.length-1;i>=0;i--)
		{
			System.out.println(rollno[i]);//descending order
			
		}
		}

}
