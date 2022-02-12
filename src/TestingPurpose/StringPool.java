package TestingPurpose;

public class StringPool {

    public static void main(String[] args) {
        String s = new String("Baisal");
        String t = new String("Baisal");
        String s1 = "Baisal";
        String s2 = "Baisal";

        if(s ==t){
            System.out.println("true");
        } else{
            System.out.println("false");
        }


        if(s1 == t){
            System.out.println("true");
        } else{
            System.out.println("false");
        }


        if(s.equals(s1)){
            System.out.println("true");
        } else{
            System.out.println("false");
        }


        if(s2.equals(s1)){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }

}
