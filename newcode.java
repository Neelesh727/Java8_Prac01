package code.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrepInta {
public static void main(String[] args) {
	
//Write a code to check whether given string is anagram or not
	String str = "Hello World";
	String str2 = Arrays.asList(str).stream()
			                                  .map(a->new StringBuilder(a).reverse().toString())
			                                  .collect(Collectors.joining());
	System.out.println(str2);
	
	String ok = "Hello";
	String ok2 = Arrays.stream(ok.split(" ")).map(a->new StringBuilder(a).reverse()).collect(Collectors.joining());
	System.out.println(ok2);
	
	String tt = "Hello World";
	           String stt =  tt.chars().mapToObj(a->(char)a).reduce("", (c, s)->(s+c),(s1, s2)->(s1+s2));
	           System.out.println(stt);
	           
	String ty ="gjhgsiiiiiiiqqqqqqqqaaaaaaaaaallllllllllhgjhsdcsppppxxxzzjjjjjuyyyy";
	    String tyy =   Arrays.stream(ty.split("")).sorted().collect(Collectors.joining());
	    System.out.println(tyy);

   //Write a code to check whether given string is anagram or not
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter your Number");
           int a = sc.nextInt();
           boolean flag = isPrime(a);
           if(flag) {
        	   System.out.println("Yes");
           }else {
        	   System.out.println("No");
           }         
}
}
private static boolean isPrime(int a) {
	// TODO Auto-generated method stub
	if(a<=1) return false;
	 return IntStream.rangeClosed(2, (int)Math.sqrt(a)).noneMatch(i->a%i==0);
}
	

       