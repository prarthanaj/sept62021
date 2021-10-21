class WrappersStarter{
public static void main(String[] hello)
{
System.out.println("Wrapper Class With Constructors and Methods");
System.out.println("                                           ");

//byte constructor
System.out.println("  Byte constructor  ");

Byte byte1=new Byte((byte)1111);//public Byte(byte value)
System.out.println(byte1);

Byte byte2=new Byte("110");//public Byte(String s)
System.out.println(byte2); 

//byte methods 
System.out.println("  Byte methods  ");

byte valueIs=byte2.byteValue();//public byte byteValue()
System.out.println("Value Is:"+valueIs);

int comparing=Byte.compare(byte1,byte2);//public static int compare(byte x, byte y)
System.out.println("compared value:"+comparing);

int comparedTo=byte1.compareTo((byte)101);//public int compareTo(Byte anotherByte)
System.out.println("compareTo value is:"+comparedTo);

Byte decoding=Byte.decode("+#3");////public static Byte decode(String nm)
System.out.println("decoding is:"+decoding);

double doubling=byte1.doubleValue();//public double doubleValue()
System.out.println("doubling:"+doubling);

boolean equal=byte1.equals("is");//public boolean equals(Object obj)
System.out.println("is that:"+equal);

float floating=byte2.floatValue();//public float floatValue()
System.out.println("floating:"+floating);

byte parse=Byte.parseByte("11");//public static byte parseByte(String s)
System.out.println("parse:"+parse);

String conToString=Byte.toString((byte)101);//public static String toString(byte b)
System.out.println("conToString:"+conToString);

Byte valueBe=Byte.valueOf(byte1);//public static Byte valueOf(byte b)
System.out.println("valueBe:"+valueBe);

short shortValueIs=byte1.shortValue();//public short shortValue()
System.out.println("shortValueIs:"+shortValueIs);

System.out.println("                                                    ");
System.out.println("  short constructors  ");
//short constructors

Short short1=new Short((short)12);//public Short(short value)
System.out.println("short1:"+short1);

Short short2=new Short("21");//public Short(String s)
System.out.println("short2:"+short2);

System.out.println("  short method  ");
//short methods

int compare1=Short.compare((short)-68,(short)66);//public static int compare(short x,short y)
System.out.println("compare1:"+compare1);

int compare2=short2.compareTo((short)12);//public int compareTo(Short anotherShort)
System.out.println("compare2:"+compare2);

int hashcode=short2.hashCode();//public int hashCode()
System.out.println("hashcode:"+hashcode);

short reverseIt=Short.reverseBytes((short)34);//public static short reverseBytes(short i)
System.out.println("reverseIt:"+reverseIt);

short valueOf1=Short.valueOf("3");//public static Short valueOf(String s)
System.out.println("valueOf1:"+valueOf1);

short parseShort1=Short.parseShort("4");//public static short parseShort(String s)
System.out.println("parseShort1:"+parseShort1);

String toString1=Short.toString((short)2);//public static String toString(short s)
System.out.println("toString1:"+toString1);

long longValue1=short1.longValue();//public long longValue()
System.out.println("longValue1:"+longValue1);

float floatValue1=short1.floatValue();//public float floatValue()
System.out.println("floatValue1:"+floatValue1);

double doubleValue1=short2.doubleValue();//public double doubleValue()
System.out.println("doubleValue1:"+doubleValue1);

System.out.println("                                                ");
System.out.println("  Integer constructors  ");
//integer constructors

Integer int1=new Integer(2345);//public Integer(int value)
System.out.println("int1:"+int1);

Integer int2=new Integer("23456");//public Integer(String s)
System.out.println("int2:"+int2);

System.out.println("  Integer methods  ");
//Integer methods 

int bitCount1=Integer.bitCount(int1);//public static int bitCount(int i)
System.out.println("bitCount1:"+bitCount1);

int rotateLeft1=Integer.rotateLeft(int1,2);//public static int rotateLeft(int i,int distance)
System.out.println("rotateLeft1:"+rotateLeft1);         

int reverse1=Integer.reverse(int2);//public static int reverse(int i)
System.out.println("reverse1:"+reverse1);

int signum1=Integer.signum(2345678);//public static int signum(int i)
System.out.println("signum1:"+signum1);

int reverseBytes1=Integer.reverseBytes(int1);//public static int reverseBytes(int i)
System.out.println("reverseBytes1:"+reverseBytes1);

int highestOneBit1=Integer.highestOneBit(int2);//public static int highestOneBit(int i)
System.out.println("highestOneBit:"+highestOneBit1);

int numberOfTrailingZeros1=Integer.numberOfTrailingZeros(1000000);//public static int numberOfTrailingZeros(int i)
System.out.println("numberOfTrailingZeros:"+numberOfTrailingZeros1);

String toOctalString1=Integer.toOctalString(7654321);//public static String toOctalString(int i)
System.out.println("toOctalString:"+toOctalString1);

String toHexString1=Integer.toHexString(1234567);//public static String toHexString(int i)
System.out.println("toHexString:"+toHexString1);

Integer valueOf2=Integer.valueOf(23450987);//public static Integer valueOf(int i)
System.out.println("valueOf:"+valueOf2);

System.out.println("                                        ");
System.out.println("  Long constructor  ");
//long constructor

Long long1=new Long(16789124567l);//public Long(long value)
System.out.println("long1:"+long1);

Long long2=new Long("636331616789");//public Long(String s)
System.out.println("long2:"+long2);

System.out.println("  Long methods  ");
//long methods
int compare3=Long.compare(long1,long2);//public static int compare(long x, long y)
System.out.println("compare:"+compare3);        

String toBinaryString2=Long.toBinaryString(long1);//public static String toBinaryString(long i)
System.out.println("toBinaryString:"+toBinaryString2);

String toString2=Long.toString(long1);//public static String toString(long i)
System.out.println("toString:"+toBinaryString2);

long parseLong1=Long.parseLong("198273645");//public static long parseLong(String s)
System.out.println("parseLong:"+parseLong1);

long valueOf3=Long.valueOf("435678");//public static Long valueOf(String s)
System.out.println("valueOf:"+valueOf3);

long valueOf4=Long.valueOf(long2);//public static Long valueOf(long l)
System.out.println("valueOf:"+valueOf4);

long decode1=Long.decode("-#45");//public static Long decode(String nm)Signopt 0X HexDigits
System.out.println("decode:"+decode1);

int bitcount1=Long.bitCount(long1);//public static int bitCount(long i)
System.out.println("bitCount:"+bitCount1);

int signum3=Long.signum(long2);//public static int signum(long i)
System.out.println("signum:"+signum3);

long reverseBytes2=Long.reverseBytes(long2);//public static long reverseBytes(long i)
System.out.println("reverseBytes:"+reverseBytes2);

System.out.println("                                                       ");
System.out.println("  Float constructor  ");
//float constructor

Float float1=new Float(12.0);//public Float(float value)
System.out.println("float1:"+float1);

Float float2=new Float(12.995677);//public Float(double value)
System.out.println("float2:"+float2);

Float float3=new Float("12.33");//public Float(String s)
System.out.println("float3:"+float3);

System.out.println("  Float methods  ");
//float methods

int compare4=Float.compare(float1,float2);//public static int compare(float f1, float f2)
System.out.println("compare:"+compare4);      

int compareto1=float1.compareTo(float2);//public int compareTo(Float anotherFloat)
System.out.println("compareTo:"+compareto1);

int floatToIntBits1=Float.floatToIntBits(float3);//public static int floatToIntBits(float value)
System.out.println("floatToIntBits:"+floatToIntBits1);

int floatToRawIntBits1=Float.floatToRawIntBits(float1);//public static int floatToRawIntBits(float value)
System.out.println("floatToRawIntBits:"+floatToIntBits1);

int hashcode1=float2.hashCode();//public int hashCode()
System.out.println("hashcode:"+hashcode1);

boolean equalto=float1.equals(123.00);//public boolean equals(Object obj)
System.out.println("equals:"+equalto);

boolean isnum=Float.isNaN(0.00f);//public static boolean isNaN(float v)
System.out.println("isNaN:"+isnum);

boolean isinfinite=Float.isInfinite(0.11111111f);//public static boolean isInfinite(float v)
System.out.println("isInfinite:"+isinfinite);

String characters=float1.toString();//public String toString()
System.out.println("toString:"+characters);

System.out.println("                                                  ");
System.out.println("  Double constructor  ");
//Double constructor

Double double1=new Double(1.8976543);//public Double(double value)
System.out.println(double1);

Double double2=new Double("1.23452345");//public Double(String s)
System.out.println(double2);

System.out.println("  Double method  ");
//double methods

int compare5=Double.compare(double1,double2);//public static int compare(double d1, double d2)
System.out.println("compare:"+compare5);      

int compareto2=double1.compareTo(double2);//public int compareTo(double anotherDouble)
System.out.println("compareTo:"+compareto2);

double longBitsToDouble1=Double.longBitsToDouble(234567908l);//public static double longBitsToDouble(long bits)
System.out.println("longBitsToDouble:"+longBitsToDouble1);

boolean isIt=double1.isNaN();//public boolean isNaN()
System.out.println("isIt:"+isIt);

double doubleValue2=double2.doubleValue();//public double doubleValue()
System.out.println("doubleValue:"+doubleValue2);

long doubleToLongBits2=Double.doubleToLongBits(double1);//public static long doubleToLongBits(double value)
System.out.println("doubleToLongBits:"+doubleToLongBits2);

boolean is=double1.equals(234);//public boolean equals(Object obj
System.out.println("isIT:"+is);

String tostring1=Double.toString(double2);//public static String toString(double d)
System.out.println("string:"+tostring1);

String hexadecimal=Double.toHexString((double)0.25);//public static String toHexString(double d)
System.out.println("hexadecimal:"+hexadecimal);

System.out.println("                                                              ");
System.out.println("  character constructor  ");
//character constructor 

Character value=new Character('p');//public Character(char value)
System.out.println(value);

System.out.println("  character methods  ");

int charCount1=Character.charCount((int)2);//public static int charCount(int codePoint)
System.out.println("charCount:"+charCount1);

int toPoint=Character.toCodePoint((char)0,(char)1);//public static int toCodePoint(char high,char low)
System.out.println("toCodePoint:"+toPoint);           

CharSequence seq="women";
int indexing1=Character.codePointAt(seq,1);//public static int codePointAt(CharSequence seq, int index)
System.out.println("codePointAt:"+indexing1);             

char[] charactersAre={'p','r','a','r','t','h','u'};//public static int codePointAt(char[] a, int index)
  int indexing=Character.codePointAt(charactersAre,1);
System.out.println("codePointAt:"+indexing);  

int limit=Character.codePointAt(charactersAre,1,4);//public static int codePointAt(char[] a,int index,int limit)
System.out.println("codePointAt:"+limit);           
              
int indexing2=Character.codePointBefore(seq,1);
System.out.println("codePointAt:"+indexing2);//public static int codePointBefore(CharSequence seq,int index)
                  
int indexing3=Character.codePointBefore(charactersAre,1);//public static int codePointBefore(char[] a,int index)
System.out.println("codePointBefore:"+indexing3);  

int indexing4=Character.toChars(2,charactersAre,4);//public static int toChars(int codePoint,char[] dst,int dstIndex)
System.out.println("toChars:"+indexing4);

char[] indexing5=Character.toChars(2);//public static char[] toChars(int codePoint)
System.out.println("toChars:"+indexing5);

int indexing6=Character.offsetByCodePoints(seq,1,3);//public static int offsetByCodePoints(CharSequence seq,  int index,  int codePointOffset)
System.out.println("offsetByCodePoints:"+indexing6);

System.out.println("                                                               ");
System.out.println("  boolean constructor  ");
//boolean constructor
Boolean boolean1=new Boolean(true);//public Boolean(boolean value)
System.out.println(boolean1);

Boolean boolean2=new Boolean("false");//public Boolean(String s)
System.out.println(boolean2);

System.out.println("  Boolean constructor  ");

boolean result1=boolean1.booleanValue();//public boolean booleanValue()
System.out.println(result1);

boolean result2=Boolean.valueOf(false);//public static Boolean valueOf(boolean b)
System.out.println(result2);

String result3=Boolean.toString(true);//public static String toString(boolean b)
System.out.println(result3);

String result4=boolean2.toString();//public String toString()
System.out.println(result4);

int result5=boolean1.hashCode();//public int hashCode()
System.out.println(result5);

boolean result6=boolean1.equals(1);//public boolean equals(Object obj)
System.out.println(result6);

boolean result7=Boolean.getBoolean("cat");//public static boolean getBoolean(String name)
System.out.println(result7);

int result8=boolean1.compareTo(false);//public int compareTo(Boolean b)
System.out.println(result8);

int result9=Boolean.compare(true,true);//public static int compare(boolean x,boolean y)
System.out.println(result9);

boolean result10=Boolean.parseBoolean("sleep");//public static boolean parseBoolean(String s)
System.out.println(result10);

}
}