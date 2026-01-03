package lr7.example3;

public class SuperClassTask3 {
    public int num;
    public SuperClassTask3(int numEx){
        this.num = numEx;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
    @Override
    public String toString(){
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " num = " + this.getNum() + "\n";
        return superClassNameAndFieldValue;
    }
}
