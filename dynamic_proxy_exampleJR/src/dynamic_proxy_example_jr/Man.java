/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dynamic_proxy_example_jr;

/**
 *
 * @author tabakaev_mv
 */
public class Man implements Person {

   private String name;
   private int age;
   private String city;
   private String country;

   public Man(String name, int age, String city, String country) {
       this.name = name;
       this.age = age;
       this.city = city;
       this.country = country;
   }

   @Override
   public void introduce() {

       System.out.println("Меня зовут " + this.name);
   }

   @Override
   public void sayAge(int age) {
       System.out.println("Мне " + this.age + " лет");
   }

   @Override
   public void sayFrom(String city, String country) {

       System.out.println("Я из города " + this.city + ", " + this.country);
   }

   //..геттеры, сеттеры, и т.д.
   public String getName() {
    return name;
   }
   
   public int getAge() {
    return age;
   }
   
   public String getCity() {
    return city;
   }
   
   public String getCountry() {
    return country;
   }
   
   public void setName(String name) {
    this.name = name;
   }
   
   @Override
   public String toString() {
   return "name = " + getName() + 
          "\nage = " + getAge() +
          "\ncity = " + getCity() + 
          "\ncountry = " + getCountry();
   }
}
