package codeamon.ekthesi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahmetyildirim on 1.5.2016.
 */
public class ListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        RecyclerView view =(RecyclerView) findViewById(R.id.my_recycler_view);
        CategoryListAdapter adapter = new CategoryListAdapter();
        view.setHasFixedSize(true);
        view.setAdapter(adapter);
    }
   }
