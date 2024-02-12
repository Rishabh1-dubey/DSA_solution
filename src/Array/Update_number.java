package Array;

public class Update_number {

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {95, 96, 97};
        update(marks);

        //for update marks
        for (int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();

    }
}

