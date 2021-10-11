class StabilizerStarter{
public static void main(String[] coffee)
{

int weight=4;
double rating=4.6;
String operation="both";


new Stabilizer();

Stabilizer stabilizer =new Stabilizer ("MICROTEK");
System.out.println(stabilizer);
System.out.println(stabilizer.brand);

Stabilizer stabilizer1=new Stabilizer("manual");
System.out.println(stabilizer1);
System.out.println(stabilizer1.type);
Stabilizer stabilizer6=new Stabilizer("10");
System.out.println(stabilizer6.size);
Stabilizer stabilizer7=new Stabilizer("4000");
System.out.println(stabilizer7.price);

Stabilizer stabilizer8=new Stabilizer("white");
System.out.println(stabilizer8.colors);

Stabilizer stabilizer9=new Stabilizer();
Stabilizer stabilizer4=new Stabilizer("both");
System.out.println(stabilizer9.rating);
System.out.println(stabilizer4.operation);
}
}
