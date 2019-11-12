package Tools.Time;

public class secon implements Theticker{
    int z;
    public secon(){
        z = 0;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public secon(int z) {
        this.z = z;
    }
    public String toString(){
        if(z < 10){
            return "0"+z;
        }
        else
            return ""+z;
    }
    public void tick(){
        z++;
    }
}
