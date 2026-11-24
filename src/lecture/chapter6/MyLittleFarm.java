package lecture.chapter6;

public class MyLittleFarm {

  public static void main(String[] args) {

    Animal myAnimal = new Animal("Theo", 56.0f, 60.0f);

    myAnimal.eat();
    myAnimal.breathe();
    myAnimal.move();
    // myAnimal.bark(); --> nur in Dog definiert

    Dog myDog = new Dog("Bello", 34.0f, 64.f, "Schäferhund");

    myDog.eat();
    myDog.breathe();
    myDog.move();
    myDog.bark();

  }

}
