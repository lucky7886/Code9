package review;

public class App7 {

	public static void main(String[] args) {

		int[] arr = {1,2,1,2,1,0,0,1,2,0,2,1};
		int[] arr1 = new int[12];
		int z=0,o=0,t=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				z++;
				o++;
				t++;
			}
			else if(arr[i]==1){
				o++;
				t++;
			}
			else if(arr[i]==2)
				t++;
		}
		System.out.println(z);
		System.out.println(o);
		System.out.println(t);
		
		for(int i=0;i<z;i++)
			arr[i] = 0;
		
		for(int i=z;i<o;i++)
			arr[i] = 1;
		
		for(int i=o;i<t;i++)
			arr[i] = 2;
		
		for(int x : arr)
			System.out.print(x+"\t");
	}

}
