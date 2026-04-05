public class EmptyCheckDemo {
    static void main(String[] args) {
        String myString = "";
        boolean isEmpty = myString.isEmpty();

        boolean isLenghtZero = myString.length()==0;

        boolean isEqualEmpty = "".equals(myString);

        String nullString = null;
        boolean isnullEmpty = "".equals(nullString);

        boolean isEmptyNull = nullString.length()==0;

        String blankString = "     ";
        boolean isBlankEmpty = blankString.isEmpty();
        boolean isBlank = blankString.isBlank();
    }
}
