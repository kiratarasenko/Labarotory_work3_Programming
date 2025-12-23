public class Grass extends Decoration {
    Grass(int height) {
        this.height = height;
    }

    int height;

    @Override
    public String toString() {
        return String.format("Трава высотой %s сантиметров!", height);
    }
}
