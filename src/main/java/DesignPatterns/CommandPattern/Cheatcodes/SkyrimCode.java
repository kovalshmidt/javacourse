package DesignPatterns.CommandPattern.Cheatcodes;

import java.util.HashMap;

public class SkyrimCode {
    boolean noClip;
    boolean godMode;
    HashMap<String,Integer> inventory;

    public SkyrimCode(){
        this.noClip = false;
        this.godMode = false;
        this.inventory = new HashMap<>();
    }

    public void toggleNoClip(){

        this.noClip= !this.noClip;
        System.out.println("Noclip: "+ (noClip? "ON":"OFF"));
    }

    public void toggleGodMode(){
        this.godMode= !this.godMode;

        System.out.println("Godmode: "+ (godMode? "ON":"OFF"));
    }

    public void addItem(String item,int amount){
        if (!this.inventory.containsKey(item)){
            this.inventory.put(item,amount);
        }else {
            this.inventory.put(item,this.inventory.get(item)+amount);
        }
        System.out.println(inventory.toString());
    }

    public void removeItem(String item,int amount){
        this.inventory.put(item,this.inventory.get(item)-amount);
        if (this.inventory.get(item)<1){
            this.inventory.remove(item);
        }
        System.out.println(inventory.toString());
    }
}
