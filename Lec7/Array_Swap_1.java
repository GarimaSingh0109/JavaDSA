package Lec7;

public class Array_Swap_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 6, 7, 8 };
//		int[] arr = new int[] { 10, 20, 6, 7, 8 };
		System.out.println(arr[0] + " " + arr[1]);// 10 20
		Swap(arr[0], arr[1]);
		System.out.println(arr[0] + " " + arr[1]);// 
	}

	public static void Swap(int a, int b) {
		int c = a;
		a = b;
		b = c;
	}

}
