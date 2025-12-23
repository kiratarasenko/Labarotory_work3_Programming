public class Goose extends Character {
    Goose() {
        super("Гусыня", Emotion.NORMAL);
    }


    @Override
    public void say(String message) {
        String[] parts = message.split(" ");
        StringBuilder resultString = new StringBuilder();
        for (var word : parts) {
            if (Math.random() > 0.5) {
                resultString.append("кря ");
            } else {
                resultString.append(word);
                resultString.append(" ");
            }
        }
        System.out.print(resultString);
    }


    public void fly() {
        System.out.println(name + " вспорхнула и полетела.");

    }

    public void getHeadLower() {
        System.out.println("Гусыня опустила голову.");

    }

    public void pick(PickUp obj) {
        obj.pickBy(this);
        currentObject = obj;
    }

    @Override
    public void setEmotion(Emotion emotion) {
        super.setEmotion(emotion);

        if (emotion == Emotion.ENJOY) {
            System.out.println("От радости захлопала крыльями.");
        }
    }

    public void give(Character whom) {
        System.out.printf("%s передает %s.%s получает %s.\n", name, currentObject.toString(), whom.name, currentObject);

        whom.currentObject = currentObject;
        currentObject = null;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
