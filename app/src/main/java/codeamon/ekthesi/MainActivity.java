package codeamon.ekthesi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

import codeamon.ekthesi.BL.JsonOperations;
import codeamon.ekthesi.Common.CategoryList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String json = new JsonOperations().categoryJson;
        try  {
            JSONObject jsonObj = new JSONObject(json);
            JSONArray jsonArray = jsonObj.optJSONArray("categoryList");
            for(int i=0; i < jsonArray.length(); i++){
                JSONObject jsonlistOnj = jsonArray.getJSONObject(i);

                int id = Integer.parseInt(jsonlistOnj.optString("Id").toString());
                int ProjectId = Integer.parseInt(jsonlistOnj.optString("ProjectId").toString());
                int MainCategoryId = Integer.parseInt(jsonlistOnj.optString("MainCategoryId").toString());
                String CategoryName = jsonlistOnj.optString("CategoryName").toString();
                int Type = Integer.parseInt(jsonlistOnj.optString("Type").toString());
                CategoryList categoryList = new CategoryList(id,ProjectId,MainCategoryId,CategoryName,Type);

            }

        }
        catch (JSONException ex){
            ex.printStackTrace();      }

    }

}
