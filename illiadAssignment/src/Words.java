public class Words {
    private String word;

    public Words(String word) {
        this.word = word.toLowerCase();
        if (this.word.contains(",")){
            this.word = word.replace(",", "");
        }
        else if (this.word.contains(".")){
            this.word = word.replace(".", "");
        }
        else if (this.word.contains("?")){
            this.word = word.replace("?", "");
        }
        else if (this.word.contains("!")){
            this.word = word.replace("!", "");
        }
        else if (this.word.contains(":")){
            this.word = word.replace(":", "");
        }
        else if (this.word.contains("\"")){
            this.word = word.replace("\"", "");
        }
        else if (this.word.contains("(")){
            this.word = word.replace("(", "");
        }
        else if (this.word.contains(")")){
            this.word = word.replace(")", "");
        }
    }

    public String getWord() {
        return word;
    }
}
