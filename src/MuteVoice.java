public class MuteVoice implements VoiceStrategy{
    @Override
    public String voice(String sound){
        System.out.println("Это животное звук не издает:");
        return sound;
    }
}
