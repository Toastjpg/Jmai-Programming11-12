import java.awt.*;

public class GasPlanet extends Planet {
    private boolean hasRings;
    private Color color;

    GasPlanet(int orbitTime, String designation, boolean hasRings, Color color ){
        super(orbitTime, designation);
        this.hasRings = hasRings;
        this.color = color;
    }

    public boolean isHasRings() {
        return hasRings;
    }

    public void setHasRings(boolean hasRings) {
        this.hasRings = hasRings;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Orbit Time: " + getOrbitTime() + "Moons: " + getMoons() + "Designation" + getDesignation() + "Has Rings?: " + hasRings + "Color: " + color;
    }

}
