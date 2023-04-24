package Interfaces;

import Classes.Actor;

import java.util.List;

public interface iMarketBehaviour {
    /**
     * Добавить actor(Человека) в магазин
     * @param actor Actor Абстрактный класс, представляющий собой скелет покупателя
     */
    void acceptToMarket(iActorBehavior actor);

    /**
     * Метод, который освобождает (удаляет) человека
     * @param actors List/<Actor/> Список покупателей
     */
    void releaseFromMarket(List<Actor> actors);

    void acceptReturn(Actor actor);

    /**
     * Метод обновления состояния магазина
     */
    void update();
}
