public abstract class Character {
    protected String name;
    protected Emotion emotion;
    public PickUp currentObject;

    public Character(String name, Emotion emotion) {
        this.name = name;
        this.emotion = emotion;
    }

    public abstract void say(String message);

    public String getName() {
        return name;
    }


    public void run(int speed) {
        System.out.println(getName() + " бежит со скоростью:" + speed + " км/ч");
    }

    public void setEmotion(Emotion emotion) {
        this.emotion = emotion;
        System.out.println(getName() + " проявляет эмоцию:" + emotion.getEmotion());
    }

    public void lookAt(Lake lake) {
        System.out.printf("%s посмотрел на озеро", name);
        if (lake.isBeauty()) {
            System.out.println(" и удивиился его красоте.");
            this.setEmotion(Emotion.AMAZED);

        }
        if (lake.depth() > 5) {
            System.out.println("испугался его глубины.");
            this.setEmotion(Emotion.SCARE);
        }

    }

    public void stop() {
        System.out.println(name + " остановилась.");
    }

    @Override
    public String toString() {
        return String.format("%s ", name);
    }


    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null || getClass() != other.getClass() || this.hashCode() != other.hashCode()) {
            return false;
        }

        Character obj = (Character) other;
        return name.equals(obj.name) && this.emotion == obj.emotion;
    }
}
