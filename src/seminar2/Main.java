package seminar2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        Human human = new Human("Вася");
        market.acceptToMarket(human);
        market.update();

        Human human1 = new Human("Петя");
        market.acceptToMarket(human1);

        Human human2 = new Human("Федя");
        market.acceptToMarket(human2);

        Human human3 = new Human("Маша");
        market.acceptToMarket(human3);
        market.update();


    }
}
