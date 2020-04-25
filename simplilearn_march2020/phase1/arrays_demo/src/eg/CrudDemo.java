package eg;

public class CrudDemo {

	public static void main(String[] args) {
	
		int ar[]= {23,11,33,455,444,23,23};
		System.out.println(ar.length);
		
		System.out.println(ar[0]);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		System.out.println("ar1..............");
		int ar1[]=new int[10];
		System.out.println(ar1.length);
		System.out.println(ar1[8]);
		ar1[0]=100;
		ar1[1]=99;
		ar1[2]=10001;
		ar1[3]=909;
		int n=4;
		System.out.println("Before Insertion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar1[i]+" ");
		}
		
		int ele=77;
		int pos=5;
		for(int i=n; i>=pos;i--) {
			ar1[i]=ar1[i-1];
		}
		
		n++;
		ar1[pos-1]=ele;
		System.out.println("\nAfter Insertion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar1[i]+" ");
		}
		
		pos=2;
		for(int i=pos-1;i<n;i++) {
			ar1[i]=ar1[i+1];
		}
		n--;
		System.out.println("\nAfter Deletion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar1[i]+" ");
		}
		
		
	}

}
