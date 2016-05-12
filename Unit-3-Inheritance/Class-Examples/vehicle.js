//Constuctor

var Vehicle = function(wheels, color) {
  //properties
  this.wheels = wheels;
  this.color = color;
};

Vehicle.prototype.honk = function () {
  return 'Honk!';
};

Vehicle.prototype.output = function () {
  return 'This car has ' + this.wheels + ' wheels and is ' + this.color + '.';
};

// instances
var cliff = new Vehicle(4, 'red');
console.log(cliff.honk());
console.log(cliff.output());

//Constructor
var Car = function(color) {
  this.wheels = 4;
  this.color = color;
}

//methods
Car.prototype = new Vehicle();
Car.prototype.drive = function (miles) {
  return 'This car just drove ' + miles + ' miles.';
}

//instances
var herbie = new Car('white');
console.log(herbie.honk());
console.log(herbie.output());
console.log(herbie.drive(55));