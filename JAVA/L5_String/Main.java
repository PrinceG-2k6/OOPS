package L5_String;

public class Main {
    public static void main(String[] args) {
        String name = "     Gupta Prince      ";
        // char letter = name.charAt(0);
        // int index = name.indexOf(" ");
        // int lastIndex =name.lastIndexOf("p");
        // System.out.println(lastIndex);
        // name = name.toLowerCase();
        // name = name.toUpperCase();

        // name = name.trim();
        // name = name.replace("e", "a");
        // name.isEmpty();
        // name.contains(" ");
        // name.equals("Hello");
         System.out.println(name);

         //SUBSTRING

         String email = "princegupta14311@gmail.com";
         String username = email.substring(0,email.indexOf("@")); 
         String domain = email.substring(email.indexOf("@")+1); 
    }
}
