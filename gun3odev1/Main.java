package gun3odev1;

public class Main {
    public static void main(String[] args) {
        BaseKrediManager ogretmenKrediManager = new AskerKrediManager();
        KrediUI krediUI = new KrediUI();

        krediUI.krediHesapla(ogretmenKrediManager);
    }

}
