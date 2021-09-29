package Day3;

public class Stats5 {

	public static void main(String[] args) {

		double[] arr = new double[5];
		double sum = 0;
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = Math.random(); 
			System.out.println(arr[i]);
			sum = sum + arr[i];
		}
		System.out.println("Average of the 5 random num is " + sum / 5);
		
		double max = arr[0];
		double min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		System.out.println("Max of the 5 random num is " + max);
		System.out.println("Min of the 5 random num is " + min);
	}

}
