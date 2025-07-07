package StringMethods;

public class StringMethods {
    public  static void main(String [] args){
        String name="Mrinal";
        String second="Mrinal";
        int length=name.length();
        int c=name.charAt(length-1);
        boolean isEqual=name.equals(second);

        String str1="remote";
        String str2="ramote";
        System.out.println(str1.compareTo(str2));
        String substring=str1.substring(0,3);
        System.out.println(substring);
        System.out.println(name.toUpperCase());
        String newName=name.replace("Mrinal","Anand");
        boolean isContain=name.contains("Mrin");
        int i=name.indexOf("a");
        System.out.println(i);

    }
}
