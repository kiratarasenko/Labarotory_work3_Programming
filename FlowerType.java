public enum FlowerType {
    ROSE("роза"),
    DAISY("ромашка"),
    TULIP("тюльпан");

    private String name;

    FlowerType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}