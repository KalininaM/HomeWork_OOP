package HomeWork6.srp2;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {
        Order order = new Order();
        InputOrder inputData = new InputOrder(order);
        inputData.inputFromConsole();
        SaveOrder saveData = new SaveOrder(order);
        saveData.saveToJson();
    }
}
