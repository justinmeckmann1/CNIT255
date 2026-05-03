package q3;

public class StringDemo {

    // main method for calling and reproducing output
    public static void main(String[] args) {

        // Initial String
        String str = "Java";

        // StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Programming");

        // StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Language");

        // print individual results
        System.out.println("String: " + str);
        System.out.println("StringBuilder: " + stringBuilder.toString());
        System.out.println("StringBuffer: "  + stringBuffer.toString());

        // combine into final sentence
        String finalSentence = str + " " + stringBuilder.toString() + " " + stringBuffer.toString();
        System.out.println("Final sentence: " + finalSentence);
    }
}

/*
Reflective question: When building or changing text many times in a program, why might a programmer 
choose StringBuilder instead of String?

Because Strings are immutable. Meaning, every time one wants to make changes to a string, a new object is 
created. Repeating this many times, leads to a large number of objects which are essentially unused. 
Because StringBuilder objects are mutable, it allows modification after creation without creating new
objects. 
*/