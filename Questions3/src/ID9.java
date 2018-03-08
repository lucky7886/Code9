
public class ID9 {

	public static void main(String[] args) {
int count =0;
		for (int i = 1; i < 1000; i++) {
			for (int j = 1; j < 1000; j++) {
				for (int k = 1; k < 1000; k++) {
					if (i * i + j * j == k * k) {
						if (i + j + k == 1000){
							System.out.printf("%d %d %d\n", i, j, k);
							count=-1;
							break;
						}
						if(count==-1)
							break;
					}
					if(count==-1)
						break;

				}
			}
		}

	}

}
