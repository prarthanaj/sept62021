class CameraStarter{

public static void main(String[] args)
{
Camera camera=new Camera("SONY",4);
System.out.println(camera.brand);
String brand=camera.getBrand();

if(brand==null)
{
System.out.println("brand is not pointing to any memory");
}
else
{
System.out.println("Camera brand:"+brand);
}

Camera camera1=new Camera("NIKON",6);
System.out.println(camera1.brand);
String brand1=camera1.getBrand();
if(brand1!=null)
{
System.out.println("Camera brand1:"+brand1);
}

Camera camera2=new Camera();
camera.model=15;
System.out.println(camera2.model);
int model=camera2.getModel();
if(model==0)
{
System.out.println("model is not pointing to any memory");
}
camera.displayPrice();

}



}