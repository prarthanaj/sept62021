class StringStarter{
public static void main(String[] vals)
{
 
 String data="NONPRIMITIVE";//constant pool memory
 System.out.println(data);

 String type=new String(data);//instance memory
 System.out.println(type);
if(data==type){//check on memory
  System.out.println("P2SM");
 }
else{
  System.out.println("not P2SM");
 }
 
 String prop="IMMUTABLE"; //constant pool

 String character="IMMUTABLE"; //constant pool
 System.out.println(character);
if(prop==character){
 System.out.println("P2SM");
  }
else{
 System.out.println("not P2SM");
  }
  
  String define=new String("STRINGOFCHARACTERS");
  System.out.println(define);
  
  String canBe=new String(define);
  System.out.println(canBe);
if(define==canBe){
	  System.out.println("P2SM");  
  }
else{
	  System.out.println("not P2SM");
  }
 
  String capitalCity="BNG";
  String rajaDani="BNG";
if(capitalCity!=rajaDani){
	  System.out.println(" not P2SM");
  }
  
  String gardenCity=new String("BNG");
  System.out.println(gardenCity);
if(capitalCity!=gardenCity){
	  System.out.println("not P2SM");
  }
  
   String siliconCity=new String(gardenCity);
   System.out.println(siliconCity);
if(siliconCity==gardenCity){
	   System.out.println("P2SM");
   }
else{
	   System.out.println("not P2SM");
   }
   //public String(byte[] bytes)
   
   String known=new String("ITHUB");
   System.out.println(known);
if(rajaDani!=known){
   System.out.println("not P2SM");
   }
   //public String concat(String str)
  String example="abcd";
  String example1="yuiop";
  String concat=example.concat(example1);
  System.out.println(concat);
  
  //public boolean matches(String regex)
	String regex="abcd";
	boolean check=regex.matches("abcf");
	System.out.println(check);
	
	//public boolean contains(CharSequence s)
	//CharSequence s="hour";
	
	//boolean check1=s.contains("ou");
	//System.out.println(check1);
	
	//public String replaceFirst(String regex,String replacement)
	
	//public int compareTo(String anotherString)
	String anotherString="oreo";
	int check3=anotherString.compareTo("ore");
	System.out.println(check3);
	
	//public int compareToIgnoreCase(String str)
	String str="PRARTHANA";
	int checkName=str.compareToIgnoreCase("PRARTHana");
	System.out.println(checkName);
	
	//public static String format(Locale l, String format,Object... args)
	
	//public boolean endsWith(String suffix)
	String suffix="END";
	boolean suffixIs=suffix.endsWith("D");
	System.out.println(suffixIs);
	
	//public int codePointBefore(int index)
	int index=siliconCity.codePointBefore(1);
    System.out.println(index);
	
	//public int compareTo(String anotherString)
    int compared=siliconCity.compareTo("BANGALURU");
	System.out.println(compared);
	
	//public int compareToIgnoreCase(String str)
	int comparison=gardenCity.compareToIgnoreCase("BNG");
	System.out.println(comparison);
	
	//public boolean contentEquals(StringBuffer sb)
	StringBuffer sb = new StringBuffer("BNG");
	boolean contentCheck=siliconCity.contentEquals(sb);
	System.out.println(contentCheck);
	
	//public int lastIndexOf(String str)
	String brand="PUMA";
	int lastindex=brand.lastIndexOf("U");
	System.out.println(lastindex);
	
	//public String[] split(String regex)
	
	//public boolean startsWith(String prefix)
	String prefix="cd";
	boolean started=prefix.startsWith("c");
	System.out.println(started);
	
	
   }
}