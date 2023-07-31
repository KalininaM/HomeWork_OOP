package HomeWork2;
//Реализовать класс Market и все методы, которые он обязан реализовывать.
//Методы из интерфейса QueueBehaviour, имитируют работу очереди,
//MarketBehaviour – помещает и удаляет человека из очереди,
//метод update – обновляет состояние магазина (принимает и отдаёт заказы)
public class Main {
    public static void main(String[] args) {

        People people = new People();
        people.newName();
        People people2 = new People();
        people2.newName();
        Market market = new Market();

        market.acceptToMarket(people);
        market.takeInQueue(people);
        market.acceptToMarket(people2);
        market.giveOrder();
        market.takeInQueue(people2);
        market.takeOrder();
        market.releaseFromQueue();
        market.giveOrder();
        market.takeOrder();
        market.releaseFromMarket(people);
        market.releaseFromQueue();
        market.releaseFromMarket(people2);
    }
}
