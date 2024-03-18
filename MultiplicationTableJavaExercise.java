public class MultiplicationTableJavaExercise 
{
  // JM | March 18, 2024 8:55 PM 
  public static void main(String[] args) 
  {
    System.out.println("        1   2   3   4   5   6   7   8   9  10  11  12");
    System.out.println("-----------------------------------------------------");
    
    for (int i = 1; i <= 12; i++)
    {
      if (i <= 9)
      {
        System.out.print("  "+ i +"  |");
      }
      else 
      {
        System.out.print(" "+ i +"  |");
      }
      
      for (int j = 1; j <= 12; j++) 
      {
        int product = i*j;
        if (product <= 9)
        {
          System.out.print("  "+ product +" ");
        }
        else  if (product <= 99)
        {
          System.out.print(" "+ product +" ");
        }
        else 
        {
          System.out.print(""+ product +" ");
        }
      }
      System.out.println("");
    }
  }
}
