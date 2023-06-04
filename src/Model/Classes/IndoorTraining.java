package Model.Classes;

import Model.Enum.Resistance;
import Model.Enum.Type;

public class IndoorTraining extends Training{

    public int minutesTrained;

    public Resistance resistance;

    public Type type;


    /**
     * constructor
     * @param
     * @param minutesTrained
     * @param resistance
     * @param type
     */
    public IndoorTraining(int minutesTrained, Resistance resistance, Type type) {
        this.minutesTrained = minutesTrained;
        this.resistance = resistance;
        this.type = type;
        this.caloriesBurnt = getTotalCalories();
    }

    public IndoorTraining()
    {
        minutesTrained = 0;
        resistance = Resistance.DEFAULT;
        type = Type.DEFAULT;
    }


    /**
     * getters and setters
     * @return
     */
    public int getMinutesTrained() {
        return minutesTrained;
    }

    public void setMinutesTrained(int minutesTrained) {
        this.minutesTrained = minutesTrained;
    }

    public Resistance getResistance() {
        return resistance;
    }

    public void setResistance(Resistance resistance) {
        this.resistance = resistance;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        IndoorTraining that = (IndoorTraining) o;

        if (minutesTrained != that.minutesTrained) return false;
        if (resistance != that.resistance) return false;
        return type == that.type;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + minutesTrained;
        result = 31 * result + (resistance != null ? resistance.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "IndoorTraining{" +
                "minutesTrained=" + minutesTrained +
                ", resistance=" + resistance +
                ", type=" + type +
                "} " + super.toString();
    }


    @Override
    public double getTotalCalories()
    {
        int totalCalories = 0;
        totalCalories = minutesTrained*100;
        caloriesBurnt = totalCalories;
        return totalCalories;
    }

}
