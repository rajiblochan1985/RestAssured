package CoreJavaPractice;

public class PrintNumbersWhichContains2INanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 3, 56, 34, 2, 43, 52, 57, 82, 95, 102 };
		//for(int i=0; i< arr.length; i++)
		for(int i : arr)
		{
			if( i % 10 == 2)
			{
				System.out.println(i + " ");
			}
		}

	}

}
