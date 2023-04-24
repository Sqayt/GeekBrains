package Classes;

import Interfaces.iActorBehavior;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;

import java.util.ArrayList;
import java.util.List;

public class Market implements iMarketBehaviour, iQueueBehaviour {

    /**
     * Объявление стека
     */
    private List<iActorBehavior> queue;

    /**
     * Конструктор, инициализирующий стек
     */
    public Market() {
        this.queue = new ArrayList<>();
    }

    /**
     * Основной метод для добавления в стек
     * @param actor Actor Абстрактный класс, представляющий собой скелет покупателя
     */
    @Override
    public void acceptToMarket(iActorBehavior actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин");
        takeInQueue(actor);
    }

    /**
     * Добавить в стек
     * @param actor Actor Абстрактный класс, представляющий собой скелет покупателя
     */
    @Override
    public void takeInQueue(iActorBehavior actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь");
    }

    /**
     * Удалить из stack клиента
     * @param actors List/<Actor/> Список покупателей
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        actors.forEach(
                actor -> {
                    System.out.println(actor.getName() + " клиент ушел из магазина");
                    this.queue.remove(actor);
                }
        );
    }

    @Override
    public void acceptReturn(Actor actor) {
        actor.setReturnable(true);
    }

    /**
     * Обновить состояние
     */
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    /**
     * Добавить в очередь
     */
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        queue.forEach(
                actor -> {
                    if (actor.isTakeOrder()) {
                        releaseActors.add(actor.getActor());
                        System.out.println(actor.getActor().getName() + " клиент ушел из очереди");
                    }
                }
        );

        releaseFromMarket(releaseActors);
    }

    /**
     * Установить значения на делание заказа true
     */
    @Override
    public void takeOrder() {
        queue.forEach(
                actor -> {
                    if (!actor.isMakeOrder()) {
                        actor.setMakeOrder(true);
                        System.out.println(actor.getActor().getName() + " клиент сделал заказ");
                    }
                }
        );

    }

    /**
     * Установить значения на заказ true
     */
    @Override
    public void giveOrder() {
        queue.forEach(
                actor -> {
                    if (actor.isMakeOrder()) {
                        actor.setTakeOrder(true);
                        System.out.println(actor.getActor().getName() + " клиент получил заказ");
                    }
                }
        );
    }
}
