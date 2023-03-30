public class LettersToNumbers implements Translator {
    private char[] letters = new char[]{'A','B','C','D','E',
            'F','G','H','I','J','K',
            'L','M','N','O','P',
            'Q','R','S','T','U',
            'V','W','X','Y','Z'};
    private int[] numbers = new int[]{11,12,13,14,15,
            21,22,23,24,24,25,
            31,32,33,34,35,
            41,42,43,44,45,
            51,52,53,54,55};

    @Override
    public String code(String word) {
        String inCapitalLetters = word.toUpperCase();
        StringBuilder codedWord = new StringBuilder("coded word: ");
        for(int i=0;i<inCapitalLetters.length();i++){
            for(int j=0;j<letters.length;j++){
                if(inCapitalLetters.charAt(i) == letters[j]){
                    // Jaka metoda dodaje "some text" do zawartości obiektu <StringBuilder>? Odp: append
                    // https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html
                    // Proszę zamienić metodę add() na prawidłową metodę:
                    codedWord.append(Integer.toString(numbers[j])+" ");
                    break;
                }
            }
        }
        return codedWord.toString();
    }

    @Override
    public String decode(String code) {
        StringBuilder uncodedWord = new StringBuilder("uncoded word: ");
        String[] separateNumbers = code.split(" ");
        int[] codedNumbers = new int[separateNumbers.length];
        for (int i=0;i<separateNumbers.length;i++){
            codedNumbers[i] = Integer.parseInt(separateNumbers[i]);
        }

        for(int i=0;i<codedNumbers.length;i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (codedNumbers[i] == numbers[j]) {
                    // Jaka metoda dodaje "some text" do zawartości obiektu <StringBuilder>?
                    // https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html
                    // Proszę zamienić metodę add() na prawidłową metodę:
                    uncodedWord.append(letters[j]);
                    break;
                }
            }
        }
        return uncodedWord.toString().toLowerCase();
    }
}

