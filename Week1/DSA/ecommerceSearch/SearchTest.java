import java.util.Arrays;
import java.util.Comparator;

public class SearchTest {
    
        public static void main(String[] args) {

        Product[] products = {

            new Product(101,"Laptop","Electronics"),
            new Product(102,"Phone","Electronics"),
            new Product(103,"Watch","Accessories"),
            new Product(104,"Speaker","Electronics"),
            new Product(105,"Camera","Electronics")
        };

        Product result1 =
                LinearSearch.search(products, "Laptop");

        if(result1 != null) {
            System.out.println(
                "Linear Search Found: "
                + result1.getProductName()
            );
        }

        Arrays.sort(products,
            Comparator.comparing(Product::getProductName));

        Product result2 =
                BinarySearch.search(products, "Laptop");

        if(result2 != null) {
            System.out.println(
                "Binary Search Found: "
                + result2.getProductName()
            );
        }
    }
}
