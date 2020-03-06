public class Words {
    private String word;

    public Words(String word) {
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == '.' || word.charAt(i) == ',' || word.charAt(i) == '?' || word.charAt(i) == ':'){
                this.word = word.replaceAll("[.,?:]+", "").toLowerCase();
            }
            this.word = word.toLowerCase();
        }
    }

    public String getWord() {
        return word;
    }
}
