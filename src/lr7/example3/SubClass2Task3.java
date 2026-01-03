package lr7.example3;

public class SubClass2Task3 extends SubClassTask3{
    public String str;
    public SubClass2Task3(int numEx, char chEx, String str){
        super(numEx ,chEx);
        this.str = str;
    }
    @Override
    public int getNum(){
        return super.getNum();
    }
    @Override
    public char getCh(){
        return super.getCh();
    }
    public void setNum(int numEx, char ch, String str){
        super.setNum(numEx, ch);
        this.str = str;
    }
    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " num = " + this.getNum() + "\n" +
                " char = " + this.getCh() + "\n" +
                " string = " + this.str + "\n";
        return ClassNameAndFieldValue;
    }
}
