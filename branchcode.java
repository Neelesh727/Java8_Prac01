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
	int[] num = {5, 10};
	BiConsumer<int[], int[]>
	swap = (a1, b1)->{
		     int temp = a1[0];
		     a1[0]=b1[0];
		     b1[0]= temp;
	};
	int[] snum = {num[1]};
	swap.accept(num, snum);
	System.out.println(num[0]+" "+snum[0]);
}

}