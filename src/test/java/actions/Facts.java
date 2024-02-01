package actions;

public class Facts extends Base{

    String fact;
    int lenght;

    public String getFact() {
        return fact;
    }

    public int getLenght() {
        return lenght;
    }

    @Override
    public String toString() {
        return "Facts{" +
                "fact='" + fact + '\'' +
                ", lenght=" + lenght +
                "} " + super.toString();
    }
}
