package TestDome;

public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        java.util.Set<String> uniqueNames=new java.util.HashSet<>();
        java.util.List<String> namesList1=java.util.Arrays.asList(names1);
        java.util.List<String> namesList2=java.util.Arrays.asList(names2);
        uniqueNames.addAll(namesList1);
        uniqueNames.addAll(namesList2);
        return (String[]) uniqueNames.toArray(new String[0]);

    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
