public class Library {
    /*
    private attribute title (String) — set once at creation, never changes for the life of the object → what keyword fits that, besides private?
    private attribute isBorrowed (boolean) — starts false.
    static attribute totalBooksRegistered (int) — shared count across every Library object ever created.
    Constructor Library(String title) — sets the title, increments the static counter.
    public method borrow() — sets isBorrowed to true.
    public method returnBook() — sets isBorrowed to false.
    public method getTitle() — returns the title.
    public static method getTotalBooksRegistered() — returns the shared count.
    A public final method libraryRules() — prints a fixed message like "No loud talking. Return books on time." — meant to never be overridden by any subclass.
    */

    private String title;
    private boolean isBorrowed = false;
    public static int totalBooksRegistered = 0;

    public Library(String title)
    {
        this.title = title;
    }

    public void borrow()
    {
        isBorrowed = true;
    }

    public void returnBook()
    {
        isBorrowed = false;
    }

    public String getTitle()
    {
        return title;
    }

    public static int getTotalBooksRegistered()
    {
        return totalBooksRegistered;
    }

    public final void libraryRules()
    {
        System.out.println("No loud talking. Return books on time.");
    }
}