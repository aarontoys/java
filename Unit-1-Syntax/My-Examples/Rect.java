// function Rect(width, length){
//   this.width = width;
//   this.length = length;
// }

// Rect.prototype.area = function(){
//   return this.width * this.length;
// }

// var myRect = new Rect(100,100);

// console.log(myRect.area());

public class Rect {
  public int width;
  public int height;

  public Rect (int width, int height) {
    this.width = width;
    this.height = height;
  }

  public int area () {
    return this.width * this.height;
  }

  public static void main (String [] args) {
    Rect myRect = new Rect(3,7);

    System.out.println(myRect.area());
    
  }
}