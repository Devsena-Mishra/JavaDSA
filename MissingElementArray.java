public class MissingElementArray {

      public int missingElement(int n, int arr[])
      {
       /** To find the missing element in the array, you can use a mathematical approach that leverages the sum of the first n natural numbers. The sum of the first n natural numbers is given by the formula:
        *  totalsum = n* (n+1)/2
        *
        *  To find missin number - collect ArraySum and subtract totalsum from it
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
