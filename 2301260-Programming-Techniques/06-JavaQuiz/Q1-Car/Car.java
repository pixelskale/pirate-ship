public class Car {
    private double gas;
    private double efficiency;
    public Car(double gas, double efficiency) {
        this.gas = gas; // gallon
        this.efficiency = efficiency; // miles per gallon
    }
    public void drive(double distance) {
        if (this.gas * this.efficiency < distance) {
            System.out.println("You cannot drive too far, please add gas");
        }
        else {
            this.gas -= distance / this.efficiency;
        }
    }
    public void setGas(double gas) {
        this.gas = gas;
    }
    public double getGas() {
        return this.gas;
    }
    public double getEfficiency() {
        return this.efficiency;
    }
    public void addGas(double amount) {
        this.gas += amount;
    }
}
