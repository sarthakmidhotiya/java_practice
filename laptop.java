
class Laptop{
    String brand;
    String RAM;
    int price;
    public Laptop(String brand, String RAM, int price){
        this.brand = brand;
        this.RAM = RAM;
        this.price = price;
    }
    
    void display(){
        System.out.println("brand= " + brand);
        System.out.println("RAM= " + RAM);
        System.out.println("price= " + price);
    }
    


class Main {
    public static void main(String[] args) {
        Laptop s1=new Laptop("HP","8GB",5500);
        s1.display();
    }
}
}