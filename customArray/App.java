package customArray;

public class App {

	public static void main(String[] args) {
		CustomArrayOfInts cs=new CustomArrayOfInts();
		cs.add(11);
		cs.add(22);
		cs.add(33);
		cs.add(44);
		//System.out.println(cs.get(1));
//		System.out.println(cs.size());
//		cs.clear();
//		System.out.println(cs.size());
//		System.out.println(cs.get(3));
		System.out.println(cs.toString());
		//cs.deleteByIndex(0);
		//cs.deleteByValue(44);
		//cs.insertValueAtIndex(88, 2);
		int[] slice=cs.getSlice(1, 2);
		
		//System.out.println(cs.toString());
		
		for(int i=0;i<slice.length;i++)
			System.out.print(slice[i]+" ");

	}

}
