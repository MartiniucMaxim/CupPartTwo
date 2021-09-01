package OOP_Part_1.CupApp;

public class BigCup extends Cup{
    final int MIN_LIQUID_VOLUME = 0;
    final int MAX_LIQUID_VOLUME = 1001;

    public BigCup(String liquidName,int liquidVolume){
        super(liquidName,liquidVolume);
    }

    public BigCup(){

    }

    @Override
    public void setLiquidName(String liquidName) {
        super.setLiquidName(liquidName);
    }

    @Override
    public void setLiquidVolume(int liquidVolume) {
        if(liquidVolume<=MIN_LIQUID_VOLUME){
            System.out.println("The volume of liquid doesn't should set in zero or in  negative value.");
        }
        else if(liquidVolume>=MAX_LIQUID_VOLUME){
            System.out.println("The volume is to much for cup. Please, set value less then " + MAX_LIQUID_VOLUME + " ml.");
        }else
            this.liquidVolume = liquidVolume;
    }


    @Override
    public String getLiquidName() {
        return super.getLiquidName();
    }

    @Override
    public int getLiquidVolume() {
        return super.getLiquidVolume();
    }

    @Override
    public void poorInLiquid(int someLiquidVolume) {
        this.liquidVolume+=someLiquidVolume;
        System.out.println("We had poured in this cup " + someLiquidVolume + "ml and now it's " + liquidVolume+" ml");
        if(this.liquidVolume>=MAX_LIQUID_VOLUME)
            System.out.println("Great,u had poured to much liquid on cup. Congratulation, pov !!!");
    }

    @Override
    public void pourOutLiquid(int someLiquidVolume) {
        super.pourOutLiquid(someLiquidVolume);
    }
}
