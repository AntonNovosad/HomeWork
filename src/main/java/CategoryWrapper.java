import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;


@XmlRootElement(name = "categories")
public class CategoryWrapper {
    private List<Category> categories = new ArrayList<Category>();

    public CategoryWrapper(List<Category> categories) {
        this.categories = categories;
    }

    public CategoryWrapper() {
    }

    @XmlElement(name = "category")
    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
