package OOP_Part_1.CupApp;

public class MainApp {
    public static void main(String[]args){

        //HW1:
        Cup cupA = new Cup("Tea",600);
           System.out.println(cupA.getLiquidName());
           System.out.println(cupA.getLiquidVolume());
        cupA.setLiquidName("Vodka");
        cupA.pourOutLiquid(50);
        System.out.println();

        Cup cupB = new Cup("Milk",500);
          System.out.println(cupB.getLiquidName());
          System.out.println(cupB.getLiquidVolume());
        cupA.setLiquidName("Liquor");
        cupB.poorInLiquid(150);
        System.out.println();
        //HW2:
        //SmallCup
        System.out.println("SmallCup Object:");
        SmallCup smallCup = new SmallCup("Water",200);
           System.out.println(smallCup.getLiquidName());
           System.out.println(smallCup.getLiquidVolume());
           System.out.println();
        //BigCup
        System.out.println("BigCup Object:");
        BigCup bigCup = new BigCup("Water",200);
            System.out.println(smallCup.getLiquidName());
             System.out.println(smallCup.getLiquidVolume());
             bigCup.poorInLiquid(cupB.getLiquidVolume());
        System.out.println(bigCup.getLiquidVolume());
    }
}
