package DesignPatterns.Singleton;

public class SteamPublicField {
    public static final SteamPublicField INSTANCE = new SteamPublicField();
    private final String founder;
    private final String foundingDate;

    private SteamPublicField(){
        this.founder = "Gabe Newell";
        this.foundingDate = "12.09.2003";
    }
}
