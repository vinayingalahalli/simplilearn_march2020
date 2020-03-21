package data_types;

public class Demo1 {

	public static void main(String[] args) {
		/*Primitive Data Types
		 * int x=100;
		 * String s="java";
		 * 
		 * 
		 * type		size		default_value
		 * ------------------------------------
		 * byte		1byte			0
		 * short	2bytes			0
		 * int		4bytes			0
		 * long		8bytes			0
		 * 
		 * float	4bytes			0.0000f
		 * double	8bytes			0.0000d (decimal values-by default treated as double)
		 * 
		 * char		2bytes			'\u00000'(UNI-Code table)
		 * boolean	1byte			false 
		 */
		int x=10;
		float f=x;
		System.out.println(f);
		f=9.878788f;
		x=(int)f;
		System.out.println(x);
		

	}

}
