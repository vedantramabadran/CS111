public class BusStop {

    public static void main(String[] args) {
        int n = args.length;
        int out = 1000;
        for (int i = 0; i < n-1; i++) {
            if (Integer.parseInt(args[n-1]) == Integer.parseInt(args[i])) {
                out = i + 1; break;
            }
        }
        System.out.println(out);
    }
}
