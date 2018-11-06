public class ArrayMethods{

   /*
   *PART 1
   */
   public static int rowSum(int[][] ary, int x){
     int output = 0;
     for (int i = 0; i < ary[x].length; i += 1) {
       output += ary[x][i];
     }
     return output;
   }

   public static int columnSum(int[][] ary, int x){
    //returns the sum of the elements in Column x of ary (careful with rows of different lengths!).
    int output = 0;
    for (int i = 0; i < ary.length; i += 1) {
      if (ary[i].length > x) {
        output += ary[i][x];
      }
    }
    return output;
  }
  public static int[] allRowSums(int[][] ary){
    int[] output = new int[ary.length];

    for (int i = 0; i < ary.length; i += 1) {
      output[i] = rowSum(ary, i);
    }

    return output;

  }
 //returns an array of the row sums for each row of ary.
 //Index i of the return array contains the sum of elements in row i.




 }
