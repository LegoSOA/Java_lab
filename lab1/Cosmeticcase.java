package Main;

public class Cosmeticcase {
    private String name= "no name";
    private String type;
    private String material;
    private int price;
    private int brand;
    private static int totalKind=0;

    public Cosmeticcase(){

    }

    public Cosmeticcase(String name, String type, String material, int price ){
        setName(name);
        setType(type);
        setMaterial(material);
        setBrand(price);
    }

    public Cosmeticcase(String name, String type, String material, int price, int brand){
        setName(name);
        setType(type);
        setMaterial(material);
        setPrice(price);
        setBrand(brand);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }


    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setBrand(int brand) {
        this.brand = brand;
    }

    public int getBrand() {
        return brand;
    }
    public double getBtand(){
        return brand;
    }

    public String toString(){
        return "Info about cosmetic case in shop: \nname: " + getName()
                + "\ntype: " + getType()
                + "\ncolor: " + getMaterial()
                + "\nprice: " + getPrice()
                + "\nbrand: " + getBrand()
                + "\n";



    }

    public static void printStaticSum(){
        System.out.print("All of these kinds:" + totalKind + "\n");

    }

    public void printSum(){
        System.out.println("Name of this cosmetic case: " +getName()+ "." + " It is a " +getType()+" cosmetic case.It consist of "+ getMaterial() +" material.Price of this cosmetic case: " + getPrice() +" grn.");

    }

    public void resetValues(String name, String type, String material, int brand){
        setName(name);
        setType(type);
        setPrice(price);
        setMaterial(material);
        setBrand(brand);
    }

    public void setTotalKind(int totalKind){
        Cosmeticcase.totalKind -=this.totalKind;
        Cosmeticcase.totalKind += Cosmeticcase.totalKind;
    }
}

