package ExerciseProject;

/**** Project Name:
 ***** Created by: Ciaran McCallion
 ***** Creation date: 19/01/2024
 ***** Last edited:
 ***** Project description: Test the programme
 *****/
public class TestClass
{
   public static void main(String[] args)
   {

      WeightTrain[] myWorkOut = ReadWrite.getWeightArray();

      //System.out.println(myWorkOut[0]);
      //System.out.println(myWorkOut[1]);

      for (int count = 0;count<myWorkOut.length;count++)
      {
         System.out.println(myWorkOut[count]);
      }


   }//Main
}//class
