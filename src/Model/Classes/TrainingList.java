package Model.Classes;

import java.util.ArrayList;

public class TrainingList <T extends  Training> {

    private ArrayList<T> trainingList;


    /**
     * constructors
     **/
    public TrainingList(ArrayList<T> trainingList) {
        this.trainingList = trainingList;
    }

    public TrainingList() {
        trainingList = new ArrayList<>();
    }

    /**
     * getters and setters
     **/
    public ArrayList<T> getTrainingList() {
        return trainingList;
    }

    private void setTrainingList(ArrayList<T> trainingList) {
        this.trainingList = trainingList;
    }


    /**
     * add, delete, countElements and list
     **/

    public void addElement(T element) {
        trainingList.add(element);
    }

    public void deleteElement(T element) {
        trainingList.remove(element);
    }

    public String list() {
        StringBuilder sb = new StringBuilder();

        for (T element : trainingList) {
            sb.append(element.toString() + "\n");
        }
        return sb.toString();
    }

    public int CountElements() {
        int counter = 0;
        for (T element : trainingList) {
            counter++;
        }
        return counter;
    }

    public double totalCaloriesOfIndoorTraining() {
        double totalCalories = 0;
        for (T element : trainingList) {
            if (element instanceof IndoorTraining) {
                totalCalories += ((IndoorTraining) element).getTotalCalories();
            }
        }
        return totalCalories;
    }

    public double totalCaloriesOfOutdoorTraining() {
        double totalCalories = 0;
        for (T element : trainingList) {
            if (element instanceof OutdoorTraining) {
                totalCalories += ((OutdoorTraining) element).getTotalCalories();
            }
        }
        return totalCalories;
    }

    public double totalCaloriesOfEveryTraining() {
        return totalCaloriesOfIndoorTraining() + totalCaloriesOfOutdoorTraining();
    }

}


