package ExerciseProject;

import java.util.Scanner;

/**** Project Name:
 ***** Created by: Ciaran McCallion
 ***** Creation date: 23/01/2024
 ***** Last edited:
 ***** Project description: Allows users to add workouts they've completed
 *****/
public class AddWorkout
{

   public static WeightTrain addWeightWO()
   {

      Scanner kb = new Scanner(System.in);
      String sd,et,wm,wt; //sd=sessionDate, et = exerciseType, wm=weightMode, wt=weightType
      int s,r; //s=sets, r=reps
      double bw,w;  //bw=bodyWeight, w=weight

      sd=Exercise.createDate();

      System.out.print("Please enter your current bodyWeight: ");
      bw=kb.nextDouble();
      et=SwitchCase.chooseET();
      wm=SwitchCase.chooseWM();
      wt=SwitchCase.chooseWT();
      System.out.print("How much weight did you lift: ");
      w=kb.nextDouble();
      System.out.print("How many sets did you do: ");
      s=kb.nextInt();
      System.out.print("How many reps did you do per set: ");
      r=kb.nextInt();

      return new WeightTrain(sd,bw,et,wm,wt,w,s,r);

   }//addWeightWO()


}//class
