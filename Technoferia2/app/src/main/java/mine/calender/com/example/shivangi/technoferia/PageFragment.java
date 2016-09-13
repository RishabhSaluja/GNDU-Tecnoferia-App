package mine.calender.com.example.shivangi.technoferia;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SHIVANGI on 3/15/2016.
 */
public class PageFragment extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";
RecyclerView recyclerView;
    public int mPage;
    public Adapter adapter;

    public static PageFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        PageFragment fragment = new PageFragment();
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
        View view = inflater.inflate(R.layout.fragment_page, container, false);
        recyclerView=(RecyclerView)view.findViewById(R.id.tvTitle);
       // TextView tvTitle = (TextView) view.findViewById(R.id.tvTitle);
       // tvTitle.setText("Fragment #" + mPage);
        if(mPage==1)
        adapter=new Adapter(getActivity(),getData1(),1);
if(mPage==2)
adapter=new Adapter(getActivity(),getData2(),2);
        if(mPage==3)
            adapter=new Adapter(getActivity(),getData3(),3);
        if(mPage==4)
            adapter=new Adapter(getActivity(),getData4(),4);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }
    public static List<Information> getData1()
    {
        int icon=R.drawable.arrow;

        List<Information> data=new ArrayList<>();
        String text[]={"Scavenger Hunt",
        "Roadies",
        "Cine-Rush","Master Chef",
        "Takeshi's Castle",
                "Logic Marathon",
                "Tumse Na Ho Paayega",
                "Rangoli Making",
                "A Minute Waltz",
                "Calli Sketch",
                "Attrangi Yaari",
                "Eye Candy",
                "Sticky Wicket",
                "Devil Follow",
                "Fun Football",
                "Fun With Balloons",
                "Treasure Hunt",
                "Snap Shot",
                "LAN Gaming",
                "Junkyard",
                "Slow bike racing",
                "IPL Auction",
                "Uncork The Cork",
                "Brain Vita",
                "Memorize",
        "Beat The Clock"
        };
        for (int i=0;i<text.length;i++)
        {
            Information current=new Information();
            current.title=text[i];
            current.id=icon;
            data.add(current);
        }
        return data;
    }
    public static List<Information> getData2()
    {
        int icon=R.drawable.arrow;

        List<Information> data=new ArrayList<>();
        String text[]={"Code Hunt",
        "Switch Coding",
        "Blind Code",
        "Pseudo Code",
        "Typing Warrior",
        "Jugaad",
        "Para Jumbled Coding",
        "Code mania",
        "Code Marathon",
        "Code Circuit",        "Kreativ(Graphic Design)",
        "Shortcut",
        "Code Tadka", "Electro Code"};
        for (int i=0;i<text.length;i++)
        {
            Information current=new Information();
            current.title=text[i];
            current.id=icon;
            data.add(current);
        }
        return data;
    }
    public static List<Information> getData3()
    {
        int icon=R.drawable.arrow;

        List<Information> data=new ArrayList<>();
        String text[]={ "Rally Race",
        "Electrovision",
        "Circuitrix",
        "Robo Soccer",
        "Electro Puzzle",
        "Junkyard",
        "Line Follower",
        "Electro Antakshari",
        "What an Idea"};

        for (int i=0;i<text.length;i++)
        {
            Information current=new Information();
            current.title=text[i];
            current.id=icon;
            data.add(current);
        }
        return data;
    }
    public static List<Information> getData4()
    {
        int icon=R.drawable.arrow;

        List<Information> data=new ArrayList<>();
        String text[]={ "En Vogue- The Fashion Show",
        "Jodi Kamaal Di",
        "Suraan Di Saanjh",
        "Dance Alley","Instrument Playing",
        "GNDU Best Dramebaaz"};
        for (int i=0;i<text.length;i++)
        {
            Information current=new Information();
            current.title=text[i];
            current.id=icon;
            data.add(current);
        }
        return data;
    }
}
