package lecture.chapter5;

public class CampusBar {

  static void main(String[] args) {

    Student sally = new Student("Sally", 4711);

    sally.drink(0.75);
    sally.drink(0.5, 0.3f);
    sally.drink(1.);
    sally.drink(0.75, 0.8f);
    sally.drink(0.3, 130);

  }
}
