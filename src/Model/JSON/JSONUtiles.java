package Model.JSON;

import org.json.JSONArray;

import java.io.FileWriter;
import java.io.IOException;

public class JSONUtiles {


    public static void save (JSONArray jsonArray, String name)
    {

        try {
            FileWriter f = new FileWriter(name + ".json");
        f.write(jsonArray.toString());
        f.flush();
        f.close();}
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
