package Main;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Cosmeticcase  SomeCosmeticcase=new Cosmeticcase();
        Cosmeticcase Handbagcosmetic= new Cosmeticcase("Handbag cosmetic", "Is placed in the bag", "Brown", 50 );
        Cosmeticcase Cosmeticpencilcase= new Cosmeticcase("Cosmetic pencil case" ,"Is placed in the bag", "Black", 60, 70   );


        System.out.println( SomeCosmeticcase.toString());
        System.out.println(Handbagcosmetic.toString());
        System.out.println(Cosmeticpencilcase.toString());


        SomeCosmeticcase.printSum();
        Handbagcosmetic.printSum();
        Cosmeticpencilcase.printSum();
        Cosmeticpencilcase.printStaticSum();
        System.out.println(" ");

        SomeCosmeticcase.resetValues("Cosmeticcase", "size", "color", 12);
        Handbagcosmetic.resetValues("Handbagcosmetic", "Is placed in the bag", "Brown", 14);
        Cosmeticpencilcase.setTotalKind(50);


        System.out.println( SomeCosmeticcase.toString());
        System.out.println(Handbagcosmetic.toString());
        System.out.println(Cosmeticpencilcase.toString());


        Cosmeticcase.printStaticSum();
        Cosmeticpencilcase.printSum();
        SomeCosmeticcase.printSum();

    }
}


