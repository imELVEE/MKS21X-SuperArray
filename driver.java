public class driver{
  public static void main(String[] args){
    SuperArray testArray = new SuperArray();
    System.out.println("---initialize---");
    System.out.println(testArray.size());
    System.out.println(testArray.isEmpty());
    System.out.println("---Test with adding Fish---");
    System.out.println(testArray.add("Fish"));
    System.out.println(testArray.get(0));
    System.out.println(testArray.get(1));
    System.out.println(testArray.size());
    System.out.println(testArray.isEmpty());
    System.out.println("---clear array---");
    testArray.clear();
    System.out.println(testArray.size());
    System.out.println(testArray.isEmpty());
    System.out.println("---set array bigger than size---");
    System.out.println(testArray.set(0,"tuba"));
    System.out.println(testArray.get(0));
    System.out.println(testArray.size());
    System.out.println(testArray.isEmpty());
    System.out.println("---set array smaller than size---");
    System.out.println(testArray.add("Fish"));
    System.out.println(testArray.get(0));
    System.out.println(testArray.size());
    System.out.println(testArray.isEmpty());
    System.out.println(testArray.set(0,"tuba"));
    System.out.println(testArray.get(0));
    System.out.println(testArray.size());
    System.out.println(testArray.isEmpty());
  }
}
