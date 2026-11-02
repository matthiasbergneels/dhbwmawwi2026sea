package lecture.chapter3;

public class ArrayExamples {

  static void main(String[] args) {

    /*
    int lottoZahl1;
    int lottoZahl2;
    int lottoZahl3;
    int lottoZahl4;
    int lottoZahl5;
    int lottoZahl6;

    int lottoZusatzzahl;

     */

    int[] lottoZahlen = new int[7];

    lottoZahlen[0] = 6;
    lottoZahlen[1] = 14;

    System.out.println(lottoZahlen[0]);
    System.out.println(lottoZahlen[5]);

    System.out.println("Anzahl Felder in lottoZahlen: " + lottoZahlen.length);

    char[][] tictactoe = new char[3][3];

    tictactoe[1][1] = 'X';
    tictactoe[1][2] = 'O';
    tictactoe[0][0] = 'X';

    String[][][] book = new String[10][][];

    book[0] = new String[8][];

    book[0][0] = new String[7];

    book[0][0][0] = "Herzlich";
    book[0][0][1] = "Willkommen";
    book[0][0][2] = "bei";
    book[0][0][3] = "Java";
    book[0][0][4] = "ist";
    book[0][0][5] = "eine";
    book[0][0][6] = "Insel";

    book[0][1] = new String[3];
    book[0][1][0] = "Voll";
    book[0][1][1] = "doof";
    book[0][1][2] = "hier";



  }
}
