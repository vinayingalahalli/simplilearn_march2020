package java8_features;

public class NewStyleLambda {

	public static void main(String[] args) {
		HelloFunctional h=()->{
			System.out.println("Hey lambda");
		};
		h.hey();
		
		HelloFunctional h1=()->{
			System.out.println("Hey lambda AGAIN");
		};
		h1.hey();
		
		
		Functional2 f=(s)->{
			System.out.println("Hello "+s);
		};
		
		f.sayHi("girish");
		
		
		MultipleFunctional m=(x,y,z)->{
			return x*y*z;
		};
		System.out.println(m.multiply(22, 12, 11));
		
		
//	MultipleFunctional m2= new MultipleFunctional() {
//		
//		@Override
//		public long multiply(long a, long b, long c) {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//	};	
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
