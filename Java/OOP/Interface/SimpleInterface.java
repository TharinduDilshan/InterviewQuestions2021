// Interface
interface Animal {
  // interface method (does not have a body)
  public void animalSound(); 
  public void sleep(); 
}

// Dog "implements" the Animal interface
class Dog implements Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The dog says: baw baw");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzz");
  }
}

class SimpleInterface {
  public static void main(String[] args) {
    // Create a Dog object
    Dog myDog = new Dog();  
    myDog.animalSound();
    myDog.sleep();
  }
}