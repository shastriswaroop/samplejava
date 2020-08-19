package shastri.swaroop.core.comparator;

public class Time implements Comparable<Time>{

    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    int hr;
    int min;

    public Time(int hr, int min){
        this.hr = hr;
        this.min = min;
    }

    @Override
    public int compareTo(Time o) {
        if(this.getHr()>o.getHr()){
            return 1;
        } else if(this.getHr()<o.getHr()){
            return -1;
        } else {
            if(this.getMin()>o.getMin()){
                return 1;
            } else if(this.getMin() < o.getMin()){
                return -1;
            } else {
                return 0;
            }
        }
    }

    public String toString(){
        return "hr: " + hr +", min:" +min;
    }
}
