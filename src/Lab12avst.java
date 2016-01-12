// Lab12avst.java     This is the student starting version.
// This assignment pertains to some of the "Magpie" AP Lab Materials
//***************************************************************************
// The "Magpie" AP Lab is created for the College Board APCS
// curriculum by Laurie White.
// Leon Schram has altered some of the "Magpie" files to focus on 
// specific CS topics as the "Magpie" Lab is integrated into the curriculum.

 
import java.util.ArrayList;
import java.util.Scanner;

public class Lab12avst
{
   public static void main(String[] args)
   {
      MagpieLab12a maggie = new MagpieLab12a();

      System.out.println (maggie.getGreeting());
      Scanner in = new Scanner (System.in);
      String statement = in.nextLine();

      while (!statement.equals("Bye"))
      {
         System.out.println (maggie.getResponse(statement));
         statement = in.nextLine();
      }
   }
}


class MagpieLab12a
{
	private static ArrayList<String> answers = new ArrayList<String>();
	final  static int NUMBER_OF_RESPONSES = 9;
	private static String answers1[] = new String[NUMBER_OF_RESPONSES];
	
   public String getGreeting()
   {
      return "Hello, let's talk.";
   }

   
   public String getResponse(String statement)
   {
      String response = "";
      if (statement.indexOf("no") >= 0)
      {
         response = "Why so negative?";
      }
      else if (statement.indexOf("mother") >= 0
            || statement.indexOf("father") >= 0
            || statement.indexOf("sister") >= 0
            || statement.indexOf("brother") >= 0)
      {
        response = "Tell me more about your family.";
      }
      else
      {
         response = getRandomResponse();
      }
      return response;
   }
   
  public static void Addanswers(){
	   
	   String answers1[] = {"what?","why?","leave me alone.","i hate you","go away and never come back","i herd your mother was a nice lady","you are a horrible person","you need to just not","meh","your weird"};
	   
	   for(int k = 0; k < NUMBER_OF_RESPONSES; k++){
		   String yes = answers1[k];
		   answers.add(yes);
		   System.out.println(yes);
	   }
	   
   }

   private String getRandomResponse()
   {
      
      double r = Math.random();
      int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
      String response = "";
      String Response = (String) answers.get(whichResponse);
      
      response = Response;

      return response;
   }
}
