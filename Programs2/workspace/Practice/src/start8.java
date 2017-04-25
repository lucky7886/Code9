
public class start8 {

	public static void main(String[] args) {

		int[] array = new int[1];
		
		start8 arrayList = new start8();
		
		System.out.println(arrayList.size(array));
		
		array = arrayList.add(array,10);
		
	
		System.out.println(arrayList.size(array));
	
	array = arrayList.add(array, 20);
	
	System.out.println(arrayList.size(array));
	
	System.out.println(array[1]);
	}

	public int size(int[] array){
		if(array.length==1 && array[0]==0){
			return 0;
		}
		return array.length;
	}
	
	
	public int[] add(int[] array,int n)
	{
		if(array.length==1 && array[0]==0){
			int[] array2 = new int[array.length];
			array2[array.length-1]=n;
		return array2;
		}
		else{
		int[] array2 = new int[array.length+1];
		for(int i=0;i<array.length;i++)
			array2[i]=array[i];
		array2[array.length]=n;
		return array2;
		}	
	}
	
	//public int[] remove(int[] array){
		
	//}
	
}
