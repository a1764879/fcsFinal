import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    // System.out.println("Hello World");
    // System.out.println("here");
    float[] skills = {10.0f,10.0f,10.0f,10.0f,10.0f};
    Finalist ff = new Finalist("TSwift","engla",18,skills,"kill ");
    Finalist ff1 = new Finalist("KPErry","belgiu",18,skills,"die");
    Finalist ff2 = new Finalist("Wtf","space",18,skills,"live");
    Pageant pg = new Pageant();
    pg.addFinalist(ff);
    pg.addFinalist(ff1);
    pg.addFinalist(ff2);
    // pg.addFinalist(ff2);
    pg.printContestList();
  }
}
