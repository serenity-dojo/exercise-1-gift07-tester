package com.serenitydojo;
import org.junit.Test;
  public class HelloWorldWriteTest{
      @Test
      public void shouldWritehelloworldtotheconsole(){
          HelloWorldWriter writer = new HelloWorldWriter();
          writer.writeHelloWorld();
      }
      @Test
      public void declaringnumbers(){
          final int agethisYear = 42;
          int agenextYear = agethisYear + 1;
          System.out.println("age next year = " + agenextYear);

      }
      @Test
      public void workingWithStrings() {
          String firstName = "        sarah-jane   ";
          String upperCaseFirstName = firstName.replace("sara","mary");
          System.out.println(upperCaseFirstName.trim());


      }


}
