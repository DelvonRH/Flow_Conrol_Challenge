public class AsciiChars 
		{
		  public static void printNumbers()
		  {
			  char Asciinumbers;
			  
			  for(int i = 48; i <= 57; i++)
			  {
				 Asciinumbers = (char) i;
				 System.out.print(Asciinumbers + " ");
			  }
			   
		  }

		  public static void printLowerCaseLetters()
		  {
			  char AsciiLowerCase;
			  
			  for(int i = 97; i <= 122; i++)
			  {
				 AsciiLowerCase = (char) i;
				 System.out.print(AsciiLowerCase + " ");
			  }
		  }

		  public static void printUpperCaseLetters()
		  {
			  char AsciiUpperCase;
			  
			  for(int i = 65; i <= 90; i++)
			  {
				 AsciiUpperCase = (char) i;
				 System.out.print(AsciiUpperCase + " ");
			  }
		  }
		}