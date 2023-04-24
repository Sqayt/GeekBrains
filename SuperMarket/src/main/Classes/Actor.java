package Classes;

import Interfaces.iActorBehavior;
import Interfaces.iReturnBehavior;

public abstract class Actor implements iActorBehavior, iReturnBehavior {
    /**
     * Имя человека
     */
    protected String name;

    /**
     * Состояние, взят ли заказ
     */
    protected boolean isTakeOrder;

    /**
     * Состояние, сделан ли заказ
     */
    protected boolean isMakeOrder;

    /**
     * Состояние, можно ли товар вернуть
     */
    protected boolean isReturnOrder;

    /**
     * Конструктор инициализирующий имя человека
     * @param name Имя человека
     */
    public Actor(String name) {
        this.name = name;
    }

    /**
     * Абстрактный метод, возвращающий имя человека
     * @return Имя Человека
     */
    public abstract String getName();
}
