package Array;

public class Largest_Number {
    public  static  int getLargest(int numbers[]){
        int largest= Integer.MIN_VALUE ;
//        int smallest_Number = Integer.MAX_VALUE ;// for  -infinty

        for (int i=0; i<numbers.length; i++){
            if (largest<numbers[i]){
                largest= numbers[i];
            }
//            if (smallest_Number>numbers[i]){
//                smallest_Number= numbers[i];
//            }

        }
//        System.out.println("the smallwst number  is " + smallest_Number);
        return  largest;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,5,7,3,15};
        System.out.println("the largest number is "+getLargest(numbers));
    }
}
