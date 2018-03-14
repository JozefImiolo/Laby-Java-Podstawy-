package prog.imper.Lab6;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegExp {

	public static void main(String[] args) {
	String input = "User paassword=23421. Some more text password=33432. This clientNum=100";
	Pattern p = Pattern.compile("(password=)(\\d+)");
	Matcher m=p.matcher(input);
	StringBuffer result = new StringBuffer();
	System.out.println(m.matches());
	
	
	while(m.find())
	{
		System.out.println(m.start());
		System.out.println(m.end());
		System.out.println("Grupa 1: " +m.group(1));
		System.out.println("Grupa 2: " +m.group(2));
		m.appendReplacement(result, m.group(1)+ "********");
	}
	m.appendTail(result);
	System.out.println(result);
	String input1="IP=232.234.2.2 fhdkfds 334";
	Pattern p1=Pattern.compile("(IP=)(\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})");
	Matcher m1=p1.matcher(input1);
	StringBuffer result1=new StringBuffer();
	while(m1.find())
	{
		System.out.println("Grupa 1: " +m1.group(1));
		System.out.println("Grupa 2: " +m1.group(2));
		m1.appendReplacement(result1, m1.group(1) + "*******");
	}
	m1.appendTail(result1);
	System.out.println(result1);

	}

}
