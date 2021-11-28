public class Animal {

    private VoiceStrategy voiceStrategy;

    public Animal(VoiceStrategy voiceStrategy){
        this.voiceStrategy = voiceStrategy;
    }

    public void sleep(){
        System.out.println("Эта животинка шпит");
    }

    public void eat(){
        System.out.println("Эта животинка кушоет");
    }

    public String voice(String sound){
        return voiceStrategy.voice(sound);
    }

}
