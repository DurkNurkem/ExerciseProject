package ExerciseProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**** Project Name: Exercise app
 ***** Created by: Ciaran McCallion
 ***** Creation date: 20/01/2024
 ***** Last edited: 21/01/2024
 ***** Project description: Read and write CVS files containing previous workout data and new data
 *****/
public class ReadWrite
{

   private static int weightLineCount = 0; //counts amount of lines that exist in  weight CVS
   public static WeightTrain[] getWeightArray()
   {
      String path = "D:\\Software personal\\Exercise app\\ExerciseAppProject\\src\\ExerciseProject\\WeightTraining.csv";
      String line = "";
      int currentLineRead=0;//track current weight CVS line being read

      try
      {
         BufferedReader br = new BufferedReader(new FileReader(path)); //open buffer

         //Check how many lines on file to set Array length
         while((line = br.readLine()) != null)
         {
            weightLineCount++;
         }//while



         //create array to store weightTraining object instances
         WeightTrain[] weightArray = new WeightTrain[weightLineCount];

         br.close(); //Close buffer again before next buffer reader

         br = new BufferedReader(new FileReader(path)); //open buffer again for second read

         while((line = br.readLine()) !=null)
         {
            String[] values = line.split(",");
            weightArray[currentLineRead] = new WeightTrain(values[0], Double.parseDouble(values[1]) ,values[2], values[3], values[4], Double.parseDouble(values[5]), Integer.parseInt(values[6]), Integer.parseInt(values[7]));
            currentLineRead++;
         }//while


         return weightArray;
      }//try


      catch (FileNotFoundException e)
      {
         System.out.print("File not found, please check file location.");
      }//catch FileNotFound
      catch (IOException e)
      {
         e.printStackTrace();
      }//catch IOException

      return null;
   }//getWeightArray


   protected static int getWeightLineCount()
   {
      return weightLineCount;
   }

}//class
