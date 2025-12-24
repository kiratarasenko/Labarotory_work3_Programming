public class Decoration {
    int size;

    @Override
    public int hashCode() {
        return (Integer.hashCode(size) * 2);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null || getClass() != other.getClass() || this.hashCode() != other.hashCode()) {
            return false;
        }
        Decoration obj = (Decoration) other;
        return size == obj.size;
    }
}
