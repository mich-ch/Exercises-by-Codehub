package gr.myproj.exercises1;

public class StringClass {

    //1. Password contains at least one uppercase character
    public static boolean UpperCaseChar(String pass) {
        char ch;
        boolean capitalFlag = false;
        for(int i=0;i < pass.length();i++) {
            ch = pass.charAt(i);
            if (Character.isUpperCase(ch))
                capitalFlag = true;
        }
        return false;
    }

    //2. Password contains at least one lowercase character
    public static boolean LowerCase(String pass) {
        char ch;
        boolean lowerCaseFlag = false;
        for(int i=0;i < pass.length();i++) {
            ch = pass.charAt(i);
            if (Character.isLowerCase(ch)) {
                lowerCaseFlag = true;
            }
        }
        return false;
    }

    //3. Contains at least one number
    public static boolean DigitCase(String pass) {
        char ch;
        boolean numberFlag = false;
        for(int i=0;i < pass.length();i++) {
            ch = pass.charAt(i);
            if( Character.isDigit(ch)) {
                numberFlag = true;
            }
        }
        return false;
    }

    //4. Contains at least one special character (e.g., !, _ etc)
    public static boolean SpecialChar(String pass) {
        //?=.*[@#$%^&+=]
        char strArr[] = {'@','#','$','%','^','&','+','='};
        for (int i = 0; i < strArr.length; i++)
            for (int j = 0; j < pass.length(); j++)
                if(strArr[i] == pass.charAt(j))
                    return true;
        return false;
    }

    //5. Password length must be at least 8 characters long
    public static boolean LeastEigChar(String pass) {
        if(pass.length()<8)
            return false;
        return true;
    }

    //6. Cannot contain a sequence of 3 same characters (i.e.
    //aaa) or a sequence of 3 consecutive characters (i.e abc)
    public static boolean SameCharOrCons(String pass) {
        int count = 0;
        boolean same = true;
        boolean cons = true;
        for(int i=0; i<pass.length(); i++) {
            for (int j = 0; j < pass.length(); j++)
                if(pass.charAt(i) == pass.charAt(j))
                    ++count;
                    if(count>2)
                        return false;
                else
                    count = 0;

            for (int j = 0; j < pass.length(); j++)
                if(pass.charAt(i) == pass.charAt(j) - count)
                    ++count;
                    if(count>2)
                        return false;
                else
                    count = 0;

        }
        if(same && cons)
            return true;
        else
            return false;
    }
}
