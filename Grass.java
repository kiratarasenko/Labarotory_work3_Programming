public class Grass extends Decoration {
    Grass(int height) {
        this.height = height;
    }

    int height;

    @Override
    public String toString() {
        return String.format("Трава высотой %s сантиметров!", height);
    }

    @Override
    public int hashCode() {
        return (Integer.hashCode(size) + Integer.hashCode(height));
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null || getClass() != other.getClass() || this.hashCode() != other.hashCode()) {
            return false;
        }
        Grass obj = (Grass) other;
        return height == obj.height;
    }
}
