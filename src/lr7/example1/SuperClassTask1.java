package lr7.example1;

public class SuperClassTask1 {
    private String str1;

    SuperClassTask1(String strEx){
        this.str1 = strEx;
    }

    SuperClassTask1(){
    }

    @Override
    public String toString(){
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getStr1();
        return superClassNameAndFieldValue;
    }

    public String getStr1(){
        return str1;
    }
    public void setStr1(String str1) {
        this.str1 = str1;
    }
}

