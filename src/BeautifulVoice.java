public class BeautifulVoice implements VoiceStrategy{
    @Override
    public String voice(String sound){
        System.out.println("Это животное издает прекрасный звук:");
        return sound;
    }
}