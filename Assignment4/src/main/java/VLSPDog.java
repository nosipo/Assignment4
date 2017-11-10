/*
	LSP - Liskov Substitution Principle violation
	The class MuteMouse fails to make some noise as promised by the parent class.
*/

public class VLSPDog extends LSPAnimal {

    public void makeSomeNoise (){
        System.out.println("woof woof");
    }
}
