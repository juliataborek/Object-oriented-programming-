//ex. 8
public class Editor {
    public static String smallLetters(String word){
        return word.toLowerCase();
    }
    public static String capitalLetters(String word){
        return word.toUpperCase();
    }
    public static String mergeWords(String word1, String word2){
        StringBuilder sb = new StringBuilder();
        sb.append(word1);
        sb.append(word2);
        return sb.toString();
    }
}