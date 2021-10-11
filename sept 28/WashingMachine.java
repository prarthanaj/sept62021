class WashingMachine
{
public static String washClothes(String[] clothes)
{
System.out.println("invoked washed clothes");
int size=clothes.length;
if(size>0 && size<3)
{
	return "START";
}
else if(size>5)
{
	return "OVERLOAD";
}
return "NA";
}







}