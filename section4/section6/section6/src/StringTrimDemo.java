public class StringTrimDemo {
    static void main(String[] args) {
        String java1 = " java ".trim();
        String java2 = " java  ".trim();
        String java3= " \n \tjava \n \r ".trim();
        String java4= " \n \tjava \n \r ";

        String java5 = " ja va ".trim();
        String java6 = " ja \n va ".trim();

        boolean isSame = "java ".equals("java");
    }
}
