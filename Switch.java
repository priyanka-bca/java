public class Switch {
    public static void main(String[] args) {
        String week = "C";
        switch (week) {
            case "A":
                System.out.println("Sunday");
                break;
            case "B":
                System.out.println("Monday");
                break;
            case "C":
                System.out.println("Tuesday");
                break;
            case "D":
                System.out.println("Wednesday");
                break;
            case "E":
                System.out.println("Thursday");
                break;
            case "F":
                System.out.println("Friday");
                break;
            case "G":
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not Matched");
        }
    }
}
