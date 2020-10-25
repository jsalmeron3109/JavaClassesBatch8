package com.syntax.grouptask;

public class Task1 {
public static void main(String[] args) {
	
			
	String a= "first";
  	String b= "second";
   a=b+a;
   b=a.substring(b.length(),a.length());
   a=a.substring(0,(a.length())-b.length());
   System.out.println(a);
   System.out.println(b);
   
   System.out.println("****************");
   String c="1";
   String d="2";
   c=c.concat("#"+d);
   d=c.split("#")[0];
   c=c.split("#")[1];
   System.out.println(c);
   System.out.println(d);
    
    
   System.out.println("****************");
   String e="1";
   String f="2";
   e=e+f;
   f=e.replace(f, "");
   e=e.replace(e, "");
   System.out.println(e);
   System.out.println(f);
    
   System.out.println("****************");
   int x=5;
   int y=8;
   x=y+x;
   y=x-y;
   x=x-y;
   System.out.println("x= " +x);
   System.out.println("y= "+y);

	
}
}
