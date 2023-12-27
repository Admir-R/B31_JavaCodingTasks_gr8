package week06;

public class PasswordValidation_AR {
    public static void main(String[] args) {

        System.out.println("isValidPassword(\"Password1#\") = " + isValidPassword("Password1#"));
        System.out.println("isValidPassword(\"User5!\") = " + isValidPassword("User5!"));
        System.out.println("isValidPassword(\"Abcdef56@$\") = " + isValidPassword("Abcdef56@$"));
        System.out.println("isValidPassword(\"A  56hfhfjfn\") = " + isValidPassword("A  56hfhfjfn"));
        System.out.println("isValidPassword(\"User5555\") = " + isValidPassword("User5555"));

    }

    public static boolean isValidPassword(String password){
        if(password.length() < 6 || password.contains(" ")){ //check length and no space
            return false;
        }
        //check for at least 1 uppercase, 1 lowercase, 1 special character, 1 digit
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        for (char eachChar : password.toCharArray()) {
            if(Character.isUpperCase(eachChar)){
                hasUppercase = true;
            }else if (Character.isLowerCase(eachChar)) {
                hasLowercase = true;
            }else if(Character.isDigit(eachChar)){
                hasDigit = true;
            }else if(!(Character.isLetterOrDigit(eachChar))){
                hasSpecialChar = true;
            }
        }
        return hasUppercase && hasLowercase && hasSpecialChar && hasDigit;
    }
}
/*
String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
 */