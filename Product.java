class Product {
    String name;
    double price;

    Product(String n, double p) {
        name = n;
        price = p;
    }

    public static void main(String[] args) {
        Product p1 = new Product("Pen", 1000);
        Product p2 = new Product("Book", 500);
        Product p3 = new Product("Pencil", 500);

        Product lowest = p1;

        if (p2.price < lowest.price) {
            lowest = p2;
        }
        if (p3.price < lowest.price) {
            lowest = p3;
        }

        System.out.println("Lowest Price Product:");
        System.out.println("Name: " + lowest.name);
        System.out.println("Price: " + lowest.price);
    }
}

