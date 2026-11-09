package lecture.chapter4;

public class IfStatementExamples {

  static void main(String[] args) {

    boolean isRaining = false;

    if(isRaining) {
      System.out.println("Regenschirm einpacken");
      System.out.println("Ich hasse Regen!");
    } else {
      System.out.println("endlich wieder Sonne!");
    }

    System.out.println("Haus verlassen!");

    int carSpeed = 33;

    System.out.println("==== Geschwindigkeitsmessung ====");
    // prüfung in der Ortschaft
    if(carSpeed > 50) {
      System.out.println("zu schnell!");
    } else if(carSpeed > 30 && carSpeed <= 50){
      System.out.println("so ist es richtig");
    } else if(carSpeed > 23 && carSpeed <= 30){
      System.out.println("gerade noch ok!");
    }else if(carSpeed > 20 && carSpeed <= 23){
      System.out.println("bissel schneller wäre nicht verkehrt");
    } else {
      System.out.println("Schildkröte!!!");
    }

  }
}
