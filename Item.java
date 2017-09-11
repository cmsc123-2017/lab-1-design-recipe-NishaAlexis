class Item {
  int price;
  double sale;
  
  //constant
  final int saleLimit = 1000;
  
  Item(int price, double sale){
    this.price = price;
    this.sale = sale;
  }
  
  //int, double -> double
  // Given the item price and sale percentage, apply the sale to the item price if price exceeds 1000, 
  // otherwise return the original price
  double salePrice1000(){
    if (this.price > saleLimit) {
      return computeSalePrice();
    } else {
      return this.price;
    }
  } 
  
  //int, double -> double
  //Computes an item's price after being reduced by the given sale percentage
  double computeSalePrice() {
    return this.price - (this.sale * this.price);
  }
}