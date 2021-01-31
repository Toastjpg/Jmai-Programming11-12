import java.util.ArrayList;

public class Planet {
    private int orbitTime;
    ArrayList<Moon> moon = new ArrayList<>();
    private String designation;

    Planet(){
        orbitTime = 0;
        designation = null;
    }
    Planet(int orbitTime, String designation){
        this.orbitTime = orbitTime;
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public int getOrbitTime() {
        return orbitTime;
    }
    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }
    public void addMoon(Moon moon){
        this.moon.add(moon);
    }
    public ArrayList<Moon> getMoons() {
        return moon;
    }

    public boolean equals(Planet obj) {
        return this.designation.equals(obj.designation);
    }

    @Override
    public String toString() {
        return "Orbit Time: " + orbitTime + "Moons: " + getMoons() + "Designation" + designation;
    }
}
