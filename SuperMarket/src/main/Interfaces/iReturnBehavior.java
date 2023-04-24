package Interfaces;


public interface iReturnBehavior {
    /**
     * Метод, который устанавливает возможность отмены товара
     * @param canReturn boolean устанавливает True/False на отмену заказа
     */
    void setReturnable(boolean canReturn);

    /**
     * Метод, возвращает возможность отмены товара
     * @return boolean возвращает состояние возможности отмены товара
     */
    boolean isReturn();
}
