package lr7.example4;

public class SuperClassTask4 {
    public char ch;

    public SuperClassTask4(char ch) {
        this.ch = ch;
    }

    public char getCh() {
        return ch;
    }
    public SuperClassTask4(SuperClassTask4 copy){
        this.ch = copy.ch;
    }

    @Override
    public String toString(){
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " char = " + this.getCh() + "\n";
        return superClassNameAndFieldValue;
    }
}
