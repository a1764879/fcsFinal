class Finalist extends Contestant {
    String moto;

    Finalist(String name, String country, int age, int[] skills,String moto){
      super(name,country,age,skills);
      this.moto = moto;
    }

    public void display(){
      System.out.print("::Contestant: ");
      System.out.println(this.name+", "+this.age+" yr from "+this.country);
      System.out.print(":: confidence: "+this.skills[0]+"\n");
      System.out.print(":: ambition: "+this.skills[1]+"\n");
      System.out.print(":: credibility: "+this.skills[2]+"\n");
      System.out.print(":: grace: "+this.skills[3]+"\n");
      System.out.print(":: authenticity: "+this.skills[4]+"\n");
      System.out.println(":: moto: "+this.moto);
    }

}
