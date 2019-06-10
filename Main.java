import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    // System.out.println("Hello World");
    // System.out.println("here");
    int[] skills = {10,10,10,10,10};
    Finalist ff = new Finalist("Lady Burro","norway",18,skills,"kill em with kindness");
    Finalist ff1 = new Finalist("Lady Burro","norway",18,skills,"kill em with kindness");
    Pageant pg = new Pageant();
    pg.addFinalist(ff);
    pg.addFinalist(ff1);
    pg.printContestList();
  }
}
