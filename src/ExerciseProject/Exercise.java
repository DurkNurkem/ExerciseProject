package ExerciseProject;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Scanner;

/**** Project Name: Exercise App
 ***** Created by: Ciaran McCallion
 ***** Creation date: 19/01/2024
 ***** Last edited: 23/01/2024
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

   protected static String createDate()
   {
      DecimalFormat dateFormat = new DecimalFormat("00");
      int day, month, year;
      String myDate;

      Calendar dateTime = Calendar.getInstance();
      day=dateTime.get(Calendar.DATE);
      month=(dateTime.get(Calendar.MONTH))+1;
      year=(dateTime.get(Calendar.YEAR));
      myDate = (String)(dateFormat.format(day)+"/"+dateFormat.format(month)+"/"+year);

      return myDate;

   }//createDate()

}//class
