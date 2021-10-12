class NewsPaperStarter{
public static void main(String[] args)
{
NewsPaper newsPaper=new NewsPaper("the hindu",3.50f);
String name=newsPaper.name;
System.out.println(name);
float price=newsPaper.price;
System.out.println(price);
NewsPaperLang lang=newsPaper.lang;
System.out.println(lang);
String header=newsPaper.HeadLine;
System.out.println(header);

newsPaper.lang=NewsPaperLang.ENGLISH;
lang=newsPaper.lang;
System.out.println(lang);

newsPaper.noOfPages=12;
System.out.println(newsPaper.noOfPages);
}
}