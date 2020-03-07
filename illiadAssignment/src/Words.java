public class Words {
    private String word;

    public Words(String word) {
        this.word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == '.' || word.charAt(i) == ',' || word.charAt(i) == '?' || word.charAt(i) == ':' || word.charAt(i) == '\"' || word.charAt(i) == '-' || word.charAt(i) == ';' || word.charAt(i) == '\'' || word.charAt(i) == '(' || word.charAt(i) == ')' || word.charAt(i) == '!') {
                this.word = word.replaceAll("[.,?:\"-;'()!]", "").toLowerCase();
                break;
            }
        }
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return getWord();
    }
}
