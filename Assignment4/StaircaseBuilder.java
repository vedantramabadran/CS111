public class StaircaseBuilder {
    public static void main(String[] args) {
        int d = Integer.parseInt(args[0]);
        int bricks = Integer.parseInt(args[1]);
        char a[][] = new char[d][d];

        for (int x = 0; x < d; x++) {
            for (int  y= 0; y < d; y++){
                a[x][y] = ' ';
            }
        }

        for (int j = 0; j < d; j++) {
            for (int i = d-1; i >= 0; i--) {
                if (bricks > 0) {
                    if (i+j >= d-1) {
                        a[i][j] = 'X';
                        bricks = bricks - 1;
                        }
                    else {
                        a[i][j] = ' ';
                        }
                }
            }
            }
        
        for (int x = 0; x < d; x++) {
            for (int  y= 0; y < d; y++){
                System.out.print(a[x][y]);
            }
            System.out.println();
        }
        System.out.println("Bricks remaining: " + bricks);
        }
    }