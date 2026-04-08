public class StringSearchDemo {
    static void main(String[] args) {
        String originalString = "Hello, World!";
        int index = originalString.indexOf('!');
        int index1 = originalString.indexOf("World");

        int index2 = originalString.indexOf("@");

        boolean isContains = originalString.contains("World");
        boolean isPresent = originalString.contains("@");

        boolean startsWith = originalString.startsWith("Hello");
        boolean endsWith = originalString.endsWith("@");

        boolean isMatched = originalString.matches(".*World.*");
    }
}
