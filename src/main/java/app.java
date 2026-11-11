
public class app {
	public static void main(String[] args) {
        double radius = args.length > 0 ? Double.parseDouble(args[0]) : 5.0;
        System.out.println("Area of circle with radius " + radius + " = " + circle.area(radius));
    }
}
