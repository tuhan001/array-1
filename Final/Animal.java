// demo

class Animal{
    public void displayinfo(){
        System.out.println("Animal");
    }
}
class dog extends Animal {
    public void displayinfo(){
        System.out.println("dog");
    }
}
class Main {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.displayinfo();
    }
}
