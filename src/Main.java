// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(checkString("Questa è una stringa"));
    }

    private static String checkString(String value) {
        /* String result;
        if (value.length() >= 10) {
            result = "Lunghezza maggiore o uguale di 10";
        } else {
            result = "Lunghezza minore di 10";
        }*/
        String result = value.length() >= 10 ? "Lunghezza maggiore o uguale di 10" : "Lunghezza minore di 10";

        return result;
    }
}