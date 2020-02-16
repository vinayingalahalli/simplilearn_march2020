package eg;

import java.util.Arrays;

public class Demo2Util {

	//java.util.Arrays
	public static void main(String[] args) {
		int ar[]= {12,133,11,11,22,11,22,11,33,900000};
		System.out.println(Arrays.toString(ar));
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		
		//binarySearch - pre requirement - array should be sorted in ascending order
		
		System.out.println(Arrays.binarySearch(ar, 100));
		System.out.println(Arrays.binarySearch(ar, 11));
		
		int ar1[]=Arrays.copyOf(ar, ar.length+5);
		System.out.println(Arrays.toString(ar1));
		
		Arrays.fill(ar1, 9999999);
		System.out.println(Arrays.toString(ar1));
		System.out.println("Contents of ar");
		System.out.println(Arrays.toString(ar));
		int ele=22;
		System.out.println("Searching for element "+ele+"......");
		boolean b=false;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]==ele) {
				b=true;
				//break;
				System.out.println(ele+" found at location "+(i+1));
			}
		}
		if(b) {
			//System.out.println(ele+" found");
		}else {
			System.out.println(ele+" not found");
		}
		
	}

}
