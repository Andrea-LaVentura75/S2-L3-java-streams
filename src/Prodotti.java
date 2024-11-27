public class Prodotti {

    private String nome;
    private String categoria;
    private double prezzo;
    private long id;

    public Prodotti(String nome, String categoria, double prezzo, long id) {
        this.nome = nome;
        this.categoria = categoria;
        this.prezzo = prezzo;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Product in list{" +
                "name='" + nome + '\'' +
                ", category='" + categoria + '\'' +
                ", price=" + prezzo +
                '}';
    }


}
