package codeamon.ekthesi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ahmetyildirim on 1.5.2016.
 */
public class CategoryListAdapter  extends RecyclerView.Adapter<CategoryListAdapter.ViewHolder> {
    // Set numbers of List in RecyclerView.
    private static final int LENGTH = 18;

    public CategoryListAdapter() {
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()), parent);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // no-op
    }

    @Override
    public int getItemCount() {
        return LENGTH;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

                public ViewHolder(LayoutInflater inflater, ViewGroup parent) {
                    super(inflater.inflate(R.layout.item_list, parent, false));
                    itemView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Context context = v.getContext();
                            Intent intent = new Intent(context, ListActivity.class);
                            context.startActivity(intent);
                        }
                    });
        }
    }



}
