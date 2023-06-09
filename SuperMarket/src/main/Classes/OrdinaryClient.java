package Classes;

public class OrdinaryClient extends Actor {

    /**
     * Конструктор
     * @param name Имя Человека
     */
    public OrdinaryClient(String name) {
        super(name);
    }

    /**
     * Геттер на имя
     * @return получить имя
     */
    @Override
    public String getName() {
        return super.name;
    }

    /**
     * Установить значение создание order(заказ)
     * @param makeOrder boolean устанавливает True/False на заказ
     */
    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    /**
     * Установить значение на получение order(заказ)
     * @param pickUpOrder boolean устанавливает True/False на заказ
     */
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;

    }

    /**
     * Getter вернуть значение состояния создания order(заказа)
     * @return boolean устанавливает True/False на состояния order(заказа)
     */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * Getter вернуть значение состояния получения order(заказа)
     * @return boolean устанавливает True/False на получение order(заказа)
     */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * Мост?
     * @return вернуть ссылку на самого себя
     */
    @Override
    public Actor getActor() {
        return this;
    }

    /**
     * Setter
     * @param canReturn boolean устанавливает True/False на отмену заказа
     */
    @Override
    public void setReturnable(boolean canReturn) {
        super.isReturnOrder = canReturn;
    }

    /**
     * Getter
     * @return возвращает состояние, можно ли отменить заказ
     */
    @Override
    public boolean isReturn() {
        return super.isReturnOrder;
    }
}
