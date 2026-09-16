class Time {
    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second;// 0 - 59

    public Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    public Time(int hour, int minute)
    {
        this(hour, minute, 0);
    }

    public Time(int hour)
    {
        this(hour, 0, 0);
    }

    public Time()
    {
        this(0, 0, 0);
    }

    public Time(Time time){
        // invoke constructor with three arguments
        this(time.hour, time.minute, time.second);
    }


    public void setHour(int hour) {
        if (hour<0 || hour>23) {
            throw new IllegalArgumentException("hour must be 0-23");
        }
        this.hour=hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("minute must be 0-59");
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("second must be 0-59");
        }
        this.second = second;
    }

    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }

    public void setTime(int seconds)
    {
        int tempMinutes = seconds / 60;
        this.second = seconds % 60;

        this.hour = tempMinutes / 60;
        this.minute = tempMinutes % 60;
    }

    public void incrementHour()
    {
        if (this.hour==23)
        {
            this.hour=0;
            return;
        }
        this.hour++;
    }

    public void incrementMinute()
    {
        if (this.minute==59)
        {
            incrementHour();
            this.minute=0;
            return;
        }
        this.minute++;
    }

    public void incrementSecond()
    {
        if (this.second==59)
        {
            incrementMinute();
            this.second=0;
            return;
        }
        this.second++;
    }

    // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalString() {
        return String.format(
                "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}

public class Chap_8_7 {
    public static void main(String[] args) {
        Time t1=new Time(23,59,59);
        System.out.println("Before Increment:  " + t1.toUniversalString());
        System.out.println("Before Increment:  " + t1+"\n");
        //t1.incrementHour();
//        t1.incrementMinute();
        t1.incrementSecond();
        System.out.println("Universal Format: "+t1.toUniversalString());
        System.out.println("Standard Format: "+t1);
    }
}
