package Model.Classes;

import java.util.Objects;

public class Ciclist {

    private String name;

    private double weight;

    private double height;

    private String country;


    /**constructors**.
     *
     * @param name
     * @param weight
     * @param height
     * @param country
     */
    public Ciclist(String name, double weight, double height, String country) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.country = country;
    }

    public Ciclist()
    {
        name = "";
        weight = 0;
        height = 0;
        country= "";
    }


    /**
     * getters and setters
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    /**to string , compareto y hashcode
     *
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ciclist ciclist = (Ciclist) o;

        if (Double.compare(ciclist.weight, weight) != 0) return false;
        if (Double.compare(ciclist.height, height) != 0) return false;
        if (!Objects.equals(name, ciclist.name)) return false;
        return Objects.equals(country, ciclist.country);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Ciclist{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", country='" + country + '\'' +
                '}';
    }



}

