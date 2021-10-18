class HospitalStarter{

public static void main(String[] args)
{
Hospital hospital=new Hospital("manipal");
System.out.println(hospital.name);
String name=hospital.getName();
if(name==null)
{
System.out.println("name is not pointing to any memory");
}
else{
System.out.println("Hospital name:"+name);
}
Hospital hospital1=new Hospital();
System.out.println(hospital1.name);
String name1=hospital1.getName();
if(name1!=null)
{
System.out.println("Hospital name1:"+name1);
}
}



}