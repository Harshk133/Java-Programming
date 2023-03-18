import java.util.Locale;

public class java_string_methods {
    public static void main(String[] args){
        String name = "harsh";

        //System.out.println(name);
        //Some String methods are ...
        //1.length()
        int value = name.length();
        //System.out.println(value);
        //2.toLowerCase()
        String lstring = name.toLowerCase();
        //System.out.println(lstring);
        //3.toUpperCase()
        String ustring = name.toUpperCase();
        //System.out.println(ustring);
        //4.trim()
        String trimmedString = name.trim();
        //System.out.println(trimmedString);
        //5.substring(int beginningInex);
        //System.out.println(name.substring(2));
        //6.substring(int beginningInex, int endingIndex);
        //System.out.println(name.substring(2, 4));
        //6.replace(char oldchar, char newchar);
        //System.out.println(name.replace('h', 'a'));
        //7.startswith(); Returns true or false
        //System.out.println(name.startsWith("ha"));
        //7.endswith(); Returns true or false
        //System.out.println(name.endsWith("sh"));
        //8.charAt();
        //System.out.println(name.charAt(2));
        //9.indexOf(str)
        //System.out.println(name.indexOf("rs"));
        //10.indexOf("ch",2)
        //System.out.println(name.indexOf("h",1));
        //11.lastIndexOf("");
        //System.out.println(name.lastIndexOf("h"));
        //12.equals();
        System.out.println(name.equals("haRsh"));
        System.out.println(name.equalsIgnoreCase("harsh"));
    }
}
