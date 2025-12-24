public class Gnome extends Character {
    Gnome() {
        super("Карлик", Emotion.NORMAL);
    }

    public void say(String message) {
        switch (emotion) {
            case NORMAL:
                System.out.println(message);
                break;
            case AMAZED:
                System.out.print(message);
                System.out.println(" Вау!");
                break;
            case ENJOY:
                System.out.println(message);
                System.out.println(" Хей!");
                break;
            case SCARE:
                System.out.println(message);
                System.out.println(" АААААААААААААААА!");
                break;
        }

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
