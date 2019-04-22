package indonesia.angarsalabs.dynamickeyjson;

import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Angarsa Labs...!
 * Created by Angga on 4/22/2019.
 */
public class ModelDataGSON {
    private List<ModelData> modelDataList = new ArrayList<>();

    List<ModelData> getModelDataList(){
        Gson gson = new Gson();

        /*
            Karena ini

            {
                string : string
                string : string
                string : string
                string : string
                ...
            }

            maka kita buat  -->  Map<String,String>
         */

        // * wajib tambahkan ini.  -->    Type mapType = new TypeToken< ... >()  {}.getType()
        Type mapType = new TypeToken<Map<String, String>>() {}.getType();

        // * Kita Parsing
        // * gson.fromJson(String, mapType) . disini string nya dapat dari   -->   new test().file
        Map<String, String> map = gson.fromJson(new test().file, mapType);

        // * karena  -->      Map<key, map.get(key)>
        for(String key : map.keySet()){
            ModelData modelData = new ModelData();
            modelData.setKode(key);
            modelData.setNama(map.get(key));

            modelDataList.add(modelData);
        }

        return  modelDataList;
    }
}
