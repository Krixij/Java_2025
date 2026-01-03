package lr7.example2;

public class SubClassTask2 extends SuperClassTask2{
    public int number;

    public SubClassTask2(String strEx){
        super(strEx);
    }
    public SubClassTask2(String strEx, int num){
        super(strEx);
        this.number = num;
    }
    @Override
    public String getStr1(){
        return super.getStr1();
    }
    @Override
    public void setStr1(String strEx){
        super.setStr1(strEx);
    }
    @Override
    public void setConstValue() {
        super.setConstValue();
        this.number = 0;
    }
    public void setValue(int num){
        super.setConstValue();
        this.number = num;
    }
    public void setValue(String strEx, int num){
        super.setStr1(strEx);
        this.number = num;
    }

    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getStr1() + "\n" +
                " number = " + this.number + "\n" +
                " длина строки = " + super.getLengthStr1() + "\n";
        return ClassNameAndFieldValue;
    }
}
