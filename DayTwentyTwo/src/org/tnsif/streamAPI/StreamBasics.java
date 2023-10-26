package org.tnsif.streamAPI;

import java.io.PrintStream;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.*;

public class StreamBasics {

	public static void main(String[] args) {
		Stream<String>strStream=Stream.of("Nashik","Pune","Mumbai");
		strStream.forEach(System.out::println);
		System.out.println("------------------------");
		
		System.out.println("Strings in Lowercase");
		List<String> words=Arrays.asList("NAYAN","Car","cat","MADAM","Bike");
		words.stream().map(str->str.toLowerCase()).forEach(System.out::println);
		System.out.println(words);
		System.out.println("------------------------");
		
		
		Float f[]= {12.5f,15.5f,9.9f,2.5f,15.5f,9.9f};
		Stream<Float> floatStream=Arrays.stream(f);
		
		Consumer<Float> c=(n)->System.out.println("Price is :"+n);
		floatStream.forEach(c);
		System.out.println("------------------------");
		
		//limit
		floatStream=Arrays.stream(f);
		floatStream.limit(1).forEach(System.out::println);
		System.out.println("------------------------");
		
		//Skip
		floatStream=Arrays.stream(f);
		floatStream.skip(1).forEach(System.out::println);
		System.out.println("------------------------");
		
		//Distinct
		floatStream=Arrays.stream(f);
		floatStream.distinct().forEach(System.out::println);
		
		
		
		
		
		
		
		/*
		 * List<Integer> intList=Arrays.asList(4,7,2,9); System.out.println(intList);
		 * 
		 * //create another list with square of intList List<Integer>sqrList=new
		 * ArrayList<Integer>(); for(Integer no:intList) { sqrList.add(no*no); }
		 * System.out.println(sqrList);
		 * 
		 * 
		 * //Using Stream API List<Integer>cubeList;
		 * cubeList=intList.stream().map(no->no*no*no).collect(Collectors.toList());
		 * System.out.println(cubeList);
		 * 
		 * //spilt-up for line 23 Stream<Integer>intStream= intList.stream();
		 * intStream=intStream.sorted(); intStream=intStream.map(no->no*no*no);
		 * cubeList=intStream.collect(Collectors.toList());
		 * System.out.println(cubeList);
		 * 
		 * List<String> nameList=Arrays.asList("Suraj","Abhi","Yash");
		 * System.out.println(nameList);
		 * 
		 * Stream<String>nameStream=nameList.stream();
		 * intStream=nameStream.map(name->name.length());
		 * cubeList=intStream.collect(Collectors.toList());
		 * System.out.println(cubeList);
		 * 
		 * //FilterFunction //To filter only the odd Numbers from intList[4,7,2,9]
		 * intStream=intList.stream();
		 * Stream<Integer>result=intStream.filter(n->n%2!=0); List
		 * rList=result.collect(Collectors.toList()); System.out.println(rList);
		 * 
		 * //Filter()-returns palidnrome Strings List<String>
		 * words=Arrays.asList("NAYAN","Car","cat","MADAM","Bike");
		 * System.out.println(words); Stream<String> wordsStream=words.stream();
		 * wordsStream=wordsStream.filter(w->w.equals(new
		 * StringBuffer(w).reverse().toString()));
		 * nameList=wordsStream.collect(Collectors.toList());
		 * System.out.println(nameList); //Count number of Values
		 * //System.out.println(wordsStream.count());
		 * 
		 * 
		 * //Passing number predicate to filter function Predicate<Integer>numbers;
		 * numbers=(no)->no%2==0;
		 * 
		 * intStream=intList.stream(); intStream=intStream.sorted();
		 * intStream=intStream.filter(numbers);
		 * sqrList=intStream.collect(Collectors.toList()); System.out.println(sqrList);
		 * 
		 * 
		 * List<Student> sList=new ArrayList(); Student st=new Student(101,"Yash",67f);
		 * sList.add(st); st=new Student(102,"Suraj",97f); sList.add(st);
		 * 
		 * System.out.println(sList);
		 * 
		 * Predicate<Student>perPredicate=(stud)->stud.getPer()>70; Stream<Student>
		 * studStream=sList.stream(); studStream=studStream.filter(perPredicate);
		 * List<Student> newList=studStream.collect(Collectors.toList());
		 * System.out.println(newList);
		 * 
		 * //reduce() System.out.println(intList); intStream=intList.stream();
		 * Optional<Integer> sum =intStream.reduce((x,y)->x+y); System.out.println(sum);
		 */				
	}
}

	


