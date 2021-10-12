class BankOffers{
BankNames names=BankNames.IDBI;	
String accName="SEJAL";
int accNum=45678901;
String loanOffered;
float rateOfIntrest;
String insuranceTaken;
float rateOfIntrestInsu;

 BankOffers(String loanOffered,float rateOfIntrest)
 {
	 
	this (insuranceTaken);
	 this.loanOffered=loanOffered;
	 this.rateOfIntrest=rateOfIntrest;
	 System.out.println("loan and intrest constr");
	 
 }
 BankOffers(String insuranceTaken)
 {
	 this.insuranceTaken=insuranceTaken;
	 
	 System.out.println("INS a OF INS constr");
 }
 BankOffers()
 {
	 System.out.println("no arg construct");
	 this.rateOfIntrest=rateOfIntrest;
	 System.out.println(rateOfIntrest);
 }
 BankOffers(float rateOfIntrestInsu)
 {
	 this.rateOfIntrestInsu=rateOfIntrestInsu;
	 System.out.println("rateOfIntrestInsu construct");
 }
 
 
	
	 
	 
 
}