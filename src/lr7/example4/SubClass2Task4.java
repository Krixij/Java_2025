package lr7.example4;

public class SubClass2Task4 extends SubClassTask4{
    public int num;

    public SubClass2Task4(char ch, String str, int num) {
        super(ch, str);
        this.num = num;
    }
    public SubClass2Task4(SubClass2Task4 copy){
        super(copy.ch, copy.str);
        this.num = copy.num;
    }
    @Override
    public String toString(){
        String subClassNameAndFieldValue;
        subClassNameAndFieldValue = "sub 1 " + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " char = " + this.getCh() + "\n" +
                " String = " + this.getStr() + "\n" +
                " Number = " + this.num + "\n";
        return subClassNameAndFieldValue;
    }
}
