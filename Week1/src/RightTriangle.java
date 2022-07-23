public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean arePositive = (a > 0) && (b > 0) && (c > 0);
        boolean isRightTriangle = (Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2) || (Math.pow(a, 2) + Math.pow(c, 2)) == Math.pow(b, 2) || (Math.pow(b, 2) + Math.pow(c, 2)) == Math.pow(a, 2);

        System.out.println(arePositive && isRightTriangle);
    }
}
