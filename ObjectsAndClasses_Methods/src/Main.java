public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.add("Eggs",86);
        basket.add("Beer", 150);
        basket.add("icecream", 70);
        basket.print("Корзина 1");

        System.out.println();

        Basket basket1 = new Basket();
        basket1.add("Coffee", 150);
        basket1.add("Tea", 100);
        basket1.add("Sugar", 50);
        basket1.print("Корзина 2");
        System.out.println();
        System.out.println("Всего товаров в корзинах: " + Basket.getTotalBasketItems() + " шт.");
        System.out.println();
        System.out.println("Общая стоимость товаров во всех корзинах: " + Basket.getTotalBasketPrice() + " руб.");
        System.out.println();
        System.out.println("Средняя цена товара во всех корзинах: " + Basket.getAverageCost() + " руб.");
        System.out.println();
        System.out.println("Средняя стоимость корзины: " + Basket.getAverageBasketCost() + " руб.");
    }
}
