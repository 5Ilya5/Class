public class Program {
     

    public static void main(String[] args) {
    
    Tovar myTovar = new Tovar();
       
    Product myProduct = new Product("milk", 95, "шт", "литр");
    Product myProduct = new Product("hleb", 15, "шт", "буханка");
    Product myProduct = new Product("eggs", 75, "шт", "лоток");
    Drink myDrink = new Drink("Limonad", 40, "шт", "литр");
    Childrenproduct myChildrenproduct = new Childrenproduct("Diapers", 100, "шт", "упаковка");
    Gigien myGigien = new Gigien("masks", 50, "шт", "упаковка");
    Gigien myGigien = new Gigien("tolietpaper", 100, "шт", "упаковка");

    myProduct.ride();
    myDrink.ride();
    myChildrenproduct.ride();
    myGigien.ride();

    printTovarInfo(myTovar);

    }
private static void printTovarInfo(Tovar myTovar){
    System.out.println(myTovar.getClass() + "info \nName: "+ myTovar.getName()+
    "\nprice: "+ myTovar.getPrice()+
    "\nquantity: "+ myTovar.getQuantity()+
    "\nuntit: "+ myTovar.getUnit());
}
}