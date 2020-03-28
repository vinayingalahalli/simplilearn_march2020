package eg;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int ar[]= {23,11,33,455,444,23,23};
		System.out.println(Arrays.toString(ar));
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.binarySearch(ar, 11));
		System.out.println(Arrays.binarySearch(ar, 111));
		int ele=23;
		boolean f=false;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]==ele) {
				System.out.println(ele+" found at pos = "+(i+1));
				f=true;
				//break;
			}
		}
		if(!f) {
			System.out.println(ele+" not found");
		}
		int ar2[]=Arrays.copyOf(ar, ar.length+5);
		System.out.println(Arrays.toString(ar2));
		Arrays.fill(ar2, 10000);
		System.out.println(Arrays.toString(ar2));
	}

}
