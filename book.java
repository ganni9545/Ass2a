public class book extends publication {
    private String author;

    public book() {
        super();
        this.author = null;
    }

    public book(String title, double price, int copice, String author) {
        super(title, price, copice);
        this.author = author;
    }

    public void ordercopies(int pcopies) {
        setcopies(getcopies() + pcopies);
    }

    public void sellcopy(int qty) {
        System.out.println("Total no of Book sell:Rs" + (qty * price));
    }
}
