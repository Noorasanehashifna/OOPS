import java.util.*;

interface bill{
    void calculate();
}

class product implements bill{
    int productId;
    String name;
    int quantity;
    float unitPrice;
    float total;

    void getData(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product id: ");
        productId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter product name: ");
        name = sc.nextLine();

        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();

        System.out.print("Enter unit price: ");
        unitPrice = sc.nextFloat();
    }

    public void calculate(){
        total = quantity * unitPrice;
    }

    void display(){
        System.out.println(productId + "\t\t" + name + "\t" + quantity + "\t\t" + unitPrice + "\t\t" + total);
    }

    float getTotal(){
        return total;
    }
}

class co3_7{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter order number: ");
        int orderNo = sc.nextInt();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        product[] products = new product[n];
        float netAmount = 0;

        System.out.println("\nEnter product details:\n");

        for(int i = 0; i < n; i++){
            products[i] = new product();
            products[i].getData();
            products[i].calculate();
            netAmount += products[i].getTotal();
            System.out.println();
        }

        System.out.println("\nOrder no: " + orderNo);
        System.out.println("Date: " + java.time.LocalDate.now());

        System.out.println("----------------------------------------------------");
        System.out.println("ProductId\tName\tQuantity\tUnitPrice\tTotal");
        System.out.println("----------------------------------------------------");

        for(product p : products){
            p.display();
        }

        System.out.println("----------------------------------------------------");
        System.out.printf("%35s %.2f\n", "Net Amount:", netAmount);
    }
}
