package dsa_course_content;

public class RecursionCapitalizeWord {

    public static void main(String[] args)
    {
        String capitalize = capitalizeWord1("imo love java");
        System.out.println("capitalize : "+capitalize);
    }
    public static String capitalizeWord(String str){
        //   TODO
        if(str.substring(1).length() == 0)
            return str.substring(0,1).toUpperCase();
        if(!Character.isUpperCase(str.charAt(0)) && str != null && str.substring(1).length() >= 1)
        {
            System.out.println("upper case : "+capitalizeWord(str.substring(1)) + str.substring(0,1).toUpperCase());
                return str.substring(0,1).toUpperCase() + capitalizeWord(str.substring(1));

        }

        else
            return str.substring(0,1);
    }

    // set a flag to convert first char into caps. This is posssible thru iterative meethod - firstcall = true
    public static String capitalizeWord1(String str) {
        //   TODO
        System.out.println("str.charAt(0) = "+ str.charAt(0));

        if(str.charAt(0) != ' ' && str != null && str.substring(1).length() >= 1) {
            return str.charAt(0) + capitalizeWord1(str.substring(1));

        }
        else
        {

            //System.out.println("str.substring(1, 2).toUpperCase() : "+Character.toUpperCase(str.charAt(1)) + capitalizeWord1(str.substring(1)));
            if (str != null && str.substring(1).length() >= 1){
                return Character.toString(str.charAt(0)) + Character.toUpperCase(str.charAt(1)) + capitalizeWord1(str.substring(2));
            }

        }
//            System.out.println("remaining first char of word : "+str.substring(1,2).toUpperCase() + capitalizeWord1(str.substring(1)));
//            if(!Character.isUpperCase(str.charAt(1)))
//            return str.substring(1,2).toUpperCase() + capitalizeWord1(str.substring(1));
//            else
//                return str.substring(1);
        //}

        System.out.println("before output : "+ str);
        return str;
    }
}
