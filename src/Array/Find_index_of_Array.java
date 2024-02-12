package Array;

public class Find_index_of_Array {
    public  static  int linearSearch(int numbers[],int key){
        for(int i=0; i<numbers.length; i++){
            if (numbers[i]==key){
                return  i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] ={2,4,6,8,10,12,14};
                int key=10;
        int index= linearSearch(numbers, key);
        if (index==-1){
            System.out.println( "NoT found");
        }else {
            System.out.println("the index of the key is"+ index);
        }

    }
}
