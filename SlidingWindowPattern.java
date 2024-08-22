import java.util.ArrayList;

public class SlidingWindowPattern {

  public static ArrayList <Integer> returnSubArray(int [] arr, int sum, int size) {
      //An example to show working of Sliding window pattern - DSA

      /** Problem: Given an unsorted array arr of size n that contains only non negative integers, find a
       * sub-array (continuous elements) that has sum equal to s.
       * You mainly need to return the left and right indexes(1-based indexing) of that subarray.

       In case of multiple subarrays, return the subarray indexes which come first on moving from left to right.
       If no such subarray exists return an array consisting of element -1.
       *
       *
       * */

      //Let's declare two pointers
      int left = 0;
      int right = 0;
      //And a variable to store sum
      int current_sum = 0;

      //create an array list object to store and return values

      ArrayList<Integer> result = new ArrayList<>();

      //Start iterating over the array and in each iteration proceed right from start to end
      for (; right < arr.length; right++) {
          //store the current array elements' sum in current_sum
          current_sum += arr[right];

          while (current_sum > sum && left < right) {
              current_sum -= arr[left];
              left++;

          }
          if (current_sum == sum) {
              //for 1 based indexing, add +1 on both left and right's current position
              result.add(left + 1);
              result.add(right + 1);
              return result;

          }
      }
          result.add(-1);
          return result;
      }



}
