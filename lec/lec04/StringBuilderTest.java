public class StringBuilderTest {
       public static void main(String[] args) {
              System.out.println("StringBuilder Test\n----------------------\n");

              StringBuilder originalSB = new StringBuilder("Hello");
              System.out.println("original string: " + originalSB);
              StringBuilder tempSB = originalSB; //references are copied!
              System.out.println("original reference: " + System.identityHashCode(originalSB));
              System.out.println("temp reference: " + System.identityHashCode(tempSB));
              originalSB.append(" There!"); // originalSB modified
              System.out.println("orignial string modified: " + originalSB);
              System.out.println("temp string modified?: " + tempSB);
              System.out.println("originalSB reference after mod: " + System.identityHashCode(originalSB));
              System.out.println("tempSB reference after mod: " + System.identityHashCode(tempSB));
       
       }

}

// StringBuilder keeps the reference. Modifying the copy, if the original is modified. 