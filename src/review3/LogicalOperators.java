package review3;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean loginButtonDisplayed = true;
        boolean loginClickable = true;

        if(loginClickable && loginButtonDisplayed){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }

        System.out.println("---------Logical OR--------");

        boolean pictureDisplayed = true;
        String accountName = "Syntax";

        if(pictureDisplayed || accountName.equals("Syntax")){
            System.out.println("Login was successful");
        }else{
            System.out.println("User isn't found");
        }

        System.out.println("---------Logical NOT!--------");

        boolean hungry = !true;
        System.out.println(hungry);

        boolean cold = false;
        System.out.println(!cold);

        String str = "Hello";

        if(!str.equals("Hello")){
            System.out.println("Value of the string is NOT hello");
        }

        boolean confirmSelected = false;
        if(!confirmSelected){
            System.out.println("Let`s click on confirm checkbox");
        }
        System.out.println("Click on pay button");
    }
}
