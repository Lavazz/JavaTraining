public class WeightElephantTest {
  public static void main (String [] args) {
    WeightElephant.calculateWeight(500);
  }
}

class WeightElephant {
  static void calculateWeight(int weightKilogramm){
    long weightMilligramm = weightKilogramm * 1000_000;
    long weightGramm = weightKilogramm * 1000;
    double weightTonn = weightKilogramm * 0.001;
    System.out.printf("\nThe elephant wheights %,d %s",  weightKilogramm ,  "kg");
    System.out.printf("\nThe elephant wheights %,d %s",  weightMilligramm ,  "mg");
    System.out.printf("\nThe elephant wheights %,d %s",  weightGramm ,  "g");
    System.out.printf("\nThe elephant wheights %.2f %s",  weightTonn ,  "t");
 
  }
}