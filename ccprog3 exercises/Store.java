public class Store {
    public static int totalStoresOpened;
    private String storeName;
    private int stock = 0;

    public Store(String name)
    {
        storeName = name;
        totaltotalStoresOpened++;
    }

    public void restock(int amount)
    {
        stock += amount;
    }

    public void sell(int amount)
    {
        stock -= amount;
    }

    public int getStock()
    {
        return stock;
    }

    public static int getTotalStoresOpened()
    {
        return totalStoresOpened;
    }

    final void announce()
    {
        System.out.println(storeName + " is open for business!");
    }

    public void compareStock(Store other)
    {
        if (other.stock > stock)
            System.out.println(other.storeName + " has more stock.");

        else
            System.out.println(storeName + " has more stock.");
    }
}
