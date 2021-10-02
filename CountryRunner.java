class CountryRunner{
      public static void main(String[] value)
	  {
        String india="India";
        String indonesia="Indonesia";
        String pak="Pakistan";
        String jap="Japan";
        String bangladesh="Bangladesh";
		String phili="Philippines";
		String turk="Turkey";
		String iran="Iran";
		String iraq="Iraq";
		String nepal="Nepal";
		String nk="Northkorea";
		String yemen="Yemen";
		String saudiarabia="Saudiarabia";
		String malaysia="Malaysia";
		String afghan="Afghanistan";
		String syria="Syria";
		String laos="Laos";
		String israel="Israel";
		String georgia="Georgia";
		String qatar="Qatar";
		String mongolia="Mongolia";
		String kuwait="Kuwait";
		String cyprus="Cyprus";
		String bhutan="Bhutan";
		String maldives="maldives";
		String jordan="Jordan";
		
        String[] countries={india,indonesia,iran,iraq,israel,afghan,nk,bangladesh,bhutan,cyprus,georgia,jap,jordan,kuwait,laos,malaysia,maldives,mongolia,nepal,pak,phili,qatar,saudiarabia,syria,turk,yemen};
        String tempRef=countries[25];
		System.out.println(tempRef);
		int size=countries.length;

        System.out.println("list of asian countries:"+size);

        System.out.println("=========");
        for(int index=0;index < countries.length;)
		{
			String temp=countries[index];
			System.out.println(temp);
			index++;
		}
         
      }
}