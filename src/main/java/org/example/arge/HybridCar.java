package org.example.arge;

public class HybridCar extends CarSkeleton {

    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description,
                     double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public Double getAvgKmPerLitre() { return avgKmPerLitre; }
    public int getBatterySize()      { return batterySize; }
    public int getCylinders()        { return cylinders; }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() +
                " -> Hybrid engine starting, gas + electric");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() +
                " -> Driving hybrid, " + avgKmPerLitre + " km/litre + " +
                batterySize + " kWh battery");
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println(getClass().getSimpleName() +
                " -> Hybrid engine running (gas + electric)");
    }
}