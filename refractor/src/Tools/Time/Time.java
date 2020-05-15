package Tools.Time;

public class Time implements Theticker{
    private Hour hr;
    private Minute min;
    private Second sec;
    public Time(){
        hr = new Hour();
        min = new Minute();
        sec = new Second();

    }
    public Time(Hour hr, Minute min, Second sec){
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

    public Second getSec() {
        return sec;
    }

    public void setSec(Second sec) {
        this.sec = sec;
    }

    public void tick(){
        if(sec.getSecond() == 59){
            if(min.getMinute() == 59){
                if(hr.getHour() == 23){
                    hr.setSecond(0);
                    min.setMinute(0);
                    sec.setSecond(0);
                }
                else{
                    hr.tick();
                    min.setMinute(0);
                    sec.setSecond(0);
                }
            }
            else{
                min.tick();
                sec.setSecond(0);
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
