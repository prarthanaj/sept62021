class Camera{

String brand;
int model;
float pixel;
int price=4;


Camera()
{
System.out.println("invoke no arg constr");
}

Camera(String brand,int model)
{
this.brand=brand;
this.model=model;
}

String getBrand()
{
System.out.println("invoke getBrand");
return this.brand;
}
int getModel()
{
System.out.println("invoke getModel");
return this.model;
}
void setPixel(float pixel)
{
this.pixel=pixel;
System.out.println("invoke setPixel ");
}
void displayPrice()
{
System.out.println("invoked displayPrice");
double totalPrice=this.model*this.price;
System.out.println(totalPrice);
}
}
