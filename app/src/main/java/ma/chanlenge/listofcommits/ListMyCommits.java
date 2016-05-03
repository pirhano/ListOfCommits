package ma.chanlenge.listofcommits;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ListMyCommits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_my_commits);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.myrecyclerView);

        List<MyCommitsFormat> myCommitsFormatList = new ArrayList<>();

        myCommitsFormatList.add(new MyCommitsFormat("a","a","s","s","s"));

        AdapterView mAdapter = new AdapterView(myCommitsFormatList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

    }
}
