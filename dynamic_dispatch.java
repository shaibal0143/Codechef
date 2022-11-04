package javaProgram.oops;

class phone {
    public void one() {
        System.out.println("I am doing Java..");
    }

    public void hello() {
        System.out.println("This is a Phone..");
    }

}

class smartphone extends phone {
    public void one() {
        System.out.println("I am doing Java2..");
    }

    public void hello() {
        System.out.println("This is a SmartPhone..");
    }

    public void music() {
        System.out.println(" playing music..");
    }

}

public class dynamic_dispatch {
    public static void main(String[] args) {
        // phone p1 = new phone();
        // p1.one();
        // p1.hello();
        // smartphone s1 = new smartphone(); // Allowed in java(Already Known)
        // s1.one();
        // s1.hello2();

        // Dynamic method Dispatch
        phone p2 = new smartphone(); // Allowed
        // smartphone s2 = new phone(); //Not allowed
        p2.one();
        p2.hello();
        // p2.music(); // Not Allowed because It is not described in class phone

    }

}
