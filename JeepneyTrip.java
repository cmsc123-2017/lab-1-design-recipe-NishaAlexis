class JeepneyTrip {
  double distance;
  int totalPassengers;
  int discountPassengers;
  
  // constants
  final int BASE_KM = 5;
  final double ADD_KM = 0.5;
  final int DISCOUNTED_FARE = 6;
  final int REGULAR_FARE = 7;
  
  
  JeepneyTrip(double distance, int totalPassengers, int discountPassengers) {
    this.distance = distance;
    this.totalPassengers = totalPassengers;
    this.discountPassengers = discountPassengers;
  }
  
  //TEMPLATE
  /*
   FIELDS:
     ...this.distance...           --double
     ...this.totalPassengers...    --int
     ...this.discountPassengers... --int
     
     this.BASE_KM
     this.ADD_KM
     this.DISCOUNTED_FARE
     this.REGULAR_FARE
     
   METHODS:
     ...this.fareChange(double payment)...    --double
     ...this.actualFare()...                  --double
     ...this.additionalFare()...              --double
   */
  //double -> double
  //Computes the change of the passengers in a jeepney, given the payment
  double fareChange(double payment) {
    return payment - actualFare();
  }
  
  //double, int, int -> double
  //Computes the total fare for all the passengers with the additional fare if distance exceeds 5km,
  //given the distance, and the number of passsengers with or without discount
  double actualFare() {
    return ((this.totalPassengers - this.discountPassengers) * REGULAR_FARE) + (this.discountPassengers * DISCOUNTED_FARE) + this.additionalFare();
  }
  
  
  //int, double -> double
  //Computes the additional fare for all the passengers
  double additionalFare() {
    if (this.distance <= BASE_KM) {
      return 0.0;
    } else {
      return (((this.distance - BASE_KM) * ADD_KM) * this.totalPassengers);
    }
  }
}