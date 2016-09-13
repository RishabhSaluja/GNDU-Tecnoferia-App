package mine.calender.com.example.shivangi.technoferia;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by SHIVANGI on 3/16/2016.
 */
public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private  LayoutInflater inflater;
    List<Information> data= Collections.emptyList();
    Context con;
    public int pan;
    public Adapter(Context context, List<Information> data,int page)
    {con=context;
        pan=page;
        inflater=LayoutInflater.from(context);
        this.data=data;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= inflater.inflate(R.layout.custom_row, parent, false);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        Information current=data.get(position);

        holder.text.setText(current.title);
        holder.icon.setImageResource(current.id);
        holder.text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(con, Details.class);
                intent.putExtra("page", pan);
                intent.putExtra("position", position);

                con.startActivity(intent);
            }
        });
        holder.icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(con,Details.class);
                intent.putExtra("page",pan);
                intent.putExtra("position",position);

                con.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView text;
        ImageView icon;

        public MyViewHolder(View itemView) {

            super(itemView);

            text=(TextView)itemView.findViewById(R.id.groupname);
            icon=(ImageView)itemView.findViewById(R.id.arr);
        }
    }
}
