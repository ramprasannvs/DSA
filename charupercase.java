/* string convert each the first letter of wor to uppercase */
public class charupercase { public static String conFirstUppercase(String str){
    StringBuilder sb = new StringBuilder("");
    sb.append(Character.toUpperCase(str.charAt(0)));
    for(int i=1; i<str.length(); i++){
        if (str.charAt(i)==' ') {
            sb.append(str.charAt(i));
            i++;
           sb.append(Character.toUpperCase(str.charAt(i)));
        }
        else{
            sb.append(str.charAt(i));
        }            
    }
    return sb.toString();
}

public static void main(String[] args) {
    String str =" i am ram";
    System.out.println(conFirstUppercase(str));
}
   
}
