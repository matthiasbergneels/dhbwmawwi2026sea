package lecture.chapter5;

public class NumberSummarizer {

  public void sumNumbers(int... numbers){
    int sum = 0;
    for(int number : numbers){
      sum += number;
    }
    System.out.println("Summe: " + sum);
  }

  /*
  public void sumNumbers(int numberA, int numberB){
    System.out.println("Summe: " + (numberA + numberB));
  }

  public void sumNumbers(int numberA, int numberB, int numberC){
    System.out.println("Summe: " + (numberA + numberB + numberC));
  }

  public void sumNumbers(int numberA, int numberB, int numberC, int numberD){
    System.out.println("Summe: " + (numberA + numberB + numberC + numberD));
  }

  public void sumNumbers(int numberA, int numberB, int numberC, int numberD, int numberE){
    System.out.println("Summe: " + (numberA + numberB + numberC + numberD + numberE));
  }

   */

  static void main(String[] args) {
    NumberSummarizer summarizer = new NumberSummarizer();

    summarizer.sumNumbers(1, 728, 3);
    summarizer.sumNumbers(1, 2, 891, 4);
    summarizer.sumNumbers(1, 200 );
  }

}
