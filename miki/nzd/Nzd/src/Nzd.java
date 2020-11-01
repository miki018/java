public class Nzd {

    public Nzd() {
    }

    public static int nzd(int a, int b) {
        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }

    // GreatestCommonDivisor
    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        return gcd(q, p % q);
    }
//najbrzi nacin
    public static int gcd3(int x, int y) {
        while (x != 0 && y != 0) { // changed this line
            if (x >= y)
                x = x % y;
            else
                y = y % x;
        }
        return (x + y);
    }
}
