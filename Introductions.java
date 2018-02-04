// A basic Java console app demonstrating input/output via the console.
// See https://github.com/EdwardRutz/java-introductions

import java.io.Console;  //import console type from java.io package

public class Introductions {

  public static void main(String[] args) {
    Console console = System.console();
  
    String firstName = console.readLine("What is your first name?  ");

    console.printf("Hello %s, my name is Hal\n", firstName);
    
    String lastName = console.readLine("What is your last name?  ");


    console.printf("%s is learning to write Java code\n", firstName + lastName);

  }
}