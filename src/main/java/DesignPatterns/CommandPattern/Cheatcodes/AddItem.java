package DesignPatterns.CommandPattern.Cheatcodes;

public class AddItem implements Command {
    private SkyrimCode skyrimCode;
    private String item;
    private int amount;

    public AddItem(SkyrimCode skyrimCode) {
        this.skyrimCode = skyrimCode;
        this.item = "";
        this.amount = 0;
    }

    public void setItem(String item, int amount){
        this.item = item;
        this.amount = amount;
    }

    @Override
    public void execute() {
        this.skyrimCode.addItem(item, amount);
    }
}
