import java.util.Locale;

public class MorseCode implements Translator{
    private char[] letters = new char[]{'A','B','C','D','E',
            'F','G','H','I','J','K',
            'L','M','N','O','P',
            'Q','R','S','T','U',
            'V','W','X','Y','Z'};
    private String[] symbols = new String[]{".-","-...","-.-.","-..",".",
            "..-.","--.","....","..",".---","-.-",
            ".-..","--","-.","---",".--.",
            "--.-",".-.","...","-","..-",
            "...-",".--","-..-","-.--","--.."};

    public String code(String word) {
        String inCapitalLetters = word.toUpperCase();
        StringBuilder codedWord = new StringBuilder("coded word: ");
        for (int i = 0; i < inCapitalLetters.length(); i++) {
            for (int j = 0; j < letters.length; j++) {
                if (inCapitalLetters.charAt(i) == letters[j]) {
                    // Jaka metoda dodaje "some text" do zawartości obiektu <StringBuilder>?
                    // https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html
                    // Proszę zamienić metodę add() na prawidłową metodę:
                    codedWord.append(symbols[j] + " ");
                    break;
                }
            }
        }
        return codedWord.toString();
    }

    @Override
    public String decode(String code) {
        StringBuilder uncodedWord = new StringBuilder("uncoded word: ");
        String[] separateSymbols = code.split(" ");
        String[] codedSymbols = new String[separateSymbols.length];
        for (int i=0;i<separateSymbols.length;i++){
            codedSymbols[i] = separateSymbols[i];
        }

        for(int i=0;i< codedSymbols.length;i++){
            for(int j=0;j<symbols.length;j++){
                if(codedSymbols[i].equals(symbols[j])){
                    // Jaka metoda dodaje "some text" do zawartości obiektu <StringBuilder>? append
                    // https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html
                    // Proszę zamienić metodę add() na prawidłową metodę:
                    uncodedWord.append(letters[j]);
                    break;
                    // (?) Co będzie jeżeli usuniemy "break();"
                    // YOUR ANSWER:
                }
            }
        }
        return uncodedWord.toString().toLowerCase();
    }
}
