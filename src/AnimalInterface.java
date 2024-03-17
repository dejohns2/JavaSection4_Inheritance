import pet.store.Animal;
import pet.store.Color;
import pet.store.Dog;
import pet.store.Lion;

public class AnimalInterface {
    public static void main(String[] args) {
        Dog myDog = new Dog(Color.BLACK, "Debbie Johnson");
        System.out.println("My dog color is " + myDog.getColor());
        System.out.println("What does my dog eat? " + myDog.eat());

        System.out.println();

        Lion myLion = new Lion(Color.BROWN, "Africa");
        System.out.println("My lion color is " + myLion.getColor());
        System.out.println("What does my lion eat? " + myLion.eat());

        System.out.println();

        //Typecasting: upcasting
        Animal myAnimal = myDog;
        System.out.println("What does my animal eat? " + myAnimal.eat());

        System.out.println();

        //Typecasting: downcasting
        Dog stillMyDog = (Dog) myAnimal;
        System.out.println("What sound does my dog make? " + stillMyDog.bark());

        System.out.println();

        System.out.println(myAnimal instanceof Animal);
        System.out.println(myAnimal instanceof Dog);

        System.out.println();

        System.out.println(myDog);
        System.out.println(myLion);

    }

}
