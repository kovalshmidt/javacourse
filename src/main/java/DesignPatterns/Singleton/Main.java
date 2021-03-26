package DesignPatterns.Singleton;

public class Main {
    public static void main(String[] args) {

        SteamPublicField steamPublicField = SteamPublicField.INSTANCE;
        SteamPublicField steamPublicField2 = SteamPublicField.INSTANCE;
        System.out.println(steamPublicField.equals(steamPublicField2));

        SteamFactoryMethod steamFactoryMethod= SteamFactoryMethod.getInstance();
        SteamFactoryMethod steamFactoryMethod2= SteamFactoryMethod.getInstance();
        System.out.println(steamFactoryMethod.equals(steamFactoryMethod2));

        SteamEnum steamEnum = SteamEnum.INSTANCE;
        SteamEnum steamEnum1 = SteamEnum.INSTANCE;
        System.out.println(steamEnum1.equals(steamEnum));
    }
}
