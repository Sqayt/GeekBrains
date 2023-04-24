package Interfaces;

public interface iQueueBehaviour {
    /**
     * Метод, который добавляет actor(покупателя) в очередь
     * @param actor Actor Абстрактный класс, представляющий собой скелет покупателя
     */
    void takeInQueue(iActorBehavior actor);

    /**
     * Освобождает очередь
     */
    void releaseFromQueue();

    /**
     * Взять order(Заказ)
     */
    void takeOrder();

    /**
     * Получить order(Заказ)
     */
    void giveOrder();
}
