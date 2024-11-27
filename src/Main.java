import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Prodotti p1 = new Prodotti("libro1", "book", 150, 1);

        Prodotti p2 = new Prodotti("libro2", "book", 30, 2);

        Prodotti p3 = new Prodotti("libro3", "book", 300, 3);

        Prodotti p4 = new Prodotti("gioco", "baby", 50,4);

        Prodotti p5 = new Prodotti("ps5", "boys",500,5);

        List<Prodotti> prodotti = new ArrayList<>();
        prodotti.add(p1);
        prodotti.add(p2);
        prodotti.add(p3);
        prodotti.add(p4);
        prodotti.add(p5);


        List<Prodotti> libri = prodotti.stream()
                .filter(pr-> pr.getCategoria().equals("book") && pr.getPrezzo()>100)
                .toList();

        List<Prodotti> baby = prodotti.stream()
                        .filter(pr-> pr.getCategoria().equals("baby"))
                        .toList();

        List<Prodotti> boys = prodotti.stream()
                .filter(pr -> pr.getCategoria().equals("boys")) // Filtra i prodotti per categoria
                .peek(pr -> pr.setPrezzo(pr.getPrezzo() * 0.9)) // Applica il 10% di sconto sul prezzo
                .toList();


        //boys.forEach(System.out::println);

        // Creazione dei clienti
        Clienti c1 = new Clienti("Andrea", 2, 1);
        Clienti c2 = new Clienti("Luca", 2, 2);
        Clienti c3 = new Clienti("Michele", 2, 3);

        // Creazione degli ordini
        Ordini ordine1 = new Ordini(c2); // Cliente tier 2
        ordine1.setOrderDate(LocalDate.of(2021, Month.FEBRUARY, 15)); // Dentro il range
        ordine1.setProducts(List.of(p1, p2)); // Prodotti inclusi

        Ordini ordine2 = new Ordini(c1); // Cliente tier 1
        ordine2.setOrderDate(LocalDate.of(2021, Month.MARCH, 10)); // Dentro il range
        ordine2.setProducts(List.of(p3));

        Ordini ordine3 = new Ordini(c3); // Cliente tier 2
        ordine3.setOrderDate(LocalDate.of(2021, Month.JANUARY, 25)); // Fuori dal range
        ordine3.setProducts(List.of(p4, p5));

        // Lista di ordini
        List<Ordini> ordini = new ArrayList<>();
        ordini.add(ordine1);
        ordini.add(ordine2);
        ordini.add(ordine3);

        // Filtro degli ordini richiesti (tier 2, data tra 01-Feb-2021 e 01-Apr-2021)
        LocalDate startDate = LocalDate.of(2021, Month.FEBRUARY, 1);
        LocalDate endDate = LocalDate.of(2021, Month.APRIL, 1);

        List<Ordini> ordiniFiltrati = ordini.stream()
                .filter(o -> o.getCustomer().getTier() == 2) // Filtra clienti di tier 2
                .filter(o -> o.getOrderDate().isAfter(startDate.minusDays(1)) &&
                        o.getOrderDate().isBefore(endDate.plusDays(1))) // Filtra date tra 01-Feb e 01-Apr
                .toList();

        // Stampa gli ordini filtrati
        ordiniFiltrati.forEach(System.out::println);


    }




}
