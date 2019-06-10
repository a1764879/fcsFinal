abstract class Contestant {
  String name;
  String country;
  int age;
  int[] skills;

  Contestant(String name, String country, int age){
      this.name = name;
      this.country = country;
      this.age = age;
  }

  Contestant(String name, String country, int age, int[] skills){
      this.name = name;
      this.country = country;
      this.age = age;
      this.skills = skills;
  }

}
