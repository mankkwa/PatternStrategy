public class SimpleVoice implements VoiceStrategy {
    @Override
    public String voice(String sound) {
        System.out.println("Это животное издает звук:");
        return sound;
    }
}
