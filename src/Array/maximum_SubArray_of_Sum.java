package Array;

public  class maximum_SubArray_of_Sum {
    public static void maximum_subarray (int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = 1; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) { //print
                    //subArray print
                    currSum += numbers[k];
                }
                System.out.println(currSum); //subarray
                if (maxSum < currSum) {
                    maxSum += currSum;
                }
            }
        }
            System.out.println("max_sum is" + maxSum);
    }

        public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
maximum_subarray(numbers);
        }
    }


