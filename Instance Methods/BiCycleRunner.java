class BiCycleRunner{
public static void main(String[] holidays)
{
BiCycle bicycle=new BiCycle();
bicycle.brake();

bicycle.move();

String color=bicycle.color;
System.out.println(color);

int price=bicycle.price;
System.out.println(price);

String brand=bicycle.brand;
System.out.println(brand);

Type type=bicycle.type;
System.out.println(type);

bicycle.displayDetails();

}
}