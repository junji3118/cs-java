public class GreatCircle {
    public static void main(String[] args) {
        double x1deg = Double.parseDouble(args[0]);
        double y1deg = Double.parseDouble(args[1]);
        double x2deg = Double.parseDouble(args[2]);
        double y2deg = Double.parseDouble(args[3]);

        double x1 = Math.toRadians(x1deg);
        double y1 = Math.toRadians(y1deg);
        double x2 = Math.toRadians(x2deg);
        double y2 = Math.toRadians(y2deg);

        double r = 6371.0;
        double distance = 2 * r * Math.asin(Math.sqrt(Math.pow(Math.sin(0.5 * (x2 - x1)), 2) + Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin(0.5 * (y2 - y1)), 2)));
        System.out.println(distance + " kilometers");
    }
}
