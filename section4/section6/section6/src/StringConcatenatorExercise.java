class StringConcatenator{
    public static void main (String[] args) {
        String greeting = "Hello,";
        String name = "Alex.";
        String message = "Welcome to elite Java Club!";

        String personalizedMessage = greeting.concat(name).concat(message);

        System.out.println(personalizedMessage);
    }
}