public class KadanesAlgorithm2 {

    /** Problem: Given an integer array arr[]. Find the contiguous sub-array(containing at least one number) that has the Minimum sum and return its sum.
     *
     *
     *
     * **/
    public int MinimumSumSubArray(int arr[])
    {
     //initialize currentMax and globalMax with arr's 0 index

        int currentMin = arr[0];
        int globalMin = arr[0];

        // Start iterating over the array, starting from index 1 to till it's length

        for(int i=1;i< arr.length; i++)
        {
           //For each element in the array (starting from the second one), update currentMax by choosing the maximum between the current element alone or the current element added to currentMax.

             currentMin = Math.min(arr[i], currentMin+arr[i]);

             //If currentMax is > globalMax, update globalMax
             if(currentMin < globalMin)
             {
                 globalMin = currentMin;
             }

        }
        //At the end of this loop, globalMax will have the sum of the largest subarray of the given array
        return globalMin;


    }
}
