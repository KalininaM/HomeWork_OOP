package HomeWork5.views;

import HomeWork5.models.Table;
import HomeWork5.presenters.View;
import HomeWork5.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {
    private ViewObserver observer;



    public void showTables(Collection<Table> tables){
        for (Table table: tables) {
            System.out.println(table);
        }
    }

    public void showReservationTableResult(int reservationId){
        System.out.printf("Столик успешно забронирован. Номер вашей брони: #%d\n", reservationId);
    }

    @Override
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    public void reservationTable(Date reservationDate, int tableNo, String name){
        observer.onReservationTable(reservationDate, tableNo, name);
    }

    /**
     * TODO: Необходимо разработать самостоятельно в рамках домашней работы.
     * Удаление старого резерва столика. Бронирование столика на новое время.
     * @param oldReservationId
     * @param reservationDate
     * @param tableNo
     * @param name
     */
    public void changeReservationTable(int oldReservationId, Date reservationDate, int tableNo, String name){
        //TODO: Необходимо обратиться к наблюдателю ...
        observer.changeReservationTable(oldReservationId, reservationDate, tableNo, name);
    }

    public void showChangeReservationTableResult(int oldReservationId, int newReservationId) {
        System.out.printf("Резерв #%d отменен \n", oldReservationId);
        showReservationTableResult(newReservationId);
    }


}
