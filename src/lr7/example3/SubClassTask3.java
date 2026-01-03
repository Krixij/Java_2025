package lr7.example3;

public class SubClassTask3 extends SuperClassTask3{
    public char ch;
    public SubClassTask3(int numEx, char ch){
        super(numEx);
        this.ch = ch;
    }
    public void setNum(int numEx, char ch){
        super.setNum(numEx) ;
        this.ch = ch;
    }

    public char getCh() {
        return ch;
    }

    @Override
    public int getNum(){
        return super.getNum();
    }
    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " num = " + this.getNum() + "\n" +
                " char = " + this.ch + "\n";
        return ClassNameAndFieldValue;
    }

}
