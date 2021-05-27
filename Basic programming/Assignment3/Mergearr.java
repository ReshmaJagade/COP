//5:Write a program to  merge two arrays into a single array.
import java.util.Arrays;
public class Mergearr {

	public static void main(String[] args)
	{
		int[] firstArray = {23,45,12,78,4,90,1};        
		int[] secondArray = {77,11,45,88,32,56,3};
		int fal = firstArray.length;        
		int sal = secondArray.length;   
		int[] result = new int[fal + sal];  
		System.arraycopy(firstArray, 0, result, 0, fal);  
		System.arraycopy(secondArray, 0, result, fal, sal);
		
		System.out.println("Merged Array:"+Arrays.toString(result));   

	}

}
