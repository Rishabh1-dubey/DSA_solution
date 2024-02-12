package Array;

public class find_Samosa {

    public static int strinf(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i]== key){

            return i;
        }
    }return  -1;

}


    public static void main(String[] args) {
        String menu[]={"samosa", "dahi-bads","dosa","medu-vads","vadspav","biryani"};
        String key = "dosa";

        //store your strinf paramerter in variable
        int index= strinf(menu , key);
        if (index == -1) {
            System.out.println("Not found any menu regrading");
        }else {
            System.out.println("the menu is at " + index);
        }
    }

}
