package pet.store;

public class Lion extends Animal {
    private String jungleName;

    public Lion(Color color, String jungleName){
        super(color); // Invoking the Superclass Constructor (parent class)
        this.jungleName = jungleName;
    }

    public String getJungleName(){
        return this.jungleName;
    }

    public void setJungleName(String jungleName){
        this.jungleName = jungleName;
    }

    // overriding the parent's eat() method
    @Override
    public String eat(){
        return super.eat() + " only meat";
    }

    // new method in the subclass
    public String road(){
        return "A lion can roar";
    }

    @Override
    public String toString(){
        //NOTE: we can access the Animal's color from the parent's class because it's protected
        return "The " + this.color + " loin lives in " + this.jungleName;
    }
}
