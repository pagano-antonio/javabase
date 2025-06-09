package example.stringhe;

public class StringheMetodi {

	public static void main(String[] args) {

		String g = new String("HelloWorld");

		String t = "HelloWorld";
		
		String t1 = "HelloWorld";
		
		System.out.println(g == t);
		
		System.out.println(t1 == t);
		
		System.out.println(g.equals(t));
		
		
		
		int g2= t.length();
		t = t.toLowerCase();
		System.out.println(t.toLowerCase());
		System.out.println(t.toUpperCase());
		System.out.println(t);
		
		int gr = t.indexOf("H");
		String r = t.replace("H", "C");
		
		
		
		System.out.println(t.substring(0,5));
		
	}

}
