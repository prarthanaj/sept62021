class Location{
String startingPoiny="Bangalore";
float distance;
String destination;
int pincode;
String travelType;

Location(String dest,String type)
{
System.out.println("dest:"+dest);
System.out.println("type:"+type);
destination=dest;
travelType=type;
}
Location()
{
	System.out.println("invoked location construct null");
}
Location(String dest)
{
	System.out.println("invoked location construct string");
	System.out.println("dest:"+dest);
	destination=dest;
}
}