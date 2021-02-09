package customArray;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		CustomArrayOfInts cs=new CustomArrayOfInts();
		cs.add(11);
		cs.add(22);
		cs.add(33);
		cs.add(44);
		cs.add(55);
		cs.add(66);
		cs.add(77);
		cs.add(88);
		System.out.println("The size is:");
		System.out.println(cs.size());
		System.out.println("\nArray elements are:");
		System.out.println(cs.toString());
		System.out.println("\nGet element index 1");
		System.out.println(cs.get(1));		
		System.out.println("\nDelete element index 5");
		cs.deleteByIndex(5);		
		System.out.println(cs.toString());
		System.out.println("\nDelete element value 11");
		cs.deleteByValue(11);
		System.out.println(cs.toString());		
		System.out.println("\nAdd element 99 in index 0");
		cs.insertValueAtIndex(99, 0);
		System.out.println(cs.toString());
		System.out.println("\nGet a slice from index 1 to index 4");		
		int[] slice=cs.getSlice(1, 4);		
		System.out.println("The array: "+cs.toString());	
		System.out.print("The new slice: ");		
		System.out.println(Arrays.toString(slice));
				
		
		
	}	
}
