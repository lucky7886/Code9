package elgamal;

import java.math.BigInteger;
public class GenTest {
public static void main(String[] args) {
boolean isGen = GeneratorFactory.isGenerator(
new BigInteger(args[0], 16), new BigInteger(args[1], 16), 300);
System.err.println(args[1] + (isGen?" is ":" is not ")
+ "a generator mod "+ args[0]);
}
}