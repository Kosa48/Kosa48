public class przygotowaniezam implements obslugazam {
    private obslugazam next;

    @Override
    public void setNext(obslugazam next) {
        this.next = next;
    }

    @Override
    public void handle(zamowienie zamowienie) {
        System.out.println("Zamówienie przygotowane: " + zamowienie.getDescription());
        if (next != null) next.handle(zamowienie);
    }
}
