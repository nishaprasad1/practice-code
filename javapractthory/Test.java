package javapractthory;


class Test{
	public static void main(String[] args) {
//		Object o = new String("apple");
//		System.out.println(o);
//		StringBuffer sb = (StringBuffer) o;//---->valid(as StringBuffer is child of Object class).
//		System.out.println(sb);
//-------------------------------------------------------------------------
//		Object o = new String("apple");
//		System.out.println(o);
//		Object sb = (String) o;//---->valid(as StringBuffer is child of Object class).
//		System.out.println(sb);
//--------------------------------------------------------------------------------------
//		String s = new String("apple");
//		StringBuffer sb1 = (StringBuffer) s;//CE: Cannot cast from String to StringBuffer
//-----------------------------------------------------------------		
//		Object o1= new String("car");
//		System.out.println(o1);
//		Object o2= (String) o1;
//		System.out.println(o2);
//-----------------------------------------------------
		
			
				Integer i= new Integer(10);
				Number  n= (Number) i;
				Object o=(Object) n;
				System.out.println(i==n);//true
				System.out.println(o==n);//true
		
		
	}
}  