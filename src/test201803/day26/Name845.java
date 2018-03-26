package test201803.day26;


/**
 * 求最大公约数
 */
public class Name845 {
    public static void main(String[] args) {
        int res  = gcd( 320,200);
        System.out.println(res);
    }

    public static int gcd(int a, int b) {
        // write your code here
        //辗转相减
        int res = 1;
        while (true) {
            if (a == 0) {
                return b * res;
            }
            if (b == 0) {
                return a * res;
            }
            if ( a == b) {
                res *= b;
                break;
            }
            if ( a % 2 == 0 && b % 2 == 0) {
                res *= 2;
                a /= 2;
                b /= 2;
                continue;
            }
            if (a % 2 ==0 && b % 2 != 0) {
                a /= 2;
                continue;
            }
            if (a % 2 !=0 && b % 2 == 0) {
                b /= 2;
                continue;
            }
            int c = Math.max(a, b);
            int d = Math.min(a, b);
            a = c;
            b = d;
            b = a - b;
            a = d;
        }
        return res;
    }

}
