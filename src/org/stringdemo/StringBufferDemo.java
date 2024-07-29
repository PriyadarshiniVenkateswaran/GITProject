package org.stringdemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Welcome You to");
		
		sb.append(" Java Class");
		System.out.println(sb);
		
		sb.insert(11," all");
		System.out.println(sb);
		
		sb.replace(8, 15, "Everyone");
		System.out.println(sb);
		
		sb.delete(7, 16);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		
		
	}

}
