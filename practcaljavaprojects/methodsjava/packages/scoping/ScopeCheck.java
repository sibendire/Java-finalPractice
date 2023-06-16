package methodsjava.packages.scoping;

public class ScopeCheck {
    public  int publicVar = 0;
    private  int privateVar = 1;

    public ScopeCheck() {
        System.out.println("Scope check created ,publicVar : " + publicVar + "and privateVar" + privateVar );
    }

    public int getPrivateVar() {
        return privateVar;
    }
    public static  int timesTwo(){
        int privateVar = 2;
        for (int i =0; i <=10; i++){
            System.out.println(i + "Times two is " + i * privateVar);
        }
    }
}
