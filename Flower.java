public record Flower(String color, FlowerType type) implements PickUp {

    @java.lang.Override
    public void pickBy(Character character) {
        System.out.printf("%s поднимает %s %s цвета.\n" , character.name, type.getName(), color);
    }

    @Override
    public String toString() {
        return String.format("%s %s", type.getName(), color);
    }
}
