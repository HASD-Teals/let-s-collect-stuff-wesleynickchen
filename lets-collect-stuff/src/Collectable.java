public class Collectable {
    // Add collectable properties here
    private int age;
    private double value;
    private String name;
    private boolean broken;
    private int largeParts;
    private String color;
    // Add collectable constructors here

    public Collectable(){
        this.age = 17;
        this.value = 13.22;
        this.name = "tablet";
        this.broken = true;
        this.largeParts = 3;
        this.color = "red";
    }

    public Collectable(int age, double value, String name, boolean broken, int largeParts, String color){
        this.age = age;
        this.value = value;
        this.name = name;
        this.broken = broken;
        this.largeParts = largeParts;
        this.color = color;
    }
    // Add collectable accessors and mutators here
    public int getAge() {
        return this.age;
    }
    public double getValue() {
        return this.value;
    }
    public String getName() {
        return this.name;
    }
    public boolean getBroken() {
        return this.broken;
    }
    public int getParts() {
        return this.largeParts;
    }
    public String getColor() {
        return this.color;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setValue(double value) {
        this.value = value;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBroken(boolean broken) {
        this.broken = broken;
    }
    public void setParts(int largeParts) {
        this.largeParts = largeParts;
    }
    public void setColor(String color) {
        this.color = color;
    }
    // Add any methods here
    public void losePart() {
        largeParts -= 1;
    }

    public void losePart(int x) {
        largeParts -= x;
    }

    
    public String toString() {
        return (this.age + " " + this.value + " " + this.name + " " + this.broken + " " + this.largeParts + " " + this.color);
    }

    public boolean equals(Collectable obj) {
        return (this.age == obj.age && this.value == value && this.name == obj.name && this.broken == obj.broken && this.largeParts == obj.largeParts && this.color == obj.color);
    }
}