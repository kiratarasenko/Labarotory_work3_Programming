public class Tree extends Decoration {
    Tree(String color, double age) {
        this.color = color;
        this.age = age;
        if (age < 100) {
            throw new LowTreeAge();
        }
    }

    String color;
    double age;

    public void castingShadow() {

        System.out.println("дерево отбрасывает большую тень");
    }

    @Override
    public String toString() {
        return String.format("%s дерево, возрастом %s лет", color, age);
    }

    @Override
    public int hashCode() {
        return (Double.hashCode(age) + color.hashCode());
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null || getClass() != other.getClass() || this.hashCode() != other.hashCode()) {
            return false;
        }
        Tree obj = (Tree) other;
        return size == obj.size && color.equals(obj.color) && age == obj.age;
    }
}
