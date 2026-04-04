public class ConcatMethodDemo {
    static void main(String[] args) {
        String hello = "Hello";
        String output = hello + " " + "World";
        System.out.println(hello);

        String hello1 = "Hello";
        String output1 = hello1.concat(" ").concat("World");
        System.out.println(hello1);

        String emptyString = "";
        String nullString = null;
    }
}
