package Tools.Time;

public class Second implements Theticker{
    int z;
    public Second(){
        z = 0;
    }

    public int getSecond() {
        return z;
    }

    public void setSecond(int z) {
        this.z = z;
    }

    public Second(int z) {
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
