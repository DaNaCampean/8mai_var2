package AlarmDaNaAutomation;

public class Main {
    public static void main(String[] args) {
        String text = "--header-color: #000000; color-scheme: dark;";

        // Extract "dark" from the style attribute using string manipulation
        String colorScheme = "";

            int startIndex = text.indexOf("color-scheme:") + "color-scheme:".length();
            int endIndex = text.indexOf(';', startIndex);
//            if (endIndex == -1) {
//                endIndex = text.length();
//            }
            colorScheme = text.substring(startIndex, endIndex).trim();

        System.out.println("Color Scheme: " + colorScheme);
    }
}
