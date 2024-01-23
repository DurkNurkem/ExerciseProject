package ExerciseProject;

import java.util.Scanner;

/**** Project Name: Exercise app
 ***** Created by: Ciaran McCallion
 ***** Creation date: 21/01/2024
 ***** Last edited: 23/01/2024
 ***** Project description: Switch Case methods to insure correct string inputs
 *****/
public class SwitchCase
{

   Scanner kb = new Scanner(System.in);

   protected static String chooseET() //Choose Exercise Type
   {
      Scanner kb = new Scanner(System.in);
      String choice = "";
      int option;

      do
      {
         System.out.println("""
                 What exercise did you do? (Enter corresponding number)
                 \n1. Bench press
                 \n2. Bicep curl
                 \n3. Pull ups
                 \n4. Peck fly
                 \n5. Reverse fly
                 \n6. Crunches
                 \n7. Squats
                 """);
         option = kb.nextInt();

         switch (option)
         {
            case 1: choice = "Bench press";break;
            case 2: choice = "Bicep Curl";break;
            case 3: choice = "Pull ups";break;
            case 4: choice = "Peck fly";break;
            case 5: choice = "Reverse fly";break;
            case 6: choice = "Crunches";break;
            case 7: choice = "Squats";break;
         }//switch
      }//do
      while (option<1 || option>7);

      return choice;
   }//chooseET()

   protected static String chooseWM() //choose free weights or machine weights
   {
      Scanner kb = new Scanner(System.in);
      int option;
      String choice = "";

      do
      {
         System.out.println("""
                 Did you use (Enter corresponding number):
                 \n1.Free weights
                 \n2.Exercise machine
                 """);
         option = kb.nextInt();

         switch (option)
         {
            case 1: choice = "Free";break;
            case 2: choice = "Machine";break;
         }//switch
      }//do
      while (option<1 || option>2);

      return choice;
   }//chooseWM

   protected static String chooseWT() //choose barbell or dumbbell weights
   {
      Scanner kb = new Scanner(System.in);
      int option;
      String choice = "";

      do
      {
         System.out.println("""
                 Did you use (Enter corresponding number):
                 \n1. Barbell
                 \n2. Dumbbells
                 """);
         option = kb.nextInt();

         switch (option)
         {
            case 1: choice = "Barbell";break;
            case 2: choice = "Dumbbells";break;
         }//switch
      }//do
      while (option<1 || option>2);

      return choice;
   }//chooseWT


}//class
