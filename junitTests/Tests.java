package junitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import customArray.CustomArrayOfInts;
import junit.framework.Assert;

public class Tests {

	@Test
	public void AddTest() {
		CustomArrayOfInts cs= new CustomArrayOfInts();
		cs.add(11);
		int result=cs.get(0);
		assertEquals(11,result);
	}
	
	@Test
	public void DeleteByIndexTest() {
		CustomArrayOfInts cs=new CustomArrayOfInts();
		cs.add(11);
		cs.add(22);
		cs.add(33);
		cs.add(44);
		cs.deleteByIndex(0);
		String result="[22,33,44]";
		assertEquals(result, cs.toString());
	}
	
	@Test
	public void DeleteByIValueTest() {
		CustomArrayOfInts cs=new CustomArrayOfInts();
		cs.add(11);
		cs.add(22);
		cs.add(33);
		cs.add(44);
		cs.deleteByValue(22);
		String result="[11,33,44]";
		assertEquals(result, cs.toString());
	}
	
//	@Test
//	public void GetSliceTest() {
//		CustomArrayOfInts cs=new CustomArrayOfInts();
//		cs.add(11);
//		cs.add(22);
//		cs.add(33);
//		cs.add(44);
//		int[] slice=cs.getSlice(1, 2);
//		String result= "[22,33]";
//		
//		assertEquals(result, slice.toString());
//		
//	}
	

}
