package Model.Classes;

public abstract class Training  {

    public double caloriesBurnt;


    public Training(double caloriesBurnt) {
        this.caloriesBurnt = caloriesBurnt;
    }

    public Training()
    {
        caloriesBurnt = 0;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Training training = (Training) o;

        return caloriesBurnt == training.caloriesBurnt;
    }


    @Override
    public String toString() {
        return "Training{" +
                "caloriesBurnt=" + caloriesBurnt +
                '}';
    }

    public abstract double getTotalCalories();
}
