package arrays;

public class Practice6 {
    public static void main(String[] args) {
        char[] symbols = {'a','#','1','W','3','6','@'};
        // Print out digits, letters and other symbols
        // count digits, numbers and other symbols

        int digitsN=0,letterN=0,otherN=0;
        for (int i=0;i<symbols.length;i++){

            if (symbols[i]>='0' && symbols[i]<='9'){
                digitsN++;
                System.out.println("Digits "+symbols[i]);
            } else if (symbols[i]>='a'&&symbols[i]<='z'||symbols[i]>='A'&&symbols[i]<='Z') {
                letterN++;
                System.out.println("Letters "+symbols[i]);
                
            }else{
                otherN++;
                System.out.println("OTHERS "+symbols[i]);
            }

        }
        System.out.println("There are "+digitsN+" Digits");
        System.out.println("There are "+letterN+" letters");
        System.out.println("There are "+otherN+" other symbols ");
    }
}
