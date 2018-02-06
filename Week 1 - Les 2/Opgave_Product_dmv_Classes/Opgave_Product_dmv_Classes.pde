class Product {
  String naam;
  int prijs;

  Product(String productNaam, int productPrijs) {
    this.naam = productNaam;
    this.prijs = productPrijs;
  }
}

void setup() {
  Product product1 = new Product("PC", 500);
  Product product2 = new Product("MAC", 2000);
  Product product3 = new Product("SWITCH", 330);

  Product[] productArray = {product1, product2, product3};

  for (int i = 0; i < productArray.length; i++) {
    println(productArray[i].naam, "Kost: €" + productArray[i].prijs + ",-");
  }
}