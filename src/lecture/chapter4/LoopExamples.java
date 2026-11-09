package lecture.chapter4;

public class LoopExamples {

  static void main(String[] args) {

    int count = 0;

    // Kopfgesteuerte Schleife
    System.out.println("0-9 Kopfgesteuert - While Schleife");
    while (count < 10) {
      if(count == 6){
        System.out.println("Zahl des Teufels!!!!");
        count++;
        continue;
      }
      System.out.println(count);
      count++;
    }


    // Fußgesteuerte Schleife
    System.out.println("0-9 Fußgesteuert - Do-While Schleife");
    count = 0;

    do{
      System.out.println(count);
      count++;
    }while (count < 10);


    // ZählerSchleife
    System.out.println("0-9 Zählerschleife - For Schleife");
    for(int i = 0; i < 10; i++){
      System.out.println(i);
    }

    System.out.println("5er Schritte - For Schleife");
    for(count = 0; count < 50; count = count + 5){
      System.out.println(count);
    }

    System.out.println("Ausgabe - LuckyNumbers - For Schleife");
    byte[] luckyNumbers = {5, 16, 42, 67};
    for(int i = 0; i < luckyNumbers.length; i++){
      if(luckyNumbers[i] == 42){
        System.out.println(luckyNumbers[i] + " beste Zahl! Machen nicht weiter!");
        break;
      }
      System.out.println(luckyNumbers[i]);
    }

    // For Each Schleife
    System.out.println("Ausgabe - LuckyNumbers - For-Each Schleife");
    for(byte luckyNumber : luckyNumbers){
      System.out.println(luckyNumber);
    }


    // Timmmmmmmmmmmmay - Schleife

    System.out.println("Timmmmmmmmmmmmay - Schleife");
    count = 0;
    for(;;){
      System.out.println(count++);
      if(count > 9){
        break;
      }
    }



  }
}
