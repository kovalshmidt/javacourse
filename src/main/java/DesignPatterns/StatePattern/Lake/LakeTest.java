package DesignPatterns.StatePattern.Lake;

public class LakeTest {
    public static void main(String[] args) {
        EnchantedLake lake = new EnchantedLake();
        lake.traverseLake();
        lake.drainLake();
        lake.traverseLake();
        lake.fillLakeLava();
        lake.traverseLake();
        lake.drainLake();
        lake.traverseLake();
        lake.fillLakeWater();
        lake.traverseLake();
        lake.freezeLake();
        lake.traverseLake();
    }
}
