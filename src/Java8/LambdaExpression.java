package Java8;

public class LambdaExpression{

    public static void wish(Greeting greet){
        greet.greet();
    }

    public static void main(String[] args) {

        wish(() -> System.out.println("Hello"));

    }


}
