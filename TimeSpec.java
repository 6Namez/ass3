public class TimeSpec {
    double timeNum;
    Time timeUnits;

    public TimeSpec(double timeNum, Time timeUnits) {
        this.timeNum = timeNum;
        this.timeUnits = timeUnits;
    }

    public double getTimeNum() {
        return timeNum;
    }

    public Time getTimeUnits() {
        return timeUnits;
    }
}
