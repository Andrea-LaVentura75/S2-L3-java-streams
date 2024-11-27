public class Clienti {

    private String nomeCliente;
    private int tier;
    private long id;

    public Clienti(String nomeCliente, int tier, long id) {
        this.nomeCliente = nomeCliente;
        this.tier = tier;
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + nomeCliente + '\'' +
                ", tier=" + tier +
                '}';
    }
}
