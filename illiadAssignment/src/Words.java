public class Words {
    private String word;

    public Words(String word) {
        this.word = word.replaceAll("[.,?:\";'()!-]", "").toLowerCase();
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return getWord();
    }

    @Override
    public int hashCode() {
        return word.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Words){
            Words other = (Words)obj;
            if (word.equals((other.word))) return true;
        }
        return false;
    }
}
