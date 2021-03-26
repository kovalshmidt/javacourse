package DesignPatterns.BuilderPattern.Homework;

public class Mod {
    private String ModName;
    private int ModNumber;
    private int SizeInMB;
    private boolean ContainsEsp;
    private boolean requiresSKSE;
    private boolean BSA_packed;
    private int TexturesAmount;

    @Override
    public String toString() {
        return "Mod{" +
                "ModName='" + ModName + '\'' +
                ", ModNumber=" + ModNumber +
                ", SizeInMB=" + SizeInMB +
                ", ContainsEsp=" + ContainsEsp +
                ", requiresSKSE=" + requiresSKSE +
                ", BSA_packed=" + BSA_packed +
                ", TexturesAmount=" + TexturesAmount +
                ", MeshesAmount=" + MeshesAmount +
                ", ScriptAmount=" + ScriptAmount +
                ", SoundAmount=" + SoundAmount +
                '}';
    }

    private int MeshesAmount;
    private int ScriptAmount;
    private int SoundAmount;

    public Mod(Builder creation) {
        this.ModName = creation.ModName;
        this.ModNumber = creation.ModNumber;
        this.SizeInMB = creation.SizeInMB;
        this.ContainsEsp = creation.ContainsEsp;
        this.requiresSKSE = creation.requiresSKSE;
        this.BSA_packed = creation.BSA_packed;
        this.TexturesAmount = creation.TexturesAmount;
        this.MeshesAmount = creation.MeshesAmount;
        this.ScriptAmount = creation.ScriptAmount;
        this.SoundAmount = creation.SoundAmount;
    }

    public static class Builder {
        //Req:
        private final String ModName;
        private final int ModNumber;
        private final int SizeInMB;

        //Optional:
        private boolean ContainsEsp = false;
        private boolean requiresSKSE = false;
        private boolean BSA_packed = false;
        private int TexturesAmount = 0;
        private int MeshesAmount = 0;
        private int ScriptAmount = 0;
        private int SoundAmount = 0;

        public Builder(String modName, int modNumber, int sizeInMB) {
            this.ModName = modName;
            this.ModNumber = modNumber;
            this.SizeInMB = sizeInMB;
        }

        public Builder requiresSKSE(boolean requiresSKSE) {
            this.requiresSKSE = requiresSKSE;
            return this;
        }

        public Builder BSA_packed(boolean BSA_packed) {
            this.BSA_packed = BSA_packed;
            return this;
        }

        public Builder containsEsp(boolean containsEsp) {
            this.ContainsEsp = containsEsp;
            return this;
        }

        public Builder texturesAmount(int texturesAmount) {
            this.TexturesAmount = texturesAmount;
            return this;
        }

        public Builder meshesAmount(int meshesAmount) {
            this.MeshesAmount = meshesAmount;
            return this;
        }

        public Builder ScriptAmount(int scriptAmount) {
            this.ScriptAmount = scriptAmount;
            return this;
        }

        public Builder SoundAmount(int soundAmount) {
            this.SoundAmount = soundAmount;
            return this;
        }

        public Mod build() {
            return new Mod(this);
        }
    }
}
