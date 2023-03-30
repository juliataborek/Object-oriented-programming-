public interface Translator {
    // normal word --> coded word
    public String code(String word);

    // coded word --> normal word
    public String decode(String code);
}