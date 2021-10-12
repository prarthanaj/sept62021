class BankOfferStarter{
public static void main(String[] coffee)
{

BankOffers bankOffers=new BankOffers("HOME LOAN",7.9f);



String loanOffered=bankOffers.loanOffered;
System.out.println(loanOffered);

float rateOfIntrest=bankOffers.rateOfIntrest;
System.out.println(rateOfIntrest);

BankNames names=bankOffers.names;
System.out.println(names);

String accName=bankOffers.accName;
System.out.println(accName);

int accNum=bankOffers.accNum;
System.out.println(accNum);

BankOffers bankOffers1=new BankOffers("LIFE INSURANCE");
String insuranceTaken=bankOffers1.insuranceTaken;
System.out.println(insuranceTaken);


System.out.println(accName);


System.out.println(accNum);

bankOffers.names=BankNames.CANARA;
names=bankOffers.names;
System.out.println(names);

BankOffers bankOffers2=new BankOffers(6.9f);
float rateOfIntrestInsu=bankOffers2.rateOfIntrestInsu;
System.out.println(rateOfIntrestInsu);

bankOffers.names=BankNames.HDFC;
names=bankOffers.names;
System.out.println(names);

System.out.println(accName);

}

}