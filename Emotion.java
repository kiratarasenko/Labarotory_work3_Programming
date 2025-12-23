public enum Emotion {
    ENJOY("радость"),
    AMAZED("изумление"),
    SCARE("страх"),
    NORMAL("спокойствие");
    private String emotion;

    Emotion(String emotion) {
        this.emotion = emotion;
    }

    public String getEmotion() {
        return emotion;
    }
}


