package CoreJavaPractice;

public class FindLargestAndSmallestNumINanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 65, 23, 98, 21, 47, 96, 12, 45, 74, 110 };
		int max = arr[0];
		int min = arr[0];
		
		for (int i=0; i< arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println("Largest Number in the Array is: " + max);
		System.out.println("Smallest Number in the Array is: " + min);

	}

}
