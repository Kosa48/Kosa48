public class dostarczenie implements obslugazam {
    private obslugazam next;

    @Override
    public void setNext(obslugazam next) {
        this.next = next;
    }

    @Override
    public void handle(zamowienie zamowienie) {
        System.out.println("Zamówienie dostarczone: " + zamowienie.getDescription());
        if (next != null) next.handle(zamowienie);
    }
}
