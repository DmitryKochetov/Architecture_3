package task3;

public class Cube implements VolumeFigure {

    private int edge;

    public Cube(int edge) {

        this.edge = edge;

    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }

}
