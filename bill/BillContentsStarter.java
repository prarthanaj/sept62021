class BillContentsStarter{
public static void main(String[] basics)
{
BillContents billContents=new BillContents(3842,"DRWPSK1ZZ");
int billNo=billContents.billNo;
System.out.println(billNo);

String gstIn=billContents.gstIn;
System.out.println(gstIn);

String party=billContents.party;
System.out.println(party);

ShopsName name=billContents.name;
System.out.println(name);
}

}