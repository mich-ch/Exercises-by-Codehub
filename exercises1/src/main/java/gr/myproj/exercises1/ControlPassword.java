package gr.myproj.exercises1;

import java.util.ArrayList;
import java.util.List;

public class ControlPassword {

    //To accept a password, at least 3 out of 6 criteria must be met, and criterion 5 is mandatory
    public static boolean AtLeastThree(String pass){
        int count = 0;
        List<Boolean> flags = new ArrayList<>();

        flags.add(StringClass.UpperCaseChar(pass));
        flags.add(StringClass.LowerCase(pass));
        flags.add(StringClass.DigitCase(pass));
        flags.add(StringClass.SpecialChar(pass));
        //mandatory
        flags.add(StringClass.LeastEigChar(pass));
        flags.add(StringClass.SameCharOrCons(pass));

        for(Boolean flag: flags)
            if(flag)
                count++;


        if(count > 2 && flags.get(4)) {
            //If 3,6 or 4,6 criteria are met, print “Password OK”
            if ((flags.get(2) && flags.get(3)) || (flags.get(3) && flags.get(5)))
                System.out.println("Password OK");
            else if (flags.get(4) && flags.get(5))
                System.out.println("Strong password");
            else if (count == 6)
                System.out.println("Very Strong password");
            return true;
        }

        System.out.println("Invalid password\n");
        System.out.println("1. Password contains at least one uppercase character\n");
        System.out.println("2. Password contains at least one lowercase character \n");
        System.out.println("3. Contains at least one number \n");
        System.out.println("4. Contains at least one special character (e.g., !, _ etc) \n");
        System.out.println("5. Password length must be at least 8 characters long \n");
        System.out.println("6. Cannot contain a sequence of 3 same characters " +
                            "(i.e. aaa) or a sequence of 3 consecutive characters (i.e abc)\n");
        return false;
    }

}
