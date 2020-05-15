package Tools.Time;

public class Minute implements Theticker{
    int y;
    public Minute(){
        y = 0;
    }

    public Minute(int y) {
        this.y = y;
    }

    public int getMinute() {
        return y;
    }

    public void setMinute(int y) {
        this.y = y;
    }
    public String toString(){
        if(y < 10){
            return "0"+y;
        }
        else
            return ""+y;
    }
    public void tick(){
        y++;
    }
}
