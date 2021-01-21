public class PostalCode {
    public static void main(String[] args) {

        //zadanie 1 - poprawność kodów pocztowych
        System.out.println();
        System.out.println("Zadanie 1 - sprawdzenie poprawności kodów pocztowych");
        System.out.println("----------------------------------------------------");

        String[] code = {"123-52", "15-95254", "1-4425", "650-52", "16-895", "6255-8", "52----"};
        for (String c : code) {
            if (c.charAt(2) == '-' && c.length() == 6) {
                System.out.println("kod jest prawidłowy");
            } else {
                System.out.println("kod jest nieprawidłowy");
            }
        }
    }
}

