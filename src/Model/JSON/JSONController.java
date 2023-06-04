package Model.JSON;

import Model.Classes.IndoorTraining;
import Model.Classes.OutdoorTraining;
import Model.Classes.Training;
import Model.Classes.TrainingList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONController {

    public void createJson (TrainingList trainingList, String name)
    {
        JSONArray jsonArray = new JSONArray();

        try {
            JSONArray arrayOutdoor = new JSONArray();
            JSONArray arrayIndoor = new JSONArray();
            for (Object t : trainingList.getTrainingList()) {
                JSONObject jsonObject = new JSONObject();
                if (t instanceof Training) {
                    jsonObject.put("Total Calories", ((Training) t).getTotalCalories());
                    if(t instanceof IndoorTraining)
                    {
                        jsonObject.put("Class", "Indoor Training");
                        jsonObject.put("type", ((IndoorTraining) t).getType());
                        jsonObject.put("minutes trained", ((IndoorTraining) t).getMinutesTrained());
                        jsonObject.put("Resistance used", ((IndoorTraining) t).getResistance().toString());
                        arrayIndoor.put(jsonObject);

                    }
                    else if(t instanceof OutdoorTraining)
                    {
                        jsonObject.put("Class", "Outdoor Training");
                        jsonObject.put("type",((OutdoorTraining) t).getDescriptiveName());
                        jsonObject.put("Begining", ((OutdoorTraining) t).getBeginning().toString());
                        jsonObject.put("Ending", ((OutdoorTraining) t).getEnding());
                        jsonObject.put("kilometers done", ((OutdoorTraining) t).getKm());
                        arrayOutdoor.put(jsonObject);
                    }

                }
            }
            jsonArray.put(arrayIndoor);
            jsonArray.put(arrayOutdoor);
            JSONUtiles.save(jsonArray,"Training File");
        }

        catch (JSONException e)
        {
            e.getCause();
        }
    }


}
