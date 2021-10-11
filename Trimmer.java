class Trimmer{
String brand="MI";

Trimmer(String brand)
{
System.out.println("invoked Trimmer no-arg const");
System.out.println(this);//instance 
System.out.println(brand);//local
System.out.println(this.brand);//instance
this.brand=brand;//local
System.out.println("end of construct");
}
}