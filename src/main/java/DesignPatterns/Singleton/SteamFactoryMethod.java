package DesignPatterns.Singleton;

public class SteamFactoryMethod {
    private static final SteamFactoryMethod INSTANCE = new SteamFactoryMethod();
    private final String founder;
    private final String foundingDate;

    private SteamFactoryMethod(){
        this.founder = "Gabe Newell";
        this.foundingDate = "12.09.2003";
    }

    public static SteamFactoryMethod getInstance(){
        return INSTANCE;
    }
}
