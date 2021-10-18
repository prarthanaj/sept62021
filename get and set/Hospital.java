class Hospital{

String name;

Hospital()
{
System.out.println("invoke no arg constr");
}

Hospital(String name)
{
this.name=name;
}

String getName()
{
System.out.println("invoke getName");
return this.name;
}
}