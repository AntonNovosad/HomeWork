import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class ProductWrapper {
    private List<Product> products;

    public ProductWrapper(List<Product> products) {
        this.products = products;
    }

    public ProductWrapper() {
    }

    @XmlElement(name = "product")
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "{" +
                "products=" + products +
                '}';
    }
}
