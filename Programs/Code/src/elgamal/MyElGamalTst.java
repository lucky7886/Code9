package elgamal;

import java.math.BigInteger;
import java.io.*;
public class MyElGamalTst {
public static void main(String[] args) throws IOException {
if (args.length < 2) {
System.out.println("Usage: java MyElGamalTst [e|d] <path>");
return;
}
MyElGamal pkc = new MyElGamal();
MyTransformer trfmr;
if (args[0].charAt(0) == 'e')
trfmr = pkc.getEncrypter();
else if (args[0].charAt(0) == 'd')
trfmr = pkc.getDecrypter();
else {
System.out.println(pkc);
System.out.println("No encrypt/decrypt option specified");
return;
}
File inFile = new File(args[1]);
int inputLength = (int)(inFile.length()/100 + 1)*100;
BufferedInputStream inStrm = new BufferedInputStream(
new FileInputStream(inFile));
BufferedOutputStream outStrm = new BufferedOutputStream(
new FileOutputStream(args[1]+".out"));
System.err.println("Buffer size = " + inputLength);
byte[] buf = new byte[inputLength];
int nBytes = inStrm.read(buf);
System.out.println("\n" + nBytes + " bytes read");
byte[] msg = new byte[nBytes];
System.arraycopy(buf, 0, msg, 0, nBytes);
byte[] tmsg = trfmr.transform(msg);
System.out.println("" + tmsg.length + " bytes produced");
outStrm.write(tmsg);
inStrm.close();
outStrm.close();
}
}
