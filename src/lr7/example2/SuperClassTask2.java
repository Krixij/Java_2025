package lr7.example2;

public class SuperClassTask2 {
    private String str1;

    public SuperClassTask2(String strEx){
        this.str1 =  strEx;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String strEx) {
        this.str1 = strEx;
    }

    public void setConstValue(){
        this.str1 = "Присвоили константу";
    }

    public int getLengthStr1() {
        if (null == this.str1){
            return 0;
        }
        return this.str1.length();
    }
    @Override
    public String toString(){
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getStr1() + "\n" +
                " длина строки = " + this.getLengthStr1() + "\n";
        return superClassNameAndFieldValue;
    }

}
