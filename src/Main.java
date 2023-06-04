import Model.Classes.*;
import Model.Enum.Resistance;
import Model.Enum.Type;
import Model.Exceptions.NoLogicalDatesException;
import Model.JSON.JSONController;

import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {
    public static void main(String[] args){



        Ciclist ciclist = new Ciclist("Axel Do", 95, 189.9, "Argentina");
        Training t1 = new IndoorTraining( 123, Resistance.ELASTICS, Type.RUNNING);
        Training t3 = new IndoorTraining( 13, Resistance.DUMBELLS, Type.CROSSFIT);
        Training t4 = new IndoorTraining( 1, Resistance.RUSSIAN_DUMBELLS, Type.SWIMMING);
        JSONController jsonController = new JSONController();
        try {
            Training t2 = new OutdoorTraining("A long hike through the hills","11:20:23", "12:34:23", 23.34);
            TrainingList list = new TrainingList();
            list.addElement(t1);
            list.addElement(t2);
            list.addElement(t3);
            list.addElement(t4);
            jsonController.createJson(list,"Training List");

        }
        catch (NoLogicalDatesException e)
        {
            e.getStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }







    }
}