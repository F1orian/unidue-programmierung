/*
 * Created by: Institut für Informatik und Wirtschaftsinformatik, Universität Duisburg-Essen
 *
 * <p>For learning purpose only.
 *
 * <p>Solved/Edited by Oppa Hansi. Possible solution - there are other ways to solve these tasks.
 */
package com.oppahansi.ws1516.mp.mp4;

public class Person {

  private String name;
  private Rang rang;
  private String rangname;
  private boolean istmaennlich;
  private Person linkerNf;
  private Person rechterNf;

  Person(String name, Rang rang, Person linkerNf, Person rechterNf, boolean istmaennlich) {
    this.name = name;
    this.rang = rang;
    this.rangname = rang.toString();
    this.linkerNf = linkerNf;
    this.rechterNf = rechterNf;
    this.istmaennlich = istmaennlich;
  }

  public String getName() {
    return name;
  }

  public Rang getRang() {
    return rang;
  }

  public Person getLinks() {
    return linkerNf;
  }

  public void setLinks(Person linkerNf) {
    this.linkerNf = linkerNf;
  }

  public Person getRechts() {
    return rechterNf;
  }

  public void setRechts(Person rechterNf) {
    this.rechterNf = rechterNf;
  }

  public boolean getIstMaennlich() {
    return istmaennlich;
  }

  public void vorstellen() {
    System.out.println(
        "Mein Name ist "
            + name
            + ", ich habe den Rang "
            + rangname
            + " und bin "
            + (istmaennlich ? "ein Mann" : "eine Frau")
            + ".");
  }
}
