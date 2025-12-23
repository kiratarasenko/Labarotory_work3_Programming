public record Rock(int size) implements PickUp {
    @java.lang.Override
    public void pickBy(Character character) {
        System.out.printf("%s Поднимает камень.\n" , character.name );
    }

    @Override
    public String toString() {
        if (size > 20)
            return "огромный камень ";
        if (size > 10)
            return "большой камень ";
        if (size > 5)
            return "камень";
        return "маленький камень ";
    }
}
