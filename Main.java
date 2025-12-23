import java.util.ArrayList;

public class Main {
    static double MIN_AGE = 0;
    static double MAX_AGE = 1000;

    public static void main(String[] args) {
        Goose goose = new Goose();
        Gnome gnome = new Gnome();
        Lake lake = new Lake((int) (Math.random() * 10), true);
        Tree tree = new Tree("Каштановое", (int) (Math.random() * (MAX_AGE - MIN_AGE) + MIN_AGE));
        Grass grass = new Grass((int) (Math.random() * 10));
        ArrayList<PickUp> objects = new ArrayList<>();

        String colors[] = {
                "красный", "белый", "желтый", "голубой"
        };
        FlowerType flowers[] = {
                FlowerType.ROSE, FlowerType.DAISY, FlowerType.TULIP
        };
        for (int i = (int) (Math.random() * 10); i > 0; i--)
            objects.add(new Flower(colors[(int) (Math.random() * colors.length)], flowers[(int) (Math.random() * flowers.length)]));
        for (int i = (int) (Math.random() * 10); i > 0; i--)
            objects.add(new Rock((int) (Math.random() * 10)));
       //objects.removeAll(objects);//
        System.out.println(tree);
        gnome.lookAt(lake);

        goose.say("Посмотри, вон там, за озером, растет еще одно большое старое дерево. Пойдем поищем: быть может, там-то и расцветет мое счастье!");
        goose.fly();
        gnome.run(5);
        tree.castingShadow();
        goose.stop();
        goose.setEmotion(Emotion.ENJOY);
        goose.getHeadLower();
        if (grass.height > 50)
            throw new GrassTooBig();
        try {
            goose.pick(objects.remove((int) ((Math.random()) * objects.size())));
            goose.give(gnome);
            gnome.setEmotion(Emotion.ENJOY);
            gnome.say("Вообще слов не осталось после такого подарка");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Гусыни нечего отдавать карлику!");
        }


    }
}