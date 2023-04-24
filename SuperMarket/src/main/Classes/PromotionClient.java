package Classes;

public class PromotionClient extends Actor {

    /**
     * Имя скидки
     */
    private final String namePromotion;

    /**
     * Размер скидки
     */
    public static int promotion;

    /**
     * Конструктор
     * @param name Имя человека
     * @param namePromotion Название скидки
     * @param promotion Скидка
     */
    public PromotionClient(String name, String namePromotion, int promotion) {
        super(name);
        this.namePromotion = namePromotion;
        this.promotion = promotion;
    }

    /**
     * Getter
     * @return вернуть имя скидки
     */
    public String getNamePromotion() {
        return namePromotion;
    }

    /**
     * Геттер на скидку
     * @return получить скидку
     */
    public int getPromotion() {
        return promotion;
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
        return isReturnOrder;
    }
}
