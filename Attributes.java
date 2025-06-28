public class Attributes {
    int age = 10;
    String fname ="John";
    String lname= "Doe";
    
    public static void main(String[] args) {
        Attributes a = new Attributes();
        System.out.println("User: " + a.fname +" "+ a.lname+ " is " +a.age);
    }
}
