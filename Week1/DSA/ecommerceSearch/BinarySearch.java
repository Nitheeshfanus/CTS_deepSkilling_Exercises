public class BinarySearch {
    public static Product search(Product[] products, String name) {

        int low = 0;
        int high = products.length - 1;

        while(low <= high) {

            int mid = (low + high) / 2;

            int comparison =
                products[mid].getProductName()
                .compareToIgnoreCase(name);

            if(comparison == 0) {
                return products[mid];
            }
            else if(comparison < 0) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return null;
    }
}
