package review4;

public class BreakKeyword {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            //if we add break than it only shows one number in console
            break;
        }

        //how we use break
        for (int j = 1; j <=5 ; j++) {
            if(j==3){
                break;
            }
            System.out.println(j);
        }
    }
}
