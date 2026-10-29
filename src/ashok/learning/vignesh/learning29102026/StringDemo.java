package ashok.learning.vignesh.learning29102026;

public class StringDemo {
    public static void main(String[] args) {
        String name = "Ashok";
        String lastName = "Ashok";
        System.out.println("using String literal: "+(name == lastName));

        String fname =  new String("vignesh");
        String lname =  new String("vignesh");
        System.out.println("Using object:"+(fname == lname));
    }
}
