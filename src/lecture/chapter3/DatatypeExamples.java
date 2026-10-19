package lecture.chapter3;

public class DatatypeExamples {

  public static void main(String[] args) {

    // Variablen Deklaration
    double numberA;

    // Variablen Initialisierung
    numberA = 5.45;

    numberA = 5.85;

    // Daklaration & Initialisisierung
    double numberB = 10.3;

    double numberC, numberD = 42.2, numberE;


    // Auf nicht initialisierte Variablen lässt uns der Kompiler nicht zugreifen
    //System.out.println(numberC);

    final double PI;

    PI = 3.14;

    // Konstanten können nach der Initialisierung nicht mehr geändert werden
    // PI = 5;

    int numberF = 42;

    int numberG = numberF;

    String myShortText = "Ich bin auch ein Literal";


    // Ganzzahl-Literale

    numberF = 42;   // Literal -> Dezimalsystem
    System.out.println(numberF);  // Ausagbe: 42

    numberF = 042;  // Literal -> Prefix 0 -> Oktalsystem
    System.out.println(numberF);  // Ausagbe: 34

    numberF = 0x42; // Literal -> Prefix 0x -> Hexadezimalsystem
    System.out.println(numberF);  // Ausagbe: 66
    numberF = 0xA2; // Literal -> Prefix 0x -> Hexadezimalsystem
    System.out.println(numberF);  // Ausagbe: 162

    numberF = 0b1010; // Literal -> Prefix 0x -> Hexadezimalsystem
    System.out.println(numberF);  // Ausagbe: 10


    // Long Literal
    long largeNumberF = 3_000_000_000L;
    largeNumberF = 1L;

    // Fließkomma-Literale

    // Double Literal
    numberA = 5.85;
    System.out.println(numberA);
    numberA = .55;
    System.out.println(numberA);
    numberA = 5.;
    System.out.println(numberA);
    numberA = .55e2; // --> 0.55 * 10^2
    System.out.println(numberA);
    numberA = .55e-2; // --> 0.55 * 10^-2
    System.out.println(numberA);
    numberA = 5.85d;
    System.out.println(numberA);

    // Float Literal
    float numberH = 5.5f;
    System.out.println(numberH);
    numberH = 5.5e-2f;
    System.out.println(numberH);

    // Georgs Literale (Boolean)
    boolean isRaining = false;  // true / false

    // Char-Literal
    char firstCharacter = 'A';
    System.out.println(firstCharacter);
    firstCharacter = '!';
    System.out.println(firstCharacter);
    firstCharacter = '@';
    System.out.println(firstCharacter);
    firstCharacter = '\u2764';
    System.out.println(firstCharacter);
    firstCharacter = '\n';
    System.out.println(firstCharacter);
    firstCharacter = '\\';
    System.out.println(firstCharacter);

    // Zeichenkette (String Literal)
    myShortText = "Hier steht ein \"geiler\" \u2764 Text von Roland Kaiser \n hier steht ein Backslash \\";
    System.out.println(myShortText);


    String html = "<html>\n" +
      "\t<body>\n" +
      "\t\t<p>Hello, world</p>\n" +
      "\t</body>\n" +
      "</html>";

    System.out.println(html);

    html = """
      <html>
        <body>
          <p>Hello, world \u2764</p>
        </body>
      </html>
      """;

    System.out.println(html);

  }

}
