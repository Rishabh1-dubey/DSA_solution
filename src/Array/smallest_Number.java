package Array;

public class smallest_Number {
    public  static  int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE; //for +infinity
        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int numbers[]= {2,3,4,5,6,1};
        System.out.println("the smallest number is "+getSmallest(numbers));
    }
}
