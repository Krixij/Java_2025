package lr7.example5;

public class SuperClassTask5 {
    private String str;

    public SuperClassTask5(String strEx) {
        this.str = strEx;
    }

    public String getStr() {
        return str;
    }

    public void value() {
        String superClassValue;
        superClassValue = "Super: " + "\n"+
                " Name class: " + getClass().getSimpleName() + "\n" +
                " String = " + this.str + "\n";
        System.out.println(superClassValue);
    }

}
