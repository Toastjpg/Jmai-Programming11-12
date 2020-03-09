public class Words {
    private String word;

    public Words(String word) {
        this.word = word.replaceAll("[.,?:\"-;'()!]", "").toLowerCase();
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return getWord();
    }
}
