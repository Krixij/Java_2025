package lr7.example5;

public class SubClassTask5 extends SuperClassTask5{
    protected int num;
    public SubClassTask5(String str, int number){
        super(str);
        this.num = number;
    }
    @Override
    public void value(){
        String superClassValue;
        superClassValue = "Sub1: " + "\n"+
                " Name class: " + getClass().getSimpleName() + "\n" +
                " String = " + getStr() + "\n"+
                " Number = " + this.num + "\n";
        System.out.println(superClassValue);
    }
}
