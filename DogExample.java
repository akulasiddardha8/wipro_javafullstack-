class Animal {
    void sound(){
       System.out.println("Animal makes a sound");
}
}
 class Dog extends Animal {
    @Override
      void sound(){
          System.out.println("Dogs barks");
}
}
   public class DogExample{
 public static void main(String[] args){
    Animal a = new Dog();
    a.sound();
   }
}