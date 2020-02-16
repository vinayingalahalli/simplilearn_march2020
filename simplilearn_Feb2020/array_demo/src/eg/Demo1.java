package eg;

public class Demo1 {

	public static void main(String[] args) {
		int ar[]= {12,133,11,11,22,11,22,11,33,900000};
		System.out.println(ar[0]);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		int ar1[]=new int[10];
		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i]+" ");
		}
		System.out.println();
		ar1[0]=100;ar1[1]=10;ar1[2]=10;ar1[3]=80;ar1[4]=99;
		System.out.println("Before Insertion");
		int n=5;
		for (int i = 0; i < n; i++) {
			System.out.print(ar1[i]+" ");
		}
		System.out.println();
		
		int newEle=999;
		int pos=4;
		for (int i = n; i >=pos ; i--) {
			ar1[i]=ar1[i-1];
		}
	ar1[pos-1]=newEle;
		n++;
		System.out.println("After Insertion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar1[i]+" ");
		}
		System.out.println();
		System.out.println("Before Deletion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar1[i]+" ");
		}
		System.out.println();
		
		
		pos=1;
		for (int i = pos-1; i < n; i++) {
			ar1[i]=ar1[i+1];
		}
		n--;
		System.out.println("After Deletion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar1[i]+" ");
		}
		System.out.println();
		
	}

}
