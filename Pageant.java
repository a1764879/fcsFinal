import java.lang.Error;
class Pageant {
  FinalistList finalists;
  int MAX_NUMBER =3;

  Pageant(){
    finalists = new FinalistList();
  }

  void addFinalist(Finalist finalist){
    System.out.println("num nodes: "+finalists.numberNodes);
    if(finalists.numberNodes < MAX_NUMBER){
      System.out.println("addFinalist");
      finalists.add(new Node(finalist));
    } else {
      throw new Error("Exceed");
    }
  }

  void printContestList(){
    System.out.println("number: " + finalists.numberNodes);
    int num = finalists.numberNodes;
    while(num>0){
      Finalist ff = finalists.del().data;
      ff.display();
      num--;
    }
  }



}
