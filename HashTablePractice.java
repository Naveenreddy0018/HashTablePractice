import java.util.Hashtable;
import java.util.Map;

class HashTablePractice {
    public static void main(String[] args) {
        Map<Integer, String> studentData = new Hashtable<>();
        studentData.put(1, "Naveen");
        studentData.put(2, "Sahil");
        studentData.put(3, "Prasanth");
        studentData.put(4, "Hari");

        int searchIndex = 2;
        String outputString = studentData.get(searchIndex);
        System.out.print(outputString);
    }
}