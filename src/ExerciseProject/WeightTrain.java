package ExerciseProject;

import java.text.DecimalFormat;

/**** Project Name: Exercise app
 ***** Created by: Ciaran McCallion
 ***** Creation date: 19/01/2024
 ***** Last edited: 21/01/2024
 ***** Project description: Sub class for weight exercises such as Push ups, pulls ups, bench presses, bicep curls etc...
 *****/
public class WeightTrain extends Exercise
{

   private String exerciseType, weightMode, weightType;
   private double weight;
   private int sets, reps;
   DecimalFormat df = new DecimalFormat("00.00");

   //Default Constructor
   public WeightTrain(String pSessionDate, double pBodyWeight)
   {
      super(pSessionDate, pBodyWeight);
      exerciseType= "unknown";
      weightMode="unknown";
      weightType="unknown";
      weight=0;
      sets=0;
      reps=0;
   }

   //Constructor Method
   public WeightTrain(String pSessionDate, double pBodyWeight, String pExerciseType, String pWeightMode, String pWeightType, double pWeight, int pSets, int pReps)
   {
      super(pSessionDate, pBodyWeight);
      exerciseType=pExerciseType;
      weightMode=pWeightMode;
      weightType=pWeightType;
      weight=pWeight;
      sets=pSets;
      reps=pReps;
   }

   public String toString()
   {
      return "\nSession date: "+sessionDate
              +"\nBody weight: "+df.format(bodyWeight)+"kgs"
              +"\nExercise: "+exerciseType
              +"\nFree/ Machine weights: "+weightMode
              +"\nWeight type: "+weightType
              +"\nWeight lifted: "+df.format(weight)+"kgs"
              +"\nSets: "+sets
              +"\nReps: "+reps;
   }

   //set object attributes
   protected void setExerciseType(String pExerciseType)
   {
      exerciseType=pExerciseType;
   }//setExerciseType()
   protected void setWeightMode(String pWeightMode)
   {
      weightMode=pWeightMode;
   }//setWeightMode()
   protected void setWeightType(String pWeightType)
   {
      weightType=pWeightType;
   }//setWeightType()
   protected void setWeight(double pWeight)
   {
      weight=pWeight;
   }//setWeight()
   protected void setSets(int pSets)
   {
      sets=pSets;
   }//setSets()
   protected void setReps(int pReps)
   {
      reps=pReps;
   }//setReps()

   //get objects attributes
   protected String getExerciseType()
   {
      return exerciseType;
   }//getExerciseType()
   protected String getWeightMode()
   {
      return weightMode;
   }//getWeightMode()
   protected String getWeightType()
   {
      return weightType;
   }//getWeightType
   protected double getWeight()
   {
      return weight;
   }//getWeight()
   protected int getSets()
   {
      return sets;
   }//getSets()
   protected int getReps()
   {
      return reps;
   }//getReps()

}//class
