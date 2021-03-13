import com.fasterxml.jackson.databind.ObjectMapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Category> listCategory = new ArrayList<>();
        try {
            JAXBContext context = JAXBContext.newInstance(CategoryWrapper.class, Category.class, ProductWrapper.class, Product.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            CategoryWrapper wrapper = (CategoryWrapper) unmarshaller.unmarshal(new File("categories.xml"));
            listCategory = wrapper.getCategories();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        System.out.println(listCategory);
    }
}


