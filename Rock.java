public record Rock(int size) implements PickUp {
    @Override
    public void pickBy(Character character) {
        System.out.printf("%s Поднимает камень.\n", character.name);
    }

    @Override
    public String toString() {
        if (size > 20)
            return "огромный камень";
        if (size > 10)
            return "большой камень";
        if (size > 5)
            return "камень";
        return "маленький камень";
    }

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
        Rock obj = (Rock) other;
        return size == obj.size;
    }
}
