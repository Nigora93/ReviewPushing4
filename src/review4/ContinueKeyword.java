package review4;

public class ContinueKeyword {
    public static void main(String[] args) {
        for (int i = 0; i <=5 ; i++) {
            //if there is continue, then it skips the given number
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
    }
}
