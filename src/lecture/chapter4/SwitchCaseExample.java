package lecture.chapter4;

public class SwitchCaseExample {

  static void main(String[] args) {

    byte grade = 3;

    System.out.println("Nach alter Syntax:");
    switch(grade){
      case 1:
        System.out.println("Sehr gut");
        break;
      case 2:
        System.out.println("Gut");
        break;
      case 3:
        System.out.println("Befriedigend");
        break;
      case 4:
        System.out.println("Ausreichend");
        break;
      case 5:
        System.out.println("Mangelhaft");
        break;
      default:
        System.out.println("Ungültige Note");
    }

    switch(grade){
      case 1:
      case 2:
      case 3:
      case 4:
        System.out.println("bestanden");
        break;
      case 5:
        System.out.println("nicht bestanden");
        break;
      default:
        System.out.println("Ungültige Note");
    }

    System.out.println("Nach neuer Syntax:");
    switch(grade){
      case 1 -> System.out.println("sehr gut");
      case 2 -> System.out.println("gut");
      case 3 -> System.out.println("befriedigend");
      case 4 -> System.out.println("ausreichend");
      case 5 -> System.out.println("mangelhaft");
    }

    switch(grade){
      case 1, 2, 3, 4 -> System.out.println("Bestanden");
      case 5 -> System.out.println("nicht bestanden");
    }

    String gradeText = switch(grade){
      case 1 -> "sehr gut";
      case 2 -> "gut";
      case 3 -> "befriedigend";
      case 4 -> "ausreichend";
      case 5 -> "mangelhaft";
      default -> "ungültige Note";
    };

    System.out.println("Die Note " + grade + " entspricht:" + gradeText);

    String day = "SATURDAY";
    int numLetters = switch (day) {
      case "MONDAY", "FRIDAY", "SUNDAY" -> 6;
      case "TUESDAY" -> 7;
      default -> {
        int result = day.length();
        yield result;
      }
    };

    System.out.println("Anzahl an Buchstaben in " + day + ": " + numLetters);

    numLetters = switch (day) {
      case "MONDAY", "FRIDAY", "SUNDAY" -> 6;
      case "TUESDAY" -> 7;
      default -> day.length();
    };

    System.out.println("Anzahl an Buchstaben in " + day + ": " + numLetters);

  }
}
