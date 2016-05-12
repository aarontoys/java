public class Reverse {
  public String str;

  public Reverse (String str) {
    this.str = str;
  }

  // public String reverse () {
  //   for (String myChar : str.split("") ){
  //     System.out.println(myChar);
  //   }
  //   // return;
  // }

  public static String reverse (String word) {

    String reversedWord = "";
    for (int i = word.length() - 1; i >= 0; i--) {
      reversedWord += word.charAt(i);
    }
    return reversedWord;
  }

  public static void main (String [] args ) {
    // Reverse myStr = new Reverse("hello world");
    String word = args[0];

    System.out.println(reverse(word));
  }
}

//public class Reverse {
// 
//  public static void main (String [] args) {
//    String word = args[0];
//    String reverseWord = '';
//
//    for (int i = word.length() -1; i >= 0; i--) {
//      reverseWord += word.charAt[i];
//    }
//    
//    System.out.println(reversedWord);
//
//  }
//}