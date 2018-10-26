public class Driver {

  public static void main(String[] args) {
    SuperArray SA = new SuperArray();

    System.out.println("SA: " + SA);
    // []
    System.out.println("isEmpty?: " + SA.isEmpty());                 // true

    System.out.println();

    SA.add("A"); System.out.println("SA.add(\"A\")");                // no output
    System.out.println("isEmpty?: " + SA.isEmpty());                 // false

    System.out.println();

    SA.add("B"); System.out.println("SA.add(\"B\")");                // no output
    SA.add("C"); System.out.println("SA.add(\"C\")");                // no output
    System.out.println("size: " + SA.size());                        // 3
    System.out.println("SA: " + SA.toStringDebug());
    // [A, B, C, null, null, null, null, null, null, null]

    System.out.println();

    System.out.println("SA.remove(0): " + SA.remove(0));             // "A"
    System.out.println("size: " + SA.size());                        // 2
    System.out.println("SA: " + SA);
    // [B, C]

    System.out.println();

    System.out.println("SA.get(1): " + SA.get(1));                   // "C"
    System.out.print("SA.get(15): ");
    if(SA.get(15) == null) { System.out.println("index error"); }    // "index error"
    System.out.print("SA.get(-2): ");
    if(SA.get(-1) == null) { System.out.println("index error"); }    // "index error"

    System.out.println();

    System.out.println("SA.set(0,\"I'm\"): " + SA.set(0,"I'm"));     // "B"
    System.out.println("SA: " + SA);
    // [I'm, C]

    System.out.println();

    System.out.print("SA.set(15, \"J\"): ");
    if(SA.get(15) == null) { System.out.println("index error"); }    // "index error"
    System.out.print("SA.get(-2, \"J\"): ");
    if(SA.get(-1) == null) { System.out.println("index error"); }    // "index error"

    System.out.println("SA: " + SA);
    // [I'm, C]
    System.out.println("size: " + SA.size());                        // 2

    System.out.println();

    System.out.println("contains \"D\"?): " + SA.contains("D"));     // false
    System.out.println("contains \"C\"?): " + SA.contains("C"));     // true

    System.out.println();

    SA.add(15,"C"); System.out.println("SA.add(15,\"C\")");          // "index error"
    SA.add(-2,"C"); System.out.println("SA.add(-2,\"C\")");          // "index error"
    SA.add(1,"C"); System.out.println("SA.add(1,\"C\")");            // no output
    System.out.println("SA: " + SA);
    // [I'm, C, C]

    System.out.println();

    SA.add(1,"sorry"); System.out.println("SA.add(1,\"sorry\")");    // no output
    System.out.println("SA: " + SA);
    // [I'm, sorry, C, C]
    System.out.println("size: " + SA.size());                        // 4

    System.out.println();

    System.out.println("SA.indexOf(\"C\"): " + SA.indexOf("C"));     // 2
    System.out.print("SA.lastIndexOf(\"C\"): ");
    System.out.println(SA.lastIndexOf("C"));                         // 3

    System.out.println();

    System.out.println("SA.indexOf(\"D\"): " + SA.indexOf("D"));     // -1
    System.out.print("SA.lastIndexOf(\"D\"): ");
    System.out.println(SA.lastIndexOf("D"));                         // -1

    System.out.println();

    System.out.println("SA.remove(15): " + SA.remove(15));           // index error
    System.out.println("SA.remove(-2): " + SA.remove(-2));           // index error
    System.out.println("SA.remove(2): " + SA.remove(2));             // "C"
    System.out.println("SA: " + SA);
    // [I'm, sorry, C]
    System.out.println("SA: " + SA.toStringDebug());
    // [I'm, sorry, C, null, null, null, null, null, null, null, null]

    System.out.println();

    System.out.print("SA.remove(\"D\"): ");
    if(SA.remove("D")) {
      System.out.println("element succesfully removed");
    } else {
      System.out.println("element not found");
    }

    System.out.print("SA.remove(\"C\"): ");
    if(SA.remove("C")) {
      System.out.println("element succesfully removed");
    } else {
      System.out.println("element not found");
    }

    System.out.println("SA: " + SA);
    // [I'm, sorry]
    System.out.println("SA: " + SA.toStringDebug());
    // [I'm, sorry, null, null, null, null, null, null, null, null, null]

    System.out.println();

    SA.add("Dave"); System.out.println("SA.add(\"Dave\")");          // no output
    SA.add("I'm"); System.out.println("SA.add(\"I'm\")");            // no output
    SA.add("afraid"); System.out.println("SA.add(\"afraid\")");      // no output
    SA.add("I"); System.out.println("SA.add(\"I\")");                // no output
    SA.add("can't"); System.out.println("SA.add(\"can't\")");        // no output
    SA.add("let"); System.out.println("SA.add(\"let\")");            // no output
    SA.add("you"); System.out.println("SA.add(\"you\")");            // no output

    System.out.println();

    System.out.println("size: " + SA.size());                        // 9
    System.out.println("SA: " + SA);
    // [I'm, sorry, Dave, I'm, afraid, I, can't, let, you]
    System.out.println("SA: " + SA.toStringDebug());
    // [I'm, sorry, Dave, I'm, afraid, I, can't, let, you, null]

    System.out.println();

    SA.add("do"); System.out.println("SA.add(\"do\")");              // no output
    SA.add("that"); System.out.println("SA.add(\"that\")");          // no output

    System.out.println();

    System.out.println("size: " + SA.size());                        // 11
    System.out.println("SA: " + SA);
    // [I'm, sorry, Dave, I'm, afraid, I, can't, let, you, do, that]
    System.out.println("SA: " + SA.toStringDebug());
    // [I'm, sorry, Dave, I'm, afraid, I, can't, let, you, do, that, null, null, null, null, null, null, null, null, null]

  }

}
