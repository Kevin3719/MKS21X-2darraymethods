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
public static int maxlength(int[][] ary) {
  int output = 0;
  for (int i = 0; i < ary.length; i += 1) {
    if (output < ary[i].length) {
      output = ary[i].length;}
    }
    return output;
  }

 public static int[] allColSums(int[][] ary){
   int[] output = new int[maxlength(ary)];
   for (int i = 0; i < output.length; i += 1) {
     output[i] = columnSum(ary, i);
   }
   return output;
 }
     //Returns an array with the column sum of each column of ary.
     /*
   *PART 3 - use prior methods where appropriate
   */
   public static boolean isRowMagic(int[][] ary){
    for (int i = 0; i < ary.length; i += 1) {
      if (rowSum(ary, i) != rowSum(ary, 0)) {
        return false;
      }
    }
     return true;
   }
     //checks if the array is row-magic (this means that every row has the same row sum).

   public static boolean isColumnMagic(int[][] ary){
     for (int i = 0; i < maxlength(ary); i += 1) {
       if (columnSum(ary, i) != columnSum(ary, 0)) {
         return false;
       }
     }
      return true;
   }
    //checks if the array is column-magic (this means that every column has the same column sum).

}
