package DesignPatterns.CommandPattern.Cheatcodes;

public class CommandConsole {
    public static void main(String[] args) {
        SkyrimCode skyrim = Access.getGame();
        Command tcl = new NoClip(skyrim);
        Command tgm = new GodMode(skyrim);
        AddItem addItems = new AddItem(skyrim);
        addItems.setItem("Cheese Wheels",50);
        RemoveItem removeItem = new RemoveItem(skyrim);
        removeItem.values("Cheese Wheels",60);

        CodeExecution toggleClipping = new CodeExecution(tcl);
        CodeExecution toggleGodMode = new CodeExecution(tgm);
        CodeExecution addItemsExe = new CodeExecution(addItems);
        CodeExecution removeItemsExe = new CodeExecution( removeItem);

        toggleClipping.enter();
        toggleGodMode.enter();
        addItemsExe.enter();
        removeItemsExe.enter();

    }
}
