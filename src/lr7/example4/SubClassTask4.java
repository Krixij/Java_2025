package lr7.example4;

public class SubClassTask4 extends SuperClassTask4 {
    public String str;

    public SubClassTask4(char ch, String str) {
        super(ch);
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public SubClassTask4(SubClassTask4 copy){
        super(copy.ch);
        this.str = copy.str;
    }

    @Override
    public String toString(){
        String subClassNameAndFieldValue;
        subClassNameAndFieldValue = "sub 1 " + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " char = " + this.getCh() + "\n" +
                " String = " + this.getStr() + "\n";
        return subClassNameAndFieldValue;
    }
}
