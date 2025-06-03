package AlarmDaNaAutomation;

public class Main {
    public static void main(String[] args) {
        String text = "--header-color: #000000; color-scheme: dark;";

        // Extract "dark" from the style attribute using string manipulation
//        String colorScheme = "";
//
//            int startIndex = text.indexOf("color-scheme:") + "color-scheme:".length();
//            int endIndex = text.indexOf(';', startIndex);
////            if (endIndex == -1) {
////                endIndex = text.length();
////            }
//            colorScheme = text.substring(startIndex, endIndex).trim();
//
//        System.out.println("Color Scheme: " + colorScheme);


        String myString = "--header-color: #000000; color-scheme: dark;";
        System.out.println("lung = " + myString.length());
        if (myString.contains("color-scheme:"))
            System.out.println("gasit");
        else System.out.println("NOPE");

        System.out.println(" SUBSTRING = " + myString.substring(3,5));

        if (myString.contains("dark"))
            System.out.println("gasit DARK");
        else
            if (myString.contains("light"))
                System.out.println("gasit LIGHT");
            else System.out.println("NU AM GASIT ");

    }
}
