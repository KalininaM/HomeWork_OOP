package HW7.observer;

public interface Observer {

    /**
     * Получение вакансии соискателем
     * @param vacancy
     */
    void receiveOffer(Vacancy vacancy);

}
