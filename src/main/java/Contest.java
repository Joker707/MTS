import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Contest {

    public static void main(String[] args) {
        Mary mary = Mary.getInstance();
        Castle castle = Castle.getInstance();
        castle.setHowItLooksLike("magic");
        mary.lookIntently(castle);
        Tower brokenTower = castle.brokenTower();
        brokenTower.setRoof(null);
        mary.noticeSomethingAt(brokenTower);
        List<Builder> builders = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            builders.add(new Builder());
        }
        Platform platform = new Platform("Cinnamon sticks");
        platform.carrySomeone(builders);
        for (Builder builder : builders) {
            builder.build();
        }
        Nutcracker nutcracker = Nutcracker.getInstance();
        nutcracker.answerWithoutQuestionTo(mary);

        // let's go back to the past
        brokenTower.setRoof(new Roof());

        castle.isInDanger();
        Lizogub lizogub = Lizogub.getInstance();
        lizogub.walkingAround();
        lizogub.setTarget(brokenTower.getRoof());
        lizogub.biteSomething(lizogub.getTarget());
        lizogub.setTarget(brokenTower.getRoof().getDome());
        Population population = new Population(new Citizen[10]);
        List<String> listOfDonations = new ArrayList<>();
        listOfDonations.add(population.donateSomething(1));
        listOfDonations.add(population.donateSomething(2));
        lizogub.setMood("GREAT");
        lizogub.haveABreakfast(listOfDonations);
        lizogub.walkingAround();



        Music music = new Music();
        music.addType("silent");
        music.addType("gentle");
        music.soundsEverywhere();
        castle.openTheGates();
        List<Page> pages = new ArrayList<>(12);
        for (int i = 0; i < 12; i++) {
            pages.add(new Page());
        }
        for (Page page : pages) {
            page.moveTowards(mary);
            page.setCarrying("Carnation torch");
            page.setHead("Pearl");
            page.setBody("Ruby and Emerald");
            page.setLegs("Pure gold");
        }





    }
}


class Mary {

    private static final Mary instance = new Mary();

    private Mary() {

    }

    public static Mary getInstance() {
        return instance;
    }


    Object lookingAt;



    void lookIntently(Object o) {
        lookingAt = o;
        System.out.println("Intently looking at " + o.getClass().getName());
    }

    void noticeSomethingAt(Object o) {
        lookingAt = o;

    }

}


class Castle {

    boolean areTheGatesOpen = false;
    String howItLooksLike;
    Tower[] mainTowers;

    private final static Castle instance = new Castle();


    private Castle() {
        mainTowers = new Tower[10];
        for (int i = 0; i < 10; i++) {
            mainTowers[i] = new Tower();
        }
    }

    public static Castle getInstance() {
        return instance;
    }


    Tower brokenTower() {
        Random random = new Random();
        return mainTowers[random.nextInt(mainTowers.length)];
    }

    void isInDanger() {
        System.out.println("Oops, not enough");
        isDoomed();
    }

    void isDoomed() {

    }

    void openTheGates() {
        areTheGatesOpen = true;
    }

    public void setHowItLooksLike(String howItLooksLike) {
        this.howItLooksLike = howItLooksLike;
    }
}


class Tower {

    private Roof roof;

    public Tower() {
        this.roof = new Roof();
    }


    public Roof getRoof() {
        return roof;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }
}

class Roof {

    Dome dome;

    public Roof() {
        this.dome = new Dome();
    }

    public Dome getDome() {
        return dome;
    }
}


class Dome {

}


class Nutcracker {

    private static final Nutcracker instance = new Nutcracker();

    private Nutcracker() {

    }

    public static Nutcracker getInstance() {
        return instance;
    }

    void answerWithoutQuestionTo(Object o) {
        System.out.println(o.getClass().getName() + " is listening");
    }

}


class Builder extends Citizen {


    void build() {
    }
}



class Platform {

    String material;
    Object freight;

    public Platform(String material) {
        this.material = material;
    }

    void carrySomeone(Object o) {
        freight = o;
    }
}


class Lizogub {

    private static final Lizogub instance = new Lizogub();


    private Lizogub() {

    }

    public static Lizogub getInstance() {
        return instance;
    }

    private Object target;

    String mood;

    void walkingAround() {

    }


    void biteSomething(Object o) {
        System.out.println("Look, I ate " + o.getClass().getName());
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    void haveABreakfast(List<String> donations) {
        System.out.println("Wow, Thanks a lot for " + donations.size() + " donations!");
    }

    public void setMood(String mood) {
        this.mood = mood;
    }
}

class Citizen {

}

class Population {


    Citizen[] citizens;
    String[] ourThings = {"Castle", "Whole quarter", "Part of the Candy Grove"};

    String donateSomething(int index) {
        return ourThings[index];
    }

    public Population(Citizen[] citizens) {
        this.citizens = citizens;
    }
}


class Music {

    List<String> musicTypes = new ArrayList<>(2);

    void addType(String type) {
        musicTypes.add(type);
    }

    void soundsEverywhere() {

    }
}

class Page {

    String carrying;
    String head;
    String body;
    String legs;

    void moveTowards(Object o) {
        System.out.println("Nice to meet you " + o.getClass().getName());
    }

    public void setCarrying(String carrying) {
        this.carrying = carrying;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }
}
