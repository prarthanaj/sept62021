class BiCycle{
String color="ORANGE";
int price=10000;
String brand="FIREFOX";
Type type=Type.ROAD;
void brake()
{
System.out.println("invoke no arg brake construct");
}
 void move()
{
System.out.println("invoke no arg move construct");
}

void displayDetails()
{
System.out.println("invoked displayvalue");
System.out.println("Color is:"+this.color);
System.out.println("Price is:"+this.price);
System.out.println("Brand is:"+this.brand);
}
}


