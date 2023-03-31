package builder;

public class Product {
    private final String productName;
    private final String category;
    private final int price ;
    private Product(Builder b){
        this.productName = b.productName;
        this.category = b.category;
        this.price = b.price;
    }
    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public static class Builder{
        private final String productName;
        private String category;
        private int price;

        public Builder(String productName){
            this.productName = productName;
        }

        public Builder category(String category){
            this.category = category;
            return this;
        }
        public Builder price(int price){
            this.price = price;
            return this;
        }

        public Product build(){
            return new Product(this);
        }

    }

}
