package ChaitraChallenge;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Day21 {

	public static boolean isValid(String email){
        String Email = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
                              
        Pattern pat = Pattern.compile(Email);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
  
    public static void main(String[] args){
    	
    	ArrayList<String> address = new ArrayList<>();
            
        address.add("sakshigome1809@gmail.com");
        address.add("ClothingBrand.NKcompany.org");
            
        for(String i : address){
            if (isValid(i))
                System.out.println(i + " - It is a valid email.");
            else
                System.out.println(i + " - It is not a valid email.");
        }
    }
}
