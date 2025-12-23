public record Acorn(String color) implements PickUp {
    @Override
    public void pickBy(Character character) {
        System.out.printf("%s поднимает каштан.\n" , character.name );
    }
    @Override
    public String toString() {
        return "каштан";
    }
}
