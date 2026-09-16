class Time2 {
    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second;// 0 - 59

    public Time2(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

//    public Time2(int hour, int minute) { // Simple Constructor overloading
//        setHour(hour);
//        setMinute(minute);
//
//    }
    public Time2(int hour, int minute)// Simple Constructor chaining
    {
        this(hour, minute, 0);
    }

    public Time2(int hour)
    {
        this(hour, 0, 0);
    }

    public Time2()
    {
        this(0, 0, 0);
    }

    public Time2(Time time){
        // invoke constructor with three arguments
        this(time.getHour(), time.getMinute(), time.getSecond());
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


class Chap_8_9 {
    private static void displayTime(String header, Time t) {
        System.out.printf("%s%n %s%n %s%n",
                header, t.toUniversalString(), t );
    }
    public static void main(String[] args) {
        Time t1 = new Time(); // 00:00:00
        Time t2 = new Time(2); // 02:00:00
        Time t3 = new Time(21, 34); // 21:34:00
        Time t4 = new Time(12, 25, 42); // 12:25:42
        Time t5 = new Time(t4); // 12:25:42

        System.out.println("Constructed with:");
        displayTime("t1: all default arguments", t1);
        displayTime("t2: hour specified; default minute and second", t2);
        displayTime("t3: hour and minute specified; default second", t3);
        displayTime("t4: hour, minute and second specified", t4);
        displayTime("t5: Time2 object t4 specified", t5);

        // attempt to initialize t6 with invalid values
        try {
            Time t6 = new Time(27, 74, 99); // invalid values
        }
        catch (IllegalArgumentException e) {
            System.err.printf("%nException while initializing t6: %s%n", e.getMessage());
        }
        Time t7=new Time();
        t7.setTime(3000);
        System.out.println("Set time method: "+t7);
    }
}
