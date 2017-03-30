class Test2 {
	
	public static void main(String[] args)
	{
		int a = 20 , b = 10, c , d , e ;

		b = a-- - --a ;
		c = a-- ;
		d = a >> 2;
		e = a&b ;

		System.out.println("Value of b is :" + b + "\n" + "Value of c is :" + c + "\n" + 
			"Value of d is :" + d + "\n" + "Value of e is :" + e);
	}
}