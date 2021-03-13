import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

public class Category {
    private String nameCategory;
    private ProductWrapper productWrapper;

    public Category(String nameCategory, ProductWrapper productWrapper) {
        this.nameCategory = nameCategory;
        this.productWrapper = productWrapper;
    }

    public Category() {
    }

    @XmlElement(name = "name")
    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    @XmlElement(name = "products")
    public ProductWrapper getProductWrapper() {
        return productWrapper;
    }

    public void setProductWrapper(ProductWrapper productWrapper) {
        this.productWrapper = productWrapper;
    }

    @Override
    public String toString() {
        return "Category{" +
                "nameCategory='" + nameCategory + '\'' +
                ", " + productWrapper +
                '}';
    }
}
