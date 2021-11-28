public class Main {
    public static void main(String[] args){

    Animal cat = new Animal(new SimpleVoice());
    System.out.println(cat.voice("Мяв!"));

    Animal fish = new Animal(new MuteVoice());
    System.out.println(fish.voice("..."));

    Animal bird = new Animal(new BeautifulVoice());
    System.out.println(bird.voice("Чирик-чирик!"));
    }
}
