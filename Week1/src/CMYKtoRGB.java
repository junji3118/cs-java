public class CMYKtoRGB {
    public static void main(String[] args) {
        double dC = Double.parseDouble(args[0]);
        double dM = Double.parseDouble(args[1]);
        double dY = Double.parseDouble(args[2]);
        double dK = Double.parseDouble(args[3]);

        double dW = 1. - dK;
        int rgbR = (int) Math.round(255 * dW * (1. - dC));
        int rgbG = (int) Math.round(255 * dW * (1. - dM));
        int rgbB = (int) Math.round(255 * dW * (1. - dY));

        System.out.println("red   = " + rgbR);
        System.out.println("green = " + rgbG);
        System.out.println("blue  = " + rgbB);
    }
}
