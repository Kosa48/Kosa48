public class akceptacjazam implements obslugazam {
    private obslugazam next;

    @Override
    public void setNext(obslugazam next) {
        this.next = next;
    }

    @Override
    public void handle(zamowienie zamowienie) {
        System.out.println("Zamówienie przyjęte: " + zamowienie.getDescription());
        if (next != null) next.handle(zamowienie);
    }
}
