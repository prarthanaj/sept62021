class HandBagStarter{
public static void main(String[] tea)
{
System.out.println("invoked handbagstarter");
String colour="Black";
String brandname="Mango";
String sizeof="small";
String material="leather";

new HandBag(colour,brandname,sizeof,material);

new HandBag();

new HandBag("LV");

new HandBag("H&M");
}
}