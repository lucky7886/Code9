package basics;
import java.io.*;
public class CharacterSum {

	public static void main(String[] args)throws Exception {

BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a string: ");
String g = m.readLine();
int sum=0;
int c;
int character=0;
for(int i=0;i<g.length();i++){
c=(int)g.charAt(i);
if(c==32)
sum+=0;
else
	sum+=c-96;
}
int ans = sum%9;
if(ans==0)
	ans=9;
System.out.println(ans);
		
		
	}

}
