class Animal {
    private String fur_color;
    private int num_of_leg;
    private String type;
    private String feed;

    public Animal() {}

    public Animal(String fur_color, int num_of_leg, String type, String feed) {
        this.fur_color = fur_color;
        this.num_of_leg = num_of_leg;
        this.type = type;
        this.feed = feed;
    }

    public void setFurColor(String fur_color) {
        this.fur_color = fur_color;
    }

    public void setNumOfLeg(int num_of_leg) {
        this.num_of_leg = num_of_leg;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFeed(String feed) {
        this.feed = feed;
    }

    public String getFurColor() {
        return this.fur_color;
    }

    public int getNumOfLeg() {
        return this.num_of_leg;
    }

    public String getType() {
        return this.type;
    }

    public String getFeed() {
        return this.feed;
    }
}

class Plant{
    private String name;
    private String color;
    private int num_of_petal;

    public Plant() {}

    public Plant(String name, String color, int num_of_petal) {
        this.name = name;
        this.color = color;
        this.num_of_petal = num_of_petal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumOfPetal(int num_of_petal) {
        this.num_of_petal = num_of_petal;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public int getNumOfPetal() {
        return this.num_of_petal;
    }
}

class Vehicle{
    private String type;
    private String color;
    private int num_of_tire;

    public Vehicle() {}

    public Vehicle(String type, String color, int num_of_tire) {
        this.type = type;
        this.color = color;
        this.num_of_tire = num_of_tire;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumOfTire(int num_of_tire) {
        this.num_of_tire = num_of_tire;
    }

    public String getType() {
        return this.type;
    }

    public String getColor() {
        return this.color;
    }

    public int getNumOfTire() {
        return this.num_of_tire;
    }
}

class Cat extends Animal{
    private int num_of_leg;
    private String fur_color;

    public int getNumOfLeg(){
        return this.num_of_leg;
    }

    public void setNumOfLeg(int num_of_leg){
        this.num_of_leg = num_of_leg;
    }

    public String getFurColor(){
        return this.fur_color;
    }

    public void setFurColor(String fur_color){
        this.fur_color = fur_color;
    }

    public void show_identity(){
        System.out.print("Warna Bulu: " + this.getFurColor());
        System.out.println(", dengan jumlah kaki: " + this.getNumOfLeg());
    }
}

class Fish extends Animal{
    private String type;
    private String feed;

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getFeed(){
        return this.feed;
    }

    public void setFeed(String feed){
        this.feed = feed;
    }

    public void show_identity(){
        System.out.print("Jenis: " + this.getType());
        System.out.println(", makanan: " + this.getFeed());
    }
}

class Flower extends Plant{
    private String name;
    private String color;
    private int num_of_petal;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getNumOfPetal(){
        return this.num_of_petal;
    }

    public void setNumOfPetal(int num_of_petal){
        this.num_of_petal = num_of_petal;
    }

    public void show_identity(){
        System.out.print("Jenis: " + this.getName());
        System.out.print(", color: " + this.getColor());
        System.out.println(", kelopak: " + this.getNumOfPetal() + " buah.");
    }
}

class Car extends Vehicle{
    private String type;
    private String color;
    private int num_of_tire;

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getNumOfTire(){
        return this.num_of_tire;
    }

    public void setNumOfTire(int num_of_tire){
        this.num_of_tire = num_of_tire;
    }

    public void show_identity(){
        System.out.print("Type: " + this.getType());
        System.out.print(", color: " + this.getColor());
        System.out.println(", jumlah roda: " + this.getNumOfTire());
    }
}

public class Encapsulation{
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setFurColor("Hitam");
        cat1.setNumOfLeg(4);

        System.out.print("Saya Kucing dengan detail, ");
        cat1.show_identity();

        Cat cat2 = new Cat();
        cat2.setFurColor("Putih");
        cat2.setNumOfLeg(3);

        System.out.print("Saya Kucing dengan detail, ");
        cat2.show_identity();

        Fish fish1 = new Fish();
        fish1.setType("paus");
        fish1.setFeed("plankton");

        System.out.print("Saya Ikan dengan detail, ");
        fish1.show_identity();

        Fish fish2 = new Fish();
        fish2.setType("cupang");
        fish2.setFeed("cacing");

        System.out.print("Saya Ikan dengan detail, ");
        fish2.show_identity();

        Flower flower1 = new Flower();
        flower1.setName("bangkai");
        flower1.setColor("merah");
        flower1.setNumOfPetal(12);

        System.out.print("Saya Bunga dengan detail, ");
        flower1.show_identity();

        Flower flower2 = new Flower();
        flower2.setName("anggrek");
        flower2.setColor("Putih");
        flower2.setNumOfPetal(8);

        System.out.print("Saya Bunga dengan detail, ");
        flower2.show_identity();

        Car car1 = new Car();
        car1.setType("sedan");
        car1.setColor("merah");
        car1.setNumOfTire(4);

        System.out.print("Saya Mobil dengan detail, ");
        car1.show_identity();

        Car car2 = new Car();
        car2.setType("truk");
        car2.setColor("hijau");
        car2.setNumOfTire(6);

        System.out.print("Saya Mobil dengan detail, ");
        car2.show_identity();
    }
}