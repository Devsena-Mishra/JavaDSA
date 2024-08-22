public class MissingElementArray {

      public int missingElement(int n, int arr[])
      {
       /** To find the missing element in the array, use a mathematical approach that leverages the sum of the first n natural numbers. The formula gives the sum of the first n natural numbers:
        *  totalsum = n* (n+1)/2
        *
        *  To find missing number - collect ArraySum and subtract total sum from it
        *  arraysum - totalsum = the returned number is the missing element
        *
        *
        * **/



           int sum_of_natural_numbers = n*(n+1)/2;
           int arraySum = 0;

          for(int  a :arr) {
              arraySum += a;
          }

          return sum_of_natural_numbers-arraySum;

      }

}
