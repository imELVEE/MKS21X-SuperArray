public class driver{
  public static void main(String[] args){
    SuperArray testArray = new SuperArray();
    System.out.println("---initialize---");
    System.out.println(testArray.size());
    System.out.println(testArray.isEmpty());
    System.out.println("---Test with adding Fish---");
    System.out.println(testArray.add("Fish"));
    System.out.println(testArray.size());
    System.out.println(testArray.isEmpty());
    System.out.println("---clear array---");
    testArray.clear();
    System.out.println(testArray.size());
    System.out.println(testArray.isEmpty());
  }
}
