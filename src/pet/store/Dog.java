package pet.store;

public class Dog extends Animal {
    private String owner;

    public Dog(Color color, String owner){
        super(color); // Invoking the Superclass Constructor (parent class)
        this.owner = owner;
    }

    public String getOwner(){
        return this.owner;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    // overriding the parent's eat() method
    @Override
    public String eat(){
        return super.eat() + " both bread and meat";
    }

    // new method in the subclass
    public String bark(){
        return "A dog can bark";
    }

    @Override
    public String toString(){
        //NOTE: we can access the Animal's color from the parent's class because it's protected
        return "The " + this.color + " dog's owner is " + this.owner;
    }
}
