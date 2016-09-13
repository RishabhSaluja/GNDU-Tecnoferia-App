package mine.calender.com.example.shivangi.technoferia;

import android.graphics.Matrix;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FragmentSchedule extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";
    public int mPage;
    private TouchImageView img;

    public static FragmentSchedule newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        FragmentSchedule fragment = new FragmentSchedule();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);

    }


    // Inflate the fragment layout we defined above for this fragment
    // Set the associated text for the title
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_schedule, container, false);

        img = (TouchImageView) view.findViewById(R.id.scheduleimg);

        if(mPage == 1){
            img.setImageResource(R.drawable.img1);
        }
        else if(mPage == 2){
            img.setImageResource(R.drawable.img2);
        }
        else if(mPage == 3){
            img.setImageResource(R.drawable.img3);
        }
        return view;
    }
}