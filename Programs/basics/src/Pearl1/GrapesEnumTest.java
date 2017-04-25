package Pearl1;
import java.util.EnumSet;
public class GrapesEnumTest {

	public static void main(String[] args) {

		
		for(GrapesEnum g: GrapesEnum.values())
			
			System.out.printf("%s\t%s\t%d\n",g,g.getDesc(),g.getNum());
		System.out.println("And now for the range of objects");
		
		for(GrapesEnum a:EnumSet.range(GrapesEnum.pqr,GrapesEnum.asd ))
	
			System.out.printf("%s\t%s\t%d\n",a,a.getDesc(),a.getNum());
	
	}

}
