package lecture.chapter4;

public class OperatorExamples {

  static void main(String[] args) {

    // arithmetische Operaturen

    int numberA = 9;
    int numberB = 58;

    int result = numberA + numberB;

    System.out.println("9 + 58 = " + result);

    result = numberB % numberA;
    System.out.println("58 % 9 = " + result);

    // inkrement / dekrement

    // Post inkrement
    numberA++; // ==> numberA = numberA + 1;

    // Pre inkrement
    ++numberA; // ==> numberA = numberA + 1;

    numberA =+ 1;

    numberA = 10;
    numberB = 20;

    result = numberA++ + numberB;

    System.out.println("numberA++ + numberB = " + result);
    System.out.println(numberA);
    System.out.println(numberB);

    numberA = 10;
    numberB = 20;

    result = ++numberA + numberB;

    System.out.println("++numberA + numberB = " + result);
    System.out.println(numberA);
    System.out.println(numberB);

    numberA = 10;
    result = numberA++ + numberA++ + numberA++;
    System.out.println("numberA++ + numberA++ + numberA++ = " + result);
    System.out.println(numberA);


    // Relationale Operatoren

    // primitive Datentypen
    numberA = 10;
    numberB = 20;

    boolean compareResult;

    compareResult = (numberA == numberB);
    compareResult = (numberA != numberB);
    compareResult = (numberA >= numberB);


    // Referenz Datentypen

    byte[] myPinCode = {4, 4, 4, 4};

    // komplexe Datentype / Referenz Datentypen -> Call by Reference
    byte[] yourPinCode = myPinCode;

    byte[] ourPinCode = {4, 4, 4, 4};

    boolean similarPinCode;

    similarPinCode = (myPinCode == yourPinCode);
    System.out.println("my & your similarPinCode? " + similarPinCode);
    similarPinCode = (myPinCode == ourPinCode);
    System.out.println("my & our similarPinCode? " + similarPinCode);

    //System.out.println("Inhalt von my & our identisch? " + myPinCode.equals(ourPinCode));


    String text1 = "Hallo";
    String text2 = "Hallo";
    String text3 = text1;
    String text4 = new String("Hallo");

    boolean similarText;

    similarText = (text1 == text2);
    System.out.println(text1 + " & " + text2 + " - similarText? " + similarText);
    similarText = (text1 == text3);
    System.out.println(text1 + " & " + text3 + " - similarText? " + similarText);
    similarText = (text1 == text4);
    System.out.println(text1 + " & " + text4 + " - similarText? " + similarText);

    System.out.println("Inhalt von text1 & text4 identisch? " + text1.equals(text4));


    // logische Operatoren

    boolean isRaining = false;
    boolean haveToLeaveHome = true;

    boolean needUmbrella;

    needUmbrella = isRaining && haveToLeaveHome;

    System.out.println("regenschirm? " + needUmbrella);


    String weather = isRaining ? "Es regnet" : "Es ist sonnig";
    System.out.println("Wetter: " + weather);

    numberA = 350;
    numberB = 20;

    int biggerNumber = (numberA >= numberB) ? numberA : numberB;
    System.out.println("Größere Zahl: " + biggerNumber);
    {
      text1 = "Hallo";
      text2 = "Welt!";

      // + => String Verkettung
      String resultText = text1 + " " + text2;

      System.out.println(numberA + numberB + resultText + (numberA + numberB));
    }
  }
}
