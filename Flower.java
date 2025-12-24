public record Flower(String color, FlowerType type) implements PickUp {

    @java.lang.Override
    public void pickBy(Character character) {
        System.out.printf("%s поднимает %s %s цвета.\n", character.name, type.getName(), color);
    }

    @Override
    public String toString() {
        return String.format("%s %s", type.getName(), color);
    }

    @Override
    public int hashCode() {
        return color.hashCode() + type.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null || getClass() != other.getClass() || this.hashCode() != other.hashCode()) {
            return false;
        }

        Flower obj = (Flower) other;
        return color.equals(obj.color) && this.type == obj.type;
    }
}
