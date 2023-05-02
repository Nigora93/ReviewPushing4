public class review5 {
    public static void main(String[] args) {
        String [] languages = {"English", "Russian", "Turkish", "French", "Spanish"};

//        for (String language : languages) {
//            System.out.print(language+ " ");
//        }

        //reverse the order; enhanced for loop cannot help us

        for (int i = languages.length-1; i >= 0; i--) {
            System.out.println(languages[i]);
        }
    }
}
