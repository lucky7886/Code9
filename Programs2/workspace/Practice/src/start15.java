
public class start15 {

	enum computers{
		hp, dell, lenovo, acer
	}
	
	
	public static void main(String[] args) {

		//computers.valueOf(hp);
		computers c = computers.acer;
		System.out.println(c);
		
		switch(c){
		case acer: {
			System.out.println("Acer brand it is");		
		break;
		}
		
	}

	}
}
