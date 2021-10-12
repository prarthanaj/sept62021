class BillContents{
ShopsName name=ShopsName.MART;
String party="CASH";
int billNo;
String gstIn;
float total;
int noOfItems;

BillContents(int billNo,String gstIn)
{
	this.billNo=billNo;
	this.gstIn=gstIn;
	System.out.println("invoke billNo and gst construct");
}

}