package org.example.arge;

public class GasPoweredCar extends CarSkeleton {

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description,
                         double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public Double getAvgKmPerLitre() { return avgKmPerLitre; }
    public int getCylinders()        { return cylinders; }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() +
                " -> Gas engine starting with " + cylinders + " cylinders");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() +
                " -> Driving on gas, avg " + avgKmPerLitre + " km/litre");
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println(getClass().getSimpleName() + " -> Gas engine is running");
    }
}