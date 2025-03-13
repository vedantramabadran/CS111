public class Buses {
    public static void main(String args[]) {
        //read input
        int busNum = Integer.parseInt(args[0]);
        if (busNum < 0) {
            System.out.println("ERROR");
        }
        else {
            int sum = 0;
            while (busNum > 0) {
                sum += busNum % 10;
                busNum = busNum / 10;
            }
            if (sum % 2 == 0) {
                System.out.println("LX");
            }
            else {
                System.out.println("H");
            }
        }
    }
}