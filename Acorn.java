public record Acorn(String color) implements PickUp {
    @Override
    public void pickBy(Character character) {
        System.out.printf("%s поднимает каштан.\n", character.name);
    }

    @Override
    public String toString() {
        return "каштан";
    }

    @Override
    public int hashCode() {
        return (color.hashCode() * 2);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null || getClass() != other.getClass() || this.hashCode() != other.hashCode()) {
            return false;
        }

        Acorn obj = (Acorn) other;

        return color.equals(obj.color);
    }
}
