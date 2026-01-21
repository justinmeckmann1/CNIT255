public class OverflowUnderflowTest {
public static void main(String[] args) {
byte byteNum1 = (byte)129;
byte byteNum2 = (byte)-128;
short shortNum1 = (short)32768;
short shortNum2 = (short) -32769;
int intNum = Integer.MAX_VALUE;
int result1 = intNum + 1;
long longNum = Long.MAX_VALUE;
long result2 = longNum + 1;
float floatNum = Float.MAX_VALUE;
float result3 = floatNum * 10;
double doubleNum = Double.MAX_VALUE;
double result4 = doubleNum * 10;
}
}