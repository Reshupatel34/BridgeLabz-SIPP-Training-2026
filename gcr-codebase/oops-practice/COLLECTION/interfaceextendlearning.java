package COLLECTION;

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name);
    }
}

class dog extends Animal {
    String bread;

    dog(String name, String bread) {
        //constructor call kra phle 
        super(name);
        this.bread = bread;

    }

    void bark() {
        System.out.println("dog is braking");
    }

    void showdetails() {
        display();
        System.out.println("details"+bread);
    }
}

class interfaceextendlearning {
    public static void main(String[] args) {
        dog d1 = new dog("cherry", "labrador");
        d1.showdetails();
        d1.bark();
    }

}
