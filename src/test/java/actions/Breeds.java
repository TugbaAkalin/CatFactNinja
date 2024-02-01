package actions;

public class Breeds extends Base{
    String breed;
    String country;
    String origin;
    String coat;
    String pattern;

    public String getBreed() {
        return breed;
    }

    public String getCountry() {
        return country;
    }

    public String getOrigin() {
        return origin;
    }

    public String getCoat() {
        return coat;
    }

    public String getPattern() {
        return pattern;
    }

    @Override
    public String toString() {
        return "Breeds{" +
                "breed='" + breed + '\'' +
                ", country='" + country + '\'' +
                ", origin='" + origin + '\'' +
                ", coat='" + coat + '\'' +
                ", pattern='" + pattern + '\'' +
                "} " + super.toString();
    }
}
