abstract class Contestant {
  String name;
  String country;
  int age;
  float[] skills;
  float mean;

  Contestant(String name, String country, int age){
      this.name = name;
      this.country = country;
      this.age = age;
  }

  Contestant(String name, String country, int age, float[] skills){
      this.name = name;
      this.country = country;
      this.age = age;
      this.skills = skills;
      this.mean = getMean();
  }

  public float getMean(){
    float average=0;
    for(float ii: skills){
      average+=ii;
    }
    return average/skills.length;
  }

}
