package Array;

public class subArray {
    public  static  void  subArray(int numbers[]) {
        int ts=0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = 1; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) { //print
                    int pairs=k;
                        System.out.print(numbers[k] + " "); //subarray
                        ts++;
                    }
                    System.out.println();
                }
            }

            System.out.println("the numbers of pairs is " + ts);
        }


    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        subArray(numbers);
    }
    };
