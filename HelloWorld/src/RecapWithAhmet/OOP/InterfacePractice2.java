package RecapWithAhmet.OOP;

public interface InterfacePractice2 {

    default void run(){
        System.out.println("Hello I am a regular method from interface you can" +
                "call me by adding keyword default before void ");
    }

    public abstract void dismiss();

    void speakWithAhmet();

}
