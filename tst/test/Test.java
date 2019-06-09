package test;

public class Test {

	public static void main(String[] args) {
		/*System.out.println("a b".charAt(1));
		System.out.println((int)"a b".charAt(1));
		System.out.println("aaa" + ' ' + "bbb");
		System.out.println("a" + " ");
		System.out.println('a' + ' ');
		System.out.println("a" + ' ');
		System.out.println('a' + " ");*/
		
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2);
		
		s1 = new String("abc");
		s2 = new String("abc");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		System.out.println("=======================");
		
		String a = "a";
		String b = "b";
		String ab = "a" + "b";
		System.out.println(ab == "a" + "b");
		System.out.println(ab == a + "b");
		System.out.println(ab == a + b);
		System.out.println(ab == "ab");
		
		ab = a + b;
		System.out.println(ab == "a" + "b");
		System.out.println(ab == a + "b");
		System.out.println(ab == a + b);
		System.out.println(ab == "ab");
	}

}
