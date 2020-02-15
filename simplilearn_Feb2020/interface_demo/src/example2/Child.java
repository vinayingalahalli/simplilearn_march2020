package example2;

public interface Child extends Parent{

	void method3();
	void method4();
	void method5();
	
	interface Inner{
		void inner1();
		void inner2();
		void inner3();
	}
}
