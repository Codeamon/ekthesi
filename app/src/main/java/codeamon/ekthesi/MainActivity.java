package codeamon.ekthesi;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import codeamon.ekthesi.Adapters.CategoryListAdapter;
import codeamon.ekthesi.BL.JsonOperations;
import codeamon.ekthesi.Model.Category;

public class MainActivity extends AppCompatActivity {

    private RecyclerView listView;
    private ProgressDialog pDialog;
    private CategoryListAdapter adapter;
    ArrayList<Category> categoryList = new ArrayList<Category>();

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
                Category category = new Category(CategoryName,CategoryName,id,MainCategoryId,Type);
                categoryList.add(category);
            }

        }
        catch (JSONException ex){
            ex.printStackTrace();      }
        listView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new CategoryListAdapter(this, categoryList);
        listView.setAdapter(adapter);


    }

}
