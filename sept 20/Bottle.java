class Bottle
{
 public static void storing(String color,String quality,String[] brands)
  {
	System.out.println("invoked storing");
	System.out.println("Color:"+color);
	System.out.println("Quality:"+quality);
	System.out.println("invoke price");
	int bottlePrice=350;
	System.out.println("Price:"+bottlePrice);
	System.out.println("invoke bottleCapacity");
	double bottleCapacity=0.5;
	System.out.println("BottleCapacity:"+bottleCapacity);
	
	System.out.println("invoke Brands");
	
	for(int brandIndex=0;brandIndex<brands.length;)
	{
		String brand=brands[brandIndex];
	    System.out.println(brand);
		brandIndex++;
    }
  }
}
