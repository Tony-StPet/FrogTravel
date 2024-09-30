public class Frog {
    public double x;
    public double y;
    public double maxDistance;

    public Frog(double x, double y, double maxDistance) {
        this.x = x;
        this.y = y;
        this.maxDistance = maxDistance;
    }

    public boolean canEatGrasshopper(double grasshopperX, double grasshopperY) {
        double distance = Math.sqrt(Math.pow(grasshopperX - x, 2) + Math.pow(grasshopperY - y, 2));
        return distance <= maxDistance;
    }
}
