public class DogWalker {
    public static void main(String args[]) {
        // read the input and initialize vars
        int n = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        System.out.println("("+x+","+y+")");

        //simulate walk
        for (int i = 0; i < n; i++) {
            double direction = Math.random();
            if (direction <= 0.25) {
                x++;
            }
            else if (direction <= 0.5) {
                x--;
            }
            else if (direction <= 0.75) {
                y++;
            }
            else {
                y--;
            }
            System.out.println("("+x+","+y+")");
        }
        
        // Calculate and print squared distance
        double distance = Math.pow(x,2) + Math.pow(y,2);
        System.out.println("Squared distance = " + distance);

    }
}