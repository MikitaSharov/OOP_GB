package seminar2;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehavior, QueueBehavior {
    List<Actor> actorsList = new ArrayList<>();

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " заходит в магазин");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actorsLeftQueue) {
        for (Actor actor: actorsLeftQueue) {
            actorsList.remove(actor);
            System.out.println(actor.getName() + " выходит из магазина");
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " становится в очередь");
        actorsList.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor: actorsList) {
            if (!actor.isMakeOrder) {
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " делает заказ");
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor: actorsList) {
            if (!actor.isTakeOrder && actor.isMakeOrder) {
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " получает заказ");
            }
        }
    }
    

    @Override
    public void releaseFromQueue() {
        List<Actor> actorsLeftQueue = new ArrayList<>();
        for (Actor actor: actorsList) {
            if (actor.isTakeOrder) {
                actorsLeftQueue.add(actor);
                System.out.println(actor.getName() + " покидает очередь");
            }
        }
        releaseFromMarket(actorsLeftQueue);
    }
}
