package assofArray;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class AssofArray {

	public static void main(String[] args) {

		//An ArrayList of Integers and add 5 numbers:
//
//		ArrayList<Integer> a = new ArrayList<Integer>();
//		a.add(1);
//		a.add(2);
//		a.add(3);
//		a.add(4);
//		a.add(5);
//		
//		for(int l : a) {
//			
//			System.out.println(l);
//		}

		
		//LinkedList of string And Add 5 Name
//		
//		LinkedList<String> a = new LinkedList<String>();
//		a.add("Ali");
//		a.add("Muhammad");
//		a.add("Mustafa");
//		a.add("Khalid");
//		a.add("Wasi");
//
//		for (String b : a) {
//			
//			System.out.println(b);
//		}

		
		//Allow a User to add and remove elements from an Arraylist
		
//		Person p1 = new Person();
//		p1.setName("Ahmed");
//		p1.setAge("21");
//		Person p2 = new Person();
//		p2.setName("Wasi");
//		p2.setAge("18");
//		Person p3 = new Person();
//		p3.setName("Mustafa");
//		p3.setAge("23");
//		Person p4 = new Person();
//		p4.setName("Khalid");
//		p4.setAge("29");
//		Person p5 = new Person();
//		p5.setName("Ali");
//		p5.setAge("17");
//		
//		ArrayList<Person> l1 = new ArrayList<Person>();
//		l1.add(p1);
//		l1.add(p2);
//		l1.add(p3);
//		l1.add(p4);
//		l1.add(p5);
//		l1.remove(p3);
//		
//		for(Person l : l1) {
//			
//			System.out.println(l.getName());
//			System.out.println(l.getAge());
//		}
//		
		
//Create a program that	Allows a user to search for an element in an arrayList and a LinkedList of integers. Print out the index of the element if it is found, or a message saying that the element is not in the List.

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(0,1);
		a.add(1,2);
		a.add(2,3);
		a.add(3,4);
		a.add(4,5);
		a.add(5,6);
		a.add(6,7);
		a.add(7,8);
		a.add(8,9);
		a.add(9,19);
		
		LinkedList<Integer> b = new LinkedList<Integer>();
		b.add(70);
		b.add(80);
		b.add(90);
		b.add(100);
		b.add(110);
		b.add(120);
		b.add(0, 11);
		b.add(1, 10);
		b.add(2, 9);
		b.add(3, 8);
		b.add(4, 7);
		b.add(5, 6);
		b.add(6, 5);
		b.add(7, 4);
		b.add(8, 3);
		b.add(9, 2);
		b.add(10, 1);
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number ");
		int number = scanner.nextInt();
		
		int i  = a.indexOf(number);
		int ind = b.indexOf(number);
		
		if ( a.contains(number) == b.contains(number)) 
		{
		
			System.out.println("Element in an arraylist and the idex number is " + i + " And linkedList is " +ind);
			
			
		}
		
		else if(a.contains(number)) 
		{

			System.out.println("Element in an arraylist and the idex number is " + i );
			
		}

		else if(b.contains(number)) 
		{
		
			System.out.println("Element in an LinkedList and the idex number is " +ind);
			
		}
		
		else
		{
			
			System.out.println("The element is not in the List");
		
		} 
	}

}

