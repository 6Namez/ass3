public class TemperatureSpec {
    double tempNum;
    Temperature tempUnits;

    public TemperatureSpec(double tempNum, Temperature tempUnits) {
        this.tempNum = tempNum;
        this.tempUnits = tempUnits;
    }

    public double getTempNum() {
        return tempNum;
    }

    public Temperature getTempUnits() {
        return tempUnits;
    }
}
