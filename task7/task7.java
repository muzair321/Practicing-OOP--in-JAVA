import javafx.scene.media.AudioClip;
import java.nio.file.Paths;
import java.util.Scanner;

public class task7 {
    public static Scanner inp = new Scanner(System.in);
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal cow = new Cow();
        while(true){
            System.out.println("1. Cat Sound\n2. Dog Sound\n3. Cow Sound\n4. Exit");
            switch(inp.nextInt()){
                case 1:
                    cat.makeSound();
                    break;
                case 2:
                    dog.makeSound();
                    break;
                case 3:
                    cow.makeSound();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
class Animal{
    void makeSound(){
    }
}
class Cat extends Animal{
    @Override
    void makeSound(){
        String path = "cat.mp3";
        AudioClip clip = new AudioClip(Paths.get(path).toUri().toString());
        clip.play();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        String path = "dog.mp3";
        AudioClip clip = new AudioClip(Paths.get(path).toUri().toString());
        clip.play();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Cow extends Animal{
    @Override
    void makeSound(){
        String path = "cow.mp3";
        AudioClip clip = new AudioClip(Paths.get(path).toUri().toString());
        clip.play();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}