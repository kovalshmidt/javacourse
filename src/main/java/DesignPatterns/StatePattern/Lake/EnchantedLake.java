package DesignPatterns.StatePattern.Lake;

public class EnchantedLake {
    LakeState hasWater;
    LakeState hasLava;
    LakeState isFrozen;
    LakeState isDrained;

    LakeState lakeState;

    public EnchantedLake() {
        this.hasWater = new HasWater(this);
        this.hasLava = new HasLava(this);
        this.isFrozen = new IsFrozen(this);
        this.isDrained = new IsDrained(this);
        this.lakeState = hasWater;
    }

    public void fillLakeWater(){
        this.lakeState.toWater();
    }

    public void fillLakeLava(){
        this.lakeState.toLava();
    }

    public void drainLake(){
        this.lakeState.toDrained();
    }

    public void freezeLake(){
        this.lakeState.toFrozen();
    }

    public void  setLakeState(LakeState lakeState){
        this.lakeState = lakeState;
    }

    public void traverseLake(){
        this.lakeState.traverseLake();
    }
}
