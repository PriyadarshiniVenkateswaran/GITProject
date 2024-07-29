package org.stringdemo;

public class StringPractice {

	public static void main(String[] args) {
		String s1 = "Example";
		String s2 = "Example";

		String s3 = new String("example given");

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);

		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		
		char charAt = s1.charAt(4);
		System.out.println(charAt);
		
	
		int length = s1.length();
		System.out.println(length);
		
		boolean empty = s1.isEmpty();
		System.out.println(empty);
		
		boolean equalsIgnoreCase = s1.equalsIgnoreCase(s3);
		System.out.println(equalsIgnoreCase);
		int hashCode = s1.hashCode();
		System.out.println(hashCode);
		int hashCode2 = s2.hashCode();
		System.out.println(hashCode2);
		int hashCode3 = s3.hashCode();
		System.out.println(hashCode3);
		
		boolean contains = s1.contains("amp");
		System.out.println(contains);
		
		String substring = s1.substring(4);
		System.out.println(substring);
		
		CharSequence subSequence = s1.subSequence(1,5);
		System.out.println(subSequence);
		 
		String concat = s1.concat(" given");
		System.out.println(concat);
		
		System.out.println(s1);
		
		String replace = s1.replace('e','a');
		System.out.println(replace);
		 
		int indexOf = s1.indexOf('p');
		System.out.println(indexOf);
		
		System.out.println(s3);
		
		String trim = s3.trim();
		System.out.println(trim);
		
		char[] charArray = s1.toCharArray();
		System.out.println(charArray);
		
		System.out.println("***********Enhanced For Loop****************");
		
		for(char  c : charArray) {
			System.out.print(c+ " ");
		}
		System.out.println();
		
		System.out.println("For loop");
		
		for(int i=0;i<charArray.length;i++) {
			System.out.println(charArray[i]);
		}
		boolean startsWith = s2.startsWith("ex");
		System.out.println(startsWith);
		boolean endsWith = s1.endsWith("ple");
		System.out.println(endsWith);
		
		String[] split = s3.split(" ");
		for(String sp : split) {
			System.out.print(sp+" ");
		}
		
		
		int indexOf2 = s3.indexOf('e');
		System.out.println(indexOf2);
		
		int lastIndexOf = s3.lastIndexOf('e');
		System.out.println(lastIndexOf);
		
		String upperCase = s3.toUpperCase();
		System.out.println(upperCase);
		
		System.out.println(s3);
		
		String lowerCase = s1.toLowerCase();
		System.out.println(lowerCase);
		
	}

}
