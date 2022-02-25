package Generic;

public class Generic <T> {

    T genVar;

    Generic(T genVar){
        this.genVar = genVar;
    }
    public void printGen(){
        System.out.println(genVar);
    }


}
