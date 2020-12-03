package by.zti.test;

public class Main {

	public static void main(String[] args) {
		String[][] szColors = new String[2][4];
		int i, j;
		
		for(i = 0; i < 2; i++)
			  for(j = 0; j < 3; j++)
			  {
			    szColors[i][j] = 
			      new String("Color (" + i + "," 
			        + j + ")");
			  }
		
		for(i = 0; i < 2; i++)
			  for(j = 0; j < 3; j++)
			  {
			    System.out.println(szColors[i][j]); 
			  }
		
		System.out.println("---------------------------------"); 
		
		String[][] szSounds = new String[2][];
		
		for(i = 0; i < szSounds.length; i++)
		{
		  szSounds[i] = new String[3];
		  for(j = 0; j < szSounds[i].length; j++)
		  {
		    szColors[i][j] = 
		      new String("Sound (" + i + "," 
		        + j + ")");
		  }     
		}
		
		for(i = 0; i < szSounds.length; i++)
			  for(j = 0; j < szSounds[i].length; j++)
			  {
			    System.out.println(szColors[i][j]); 
			  }
	}

}
