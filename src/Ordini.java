import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Ordini {




        private long id;
        private String status;
        private LocalDate orderDate;
        private LocalDate deliveryDate;
        private List<Prodotti> products = new ArrayList<>();
        private Clienti customer;

        public Ordini(Clienti customer) {
            this.orderDate = LocalDate.now();
            this.customer = customer;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public LocalDate getOrderDate() {
            return orderDate;
        }

        public void setOrderDate(LocalDate orderDate) {
            this.orderDate = orderDate;
        }

        public LocalDate getDeliveryDate() {
            return deliveryDate;
        }

        public void setDeliveryDate(LocalDate deliveryDate) {
            this.deliveryDate = deliveryDate;
        }

        public List<Prodotti> getProducts() {
            return products;
        }

        public void setProducts(List<Prodotti> products) {
            this.products = products;
        }

        public Clienti getCustomer() {
            return customer;
        }

        public void setCustomer(Clienti customer) {
            this.customer = customer;
        }

        @Override
        public String toString() {
            return "Order{" +
                    "orderDate=" + orderDate +

                    ", products=" + products +
                    ", customer=" + customer +
                    '}';
        }

    }



