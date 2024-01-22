package ExerciseProject;

import java.util.Scanner;

/**** Project Name: Exercise App
 ***** Created by: Ciaran McCallion
 ***** Creation date: 19/01/2024
 ***** Last edited:
 ***** Project description: Super class for Exercise
 *****/
public class Exercise
{

   protected String sessionDate;
   protected double bodyWeight;

   //Defualt Constructor
   public Exercise()
   {
      sessionDate="DD/MM/YYYY";
      bodyWeight= 0;
   }
   //Constructor Method
   public Exercise(String pSessionDate, double pBodyWeight)
   {
      sessionDate=pSessionDate;
      bodyWeight=pBodyWeight;
   }

   //setters
   protected void setSessionDate(String pSessionDate)
   {
      sessionDate = pSessionDate;
   }//setSessionDate()
   protected void setBodyWeight(double pBodyWeight)
   {
      bodyWeight=pBodyWeight;
   }//setBodyWeight()

   //getters
   protected String getSessionDate()
   {
      return sessionDate;
   }//getSessionDate()
   protected double getBodyWeight()
   {
      return bodyWeight;
   }//getBodyWeight()

}//class
