package Model.Classes;

import Model.Exceptions.NoLogicalDatesException;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Objects;

public class OutdoorTraining extends Training{

    String pattern = "HH:mm:ss";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
    private String descriptiveName;
    private LocalTime beginning;
    private LocalTime ending;
    private double km;

    public OutdoorTraining( String descriptiveName, String beginning, String ending, double km) throws NoLogicalDatesException {
        this.descriptiveName = descriptiveName;
        this.beginning = LocalTime.parse(beginning,formatter);
        this.ending = LocalTime.parse(ending,formatter);
        this.km = km;
        this.caloriesBurnt = getTotalCalories();

    }

    public OutdoorTraining() {
        descriptiveName = "";
        beginning = LocalTime.MIN;
        ending = LocalTime.MIN;
        km = 0;
    }

    /**getters and setter**/




    public String getDescriptiveName() {
        return descriptiveName;
    }

    public void setDescriptiveName(String descriptiveName) {
        this.descriptiveName = descriptiveName;
    }

    public LocalTime getBeginning() {
        return beginning;
    }

    public void setBeginning(LocalTime beginning) {
        this.beginning = beginning;
    }

    public LocalTime getEnding() {
        return ending;
    }

    public void setEnding(LocalTime ending) {
        this.ending = ending;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    /**equals and hashcode**/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OutdoorTraining that)) return false;
        if (!super.equals(o)) return false;

        if (Double.compare(that.getKm(), getKm()) != 0) return false;
        if (!Objects.equals(pattern, that.pattern)) return false;
        if (!Objects.equals(formatter, that.formatter)) return false;
        if (getDescriptiveName() != null ? !getDescriptiveName().equals(that.getDescriptiveName()) : that.getDescriptiveName() != null)
            return false;
        if (getBeginning() != null ? !getBeginning().equals(that.getBeginning()) : that.getBeginning() != null)
            return false;
        return getEnding() != null ? getEnding().equals(that.getEnding()) : that.getEnding() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = pattern != null ? pattern.hashCode() : 0;
        result = 31 * result + (formatter != null ? formatter.hashCode() : 0);
        result = 31 * result + (getDescriptiveName() != null ? getDescriptiveName().hashCode() : 0);
        result = 31 * result + (getBeginning() != null ? getBeginning().hashCode() : 0);
        result = 31 * result + (getEnding() != null ? getEnding().hashCode() : 0);
        temp = Double.doubleToLongBits(getKm());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }


    /**tostring**/

    @Override
    public String toString() {
        return "OutdoorTraining{" +
                "pattern='" + pattern + '\'' +
                ", formatter=" + formatter +
                ", descriptiveName='" + descriptiveName + '\'' +
                ", beginning=" + beginning +
                ", ending=" + ending +
                ", km=" + km +
                "} " + super.toString();
    }


    @Override
    public double getTotalCalories()
    {
        double totalCalories = 0;
        double minutesTrained  = ChronoUnit.MINUTES.between(ending,beginning);
        totalCalories = minutesTrained * 100;
        caloriesBurnt = totalCalories;
        return totalCalories;
    }

}
