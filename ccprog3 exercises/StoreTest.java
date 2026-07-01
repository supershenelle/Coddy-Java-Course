public class StoreTest {

    public static void main(String[] args)
    {
        Store alingNena = new Store("Aling Nena");
        Store mangKanor = new Store("Mang Kanor");
        Store titaBaby = new Store("Tita Baby");

        alingNena.restock(50);
        mangKanor.restock(30);
        titaBaby.restock(80);

        System.out.println("Aling Nena Stock: " + alingNena.getStock());
        System.out.println("Mang Kanor Stock: " + mangKanor.getStock());
        System.out.println("Tita Baby Stock: " + titaBaby.getStock());

        alingNena.compareStock(mangKanor);
        alingNena.compareStock(titaBaby);
        mangKanor.compareStock(titaBaby);

        System.out.println("Total stores: " + Store.getTotalStoresOpened());
        
        mangKanor.sell(10);
        System.out.println("Total stores: " + Store.getTotalStoresOpened());
    }
}