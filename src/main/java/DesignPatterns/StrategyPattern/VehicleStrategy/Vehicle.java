package DesignPatterns.StrategyPattern.VehicleStrategy;

public class Vehicle {
    private final CrashBehaviour crashBehaviour;
    private final MethodOfTravel methodOfTravel;
    private final Fuel fuel;

    public Vehicle(CrashBehaviour crashBehaviour, MethodOfTravel methodOfTravel, Fuel fuel) {
        this.crashBehaviour = crashBehaviour;
        this.methodOfTravel = methodOfTravel;
        this.fuel = fuel;
    }

    public void crash(){this.crashBehaviour.crash();}

    public void method(){this.methodOfTravel.method();}

    public void fueledBy(){this.fuel.fueledBy();}
}
