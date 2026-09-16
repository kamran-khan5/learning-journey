class Clock{
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour>=0 && hour<=23)
        {
            this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute>=0 && minute<=59)
        {
            this.minute = minute;
        }

    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second>=0 && second<=59)
        {
            this.second = second;
        }
    }

    public Clock (int hour, int minute, int second)
    {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public void getTime ()
    {
        System.out.println(hour+":"+minute+":"+second);
    }


}

class Chap_7_13_Clock {
    public static void main(String[] args) {
        Clock time1=new Clock(23,59,59);
        time1.getTime();
        System.out.println(time1);
    }
}
