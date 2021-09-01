package OOP_Part_1.CupApp;

public class Cup {
    final int MIN_LIQUID_VOLUME = 0;
    final int MAX_LIQUID_VOLUME = 600;

    public String liquidName;
    public int liquidVolume;

    public Cup() {
    }

    public Cup(String liquidName, int liquidVolume) {
        setLiquidName(liquidName);
        setLiquidVolume(liquidVolume);
    }


    public void setLiquidName(String liquidName) {
        if(!liquidName.equals("Water") && !liquidName.equals("Milk") && !liquidName.equals("Tea")){
            this.liquidName=null;
            System.out.println("Only tea,milk and water required for setting liquid Name");
        }else
            this.liquidName=liquidName;
    }

    public void setLiquidVolume(int liquidVolume) {
        if(liquidVolume<=MIN_LIQUID_VOLUME){
            System.out.println("The volume of liquid doesn't should set in zero or in  negative value.");
        }
        else if(liquidVolume>=MAX_LIQUID_VOLUME){
            System.out.println("The volume is to much for cup. Please, set value less then " + MAX_LIQUID_VOLUME + " ml.");
        }else
            this.liquidVolume = liquidVolume;
    }

    public String getLiquidName() {
        return liquidName;
    }

    public int getLiquidVolume() {
        return liquidVolume;
    }

    public void pourOutLiquid(int someLiquidVolume){
        this.liquidVolume-=someLiquidVolume;
        System.out.println("We had poured out from this cup " + someLiquidVolume + "ml and now remained " + liquidVolume+ "ml");
    }

    public void poorInLiquid(int someLiquidVolume){
        this.liquidVolume+=someLiquidVolume;
        System.out.println("We had poured in this cup " + someLiquidVolume + "ml and now it's" + liquidVolume+"ml");
        if(this.liquidVolume>=600)
            System.out.println("Great,u had poured to much liquid on cup. Congratulation, pov !!!");
    }


}
