package Interfaces;

import Classes.Actor;

public interface iActorBehavior {
    /**
     * Метод, создающий order(Заказ)
     * @param makeOrder boolean устанавливает True/False на заказ
     */
    void setMakeOrder(boolean makeOrder);

    /**
     * Метод, позволяющий установить order(Заказ)
     * @param pickUpOrder boolean устанавливает True/False на заказ
     */
    void setTakeOrder(boolean pickUpOrder);

    /**
     * Метод, проверяющий состояний, сделан ли order(Заказ)
     * @return boolean возвращает состояние
     */
    boolean isMakeOrder();

    /**
     * Метод, проверяющий состояний, установлен ли order(Заказ)
     * @return boolean возвращает состояние
     */
    boolean isTakeOrder();

    /**
     * Метод, возвращающий ссылку на сам же класс actor(Человек)
     * @return Actor Абстрактный класс, представляющий собой скелет покупателя
     */
    Actor getActor();
}
