class Stabilizer{
String brand="vGuard";
int size=12;
int price=3000;
String type="norm";
String colors="black";
int volt=170;
String usedfor="LED TV";
double rating=4.4;
String operation="automatic";
int weight=3;
int warrantyyear=3;
boolean warranty=true;
int discount=20;
String availability="ELECTRONIC STORE";
boolean inmarket=true;

Stabilizer()
{
System.out.println("invoked Stabilizer no arg const");
}

Stabilizer(String brand)
{
System.out.println("invoked Stabilizer const");
System.out.println(this);//instance 
System.out.println(brand);//local
System.out.println(this.brand);//instance
this.brand=brand;//local
System.out.println("end of  brand construct");
}
Stabilizer(String type,int size,int prize)
{
System.out.println("invoked Stabilizer const");
System.out.println(this);//instance 
System.out.println(type);//local
System.out.println(this.type);//instance
this.type=type;//local
this.size=size;
this.price=price;
System.out.println("end of  character construct");

}
Stabilizer(String colors,int volt,String usedfor)
{
System.out.println("invoked Stabilizer clr const");

this.colors=colors;//local
this.volt=volt;
this.usedfor=usedfor;
System.out.println("end of clr construct");
}
Stabilizer(double rating,String operation)
{
System.out.println("invoked Stabilizer last const");

this.rating=rating;//local
this.operation=operation;

System.out.println("end of last construct");
}
}