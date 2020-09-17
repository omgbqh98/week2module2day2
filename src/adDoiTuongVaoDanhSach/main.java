package adDoiTuongVaoDanhSach;

public class main {
    public static void main(String[] args) {
        MylistDog mylistDog = new MylistDog();
        Animal dog = new Dog();
        Animal cat = new Cat();
        mylistDog.add(dog);
        mylistDog.add(cat);
    }

}
