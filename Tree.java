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
}
