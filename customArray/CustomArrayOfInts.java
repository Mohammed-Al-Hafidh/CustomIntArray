package customArray;

public class CustomArrayOfInts {
	
	private int [] data = new int[1]; // only grows by doubling size, never shrinks
	private int size = 0; // how many items do you really have

	public int size() {
		return size;
		}
	public void add(int value) {
		if(size==0) {
			data[0]=value;
			size++;
			return;
		}
			
		int[] temparray=new int[size];
		for(int i=0;i<size;i++)
			temparray[i]=data[i];
		data=new int[size+1];
		data[size]=value;
		
		for(int i=0;i<size;i++)
			data[i]=temparray[i];		
		size++;
		}
	public void deleteByIndex(int index) { 
		if(index>size)
			 throw new IndexOutOfBoundsException();
		int[] temparray=new int[size];
		int j=0;
		for(int i=index+1;i<size;i++) {
			temparray[j]=data[i];
			j++;
		}
			
		j=0;
		for(int i=index;i<size;i++) {
			data[i]=temparray[j];
			j++;
		}
		size--;		
	}
	public boolean deleteByValue(int value) { 
		if(data[size-1]==value) {
			size--;
			return true;
		}
		
		boolean check=false;
		boolean found=false;
		int[] tempArray=new int[size];
		int j=0;
		for(int i=0;i<size;i++) {
			if(data[i]==value&&!found) {
				j++;
				data[i]=data[j];
				j++;
				check=true;
				found=true;
				size--;
			}else {
				data[i]=data[j];
				j++;
			}											
		}
		if(check) {
			return true;
			}
		
		return false;
		
		
		

	
	public void insertValueAtIndex(int value, int index) { 
		int[] temparray=new int[size];
		for(int i=0;i<size;i++)
			temparray[i]=data[i];
		size++;
		data=new int[size];
		
	
		if(index==size-1) {
			data[size-1]=value;
			for(int i=0;i<size-1;i++)
				data[i]=temparray[i];
			return;
		}
			
		
		boolean check=false;
		for(int i=0;i<size-1;i++) {
			
			if(index==i)
			{
				data[i]=value;					
				check=true;
			}
			if(check) {
				data[i+1]=temparray[i];
			}else {
				data[i]=temparray[i];
			}			
		}							
	}
	
	public void clear() { 
		size = 0; 
		}
	public int get(int index) { 
		if(index>size)
			 throw new IndexOutOfBoundsException();
		return data[index];
	} // may throw IndexOutOfBoundsException
	
	public int[] getSlice(int startIdx, int length) {
		int end=(startIdx+length);
		int[] result=new int[length];
		if(end>size){
			throw new IndexOutOfBoundsException();
		}
		int j=0;
		for(int i=startIdx;i<end;i++) {
			result[j]=data[i];
			j++;
		}
		return result;
		
	} // may throw IndexOutOfBoundsException
	
	@Override
	public String toString() {
		String result;
		result="[";
		for(int i=0;i<size;i++) {
			if(i!=0)
				result+=",";
			result+=data[i];			
		}
		result+="]";
		return result;
	} // returns String similar to: [3, 5, 6, -23]

}
