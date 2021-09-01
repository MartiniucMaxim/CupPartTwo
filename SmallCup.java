package OOP_Part_1.CupApp;

public class SmallCup extends Cup{

    final int MIN_LIQUID_VOLUME = 0;
    final int MAX_LIQUID_VOLUME = 251;

    public SmallCup(String liquidName, int liquidVolume){
        super(liquidName,liquidVolume);
    }

    public SmallCup(){

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
    public void pourOutLiquid(int someLiquidVolume) {
        super.pourOutLiquid(someLiquidVolume);
    }

    @Override
    public void poorInLiquid(int someLiquidVolume) {
        super.poorInLiquid(someLiquidVolume);
    }
}
