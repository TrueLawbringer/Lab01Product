public class Main
{

    public static void main(String[] args)
    {

        Product laptop = new Product("000001", "laptop", "portable computer", 1000);
        System.out.println(laptop.toCSV());
    }

}