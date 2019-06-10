class Pageant {
  FinalistList finalists;
  int MAX_NUMBER =3;
  int fLength =0;

  Pageant(){
    finalists = new FinalistList();
  }

  void addFinalist(Finalist finalist){
    if(MAX_NUMBER >= finalists.numberNodes){
      finalists.add(new Node(finalist));
      // finalists[fLength] = finalist;
      fLength++;
    }

  }

  void printContestList(){
    Finalist ff = finalists.del().data;
    ff.display();
  }


}
