public class Grasshopper {
    private double[][] points;
    private int currentIndex;

    public Grasshopper() {
        points = new double[100000][2];
        currentIndex = 0;
    }

    public void addPoint(double x, double y) {
        points[currentIndex][0] = x;
        points[currentIndex][1] = y;
        currentIndex++;
    }

    public int checkJump(Frog frog) {
        for (int i = 0; i < currentIndex; i++) {
            if (frog.canEatGrasshopper(points[i][0], points[i][1])) {
                return i;
            }
        }
        return -1;
    }
}
