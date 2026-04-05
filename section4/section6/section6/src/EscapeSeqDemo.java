public class EscapeSeqDemo {
    static void main(String[] args) {
        String name = "\"Rupanshu\"";
        System.out.println(name);

        String m = "\u004D";
        System.out.println(m);

        String unicodeName = "\u004Dadan\u0021";
        System.out.println(unicodeName);
    }

}
