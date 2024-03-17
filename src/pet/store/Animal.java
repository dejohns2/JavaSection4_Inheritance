package pet.store;

public class Animal {
    protected Color color; // protected so sub class can access it too

    public Animal(){}

    public Animal(Color color){
        this.color = color;
    }

    public Color getColor(){
        return this.color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public String eat(){
        return "It can eat";
    }

    @Override
    public String toString(){
        return "This animal is " + this.color;
    }
}
