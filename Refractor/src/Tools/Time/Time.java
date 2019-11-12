package Tools.Time;

public class Time implements Theticker{
    private Hour hr;
    private Minute min;
    private secon sec;
    public Time(){
        hr = new Hour();
        min = new Minute();
        sec = new secon();

    }
    public Time(Hour hr, Minute min, secon sec){
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }
    public Time(Time time){
        this.hr = time.hr;
        this.min = time.min;
        this.sec = time.sec;
    }

    public Hour getHr() {
        return hr;
    }

    public void setHr(Hour hr) {
        this.hr = hr;
    }

    public Minute getMin() {
        return min;
    }

    public void setMin(Minute min) {
        this.min = min;
    }

    public secon getSec() {
        return sec;
    }

    public void setSec(secon sec) {
        this.sec = sec;
    }

    public void tick(){
        if(sec.getZ() == 59){
            if(min.getY() == 59){
                if(hr.getX() == 23){
                    hr.setX(0);
                    min.setY(0);
                    sec.setZ(0);
                }
                else{
                    hr.tick();
                    min.setY(0);
                    sec.setZ(0);
                }
            }
            else{
                min.tick();
                sec.setZ(0);
            }
        }
        else{
            sec.tick();
        }
    }
    public String toString(){
        return hr.toString()+":"+min.toString()+":"+sec.toString();
    }
}
