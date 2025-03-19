public class Variables	{
	//Instance variable
	public int insvar = 100;
	
	//Class variable
	public static int classvar = 200;
	
	public static void main(String[] args)    {
		
		//Local variable
		for(int i=0; i<5; i++)    {
			System.out.print(i + "   ");
		}
		
		System.out.println();
		
		int i = 0;
		while(i < 5)	{
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println();
		
		Variables v = new Variables();
		System.out.println(v.insvar);
		
		System.out.println(Variables.classvar);
	}
}