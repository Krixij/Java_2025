package lr7.example5;

public class SubClass2Task5 extends SuperClassTask5{
    protected char ch;
    public SubClass2Task5(String str, char ch){
        super(str);
        this.ch = ch;
    }
    @Override
    public void value(){
        String superClassValue;
        superClassValue = "Sub2: " + "\n"+
                " Name class: " + getClass().getSimpleName() + "\n" +
                " String = " + getStr() + "\n"+
                " Char = " + this.ch + "\n";
        System.out.println(superClassValue);
    }
}
