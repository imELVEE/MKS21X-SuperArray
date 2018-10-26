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
    testArray.clear();
    System.out.println("---add 11 times---");
    testArray.add("Red Fish");
    testArray.add("Blue Fish");
    testArray.add("Green Fish");
    testArray.add("Yellow Fish");
    testArray.add("Pink Fish");
    testArray.add("Orange Fish");
    testArray.add("Black Fish");
    testArray.add("White Fish");
    testArray.add("Purple Fish");
    testArray.add("Brown Fish");
    System.out.println(testArray.size());
    System.out.println(testArray.add("Lonely Fish"));
    System.out.println(testArray.size());
    System.out.println("---test contains---");
    System.out.println(testArray.contains("Red Fish"));
    System.out.println(testArray.contains("error"));

  }
}
