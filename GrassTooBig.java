public class GrassTooBig extends RuntimeException {
    @Override
    public String getMessage() {
        return "Трава слишком высокая!";
    }
}
