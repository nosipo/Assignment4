/*
	LSP - Liskov Substitution Principle adherence
	The class MuteMouse makes some noise as promised by the parent class.
*/

public class LSPMuteMouse extends LSPAnimal {

    public void makeSomeNoise (){
        System.out.println("I cannot make audible noise");
    }
}
