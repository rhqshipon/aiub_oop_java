public class Main {
	public static void main(String[] args) {
		
		// Data need to input
		// public GraduateStudent(String name, int age, String studentId, String major, String researchTopic, String advisorName)
		
		GraduateStudent g1[] = new GraduateStudent[2];
		g1[0] = new GraduateStudent("Mosharraf Karim", 63, "18-86572-3", "Comedy", "Bangi Chash", "Mosh");
		GraduateStudent g2[] = new GraduateStudent[3];
		g2[2] = new GraduateStudent("Mostofa Kamal", 67, "14-64825-3", "Typography", "Bijoy Keyboard", "Most");
		
		for (int i = 0; i < g1.length; i++)		{
			if (g1[i] != null)	{
				g1[i].displayGraduateInfo();
				System.out.println();
			}
			
			else	{
				System.out.println("The specific data in the index " + i + " of g1 object is empty or null!");
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < g2.length; i++)		{
			if (g2[i] != null)	{
				g2[i].displayGraduateInfo();
				System.out.println();
			}
			
			else	{
				System.out.println("The specific data in the index " + i + " of  g2 object is empty or null!");
			}
		}
		

	}
}
