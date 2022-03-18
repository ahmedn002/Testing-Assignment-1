package Testing;

public class Q2 {
    public static String Forces(int n, int[][] a) {
        int x = 0, y = 0, z = 0;

        for (int i = 0; i < n; i++) {
            x += a[i][0];
            y += a[i][1];
            z += a[i][2];;
        }
        if (x == 0 && y == 0 && z == 0) {
            System.out.println("YES");
            return "YES";
        } else {
            System.out.println("NO");
            return "NO";
        }
    }
}
