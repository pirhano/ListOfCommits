package ma.chanlenge.listofcommits;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by hichambagui on 2016-05-02.
 */
public class AdapterView extends RecyclerView.Adapter<AdapterView.MyHolderView> {

    public List<MyCommitsFormat> commitsFormatList;

    @Override
    public MyHolderView onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_item_view,parent,false);

        return new MyHolderView(view);
    }

    @Override
    public void onBindViewHolder(MyHolderView holder, int position) {
        MyCommitsFormat myCommitsFormat = commitsFormatList.get(position);
        holder.nameCommiter.setText(myCommitsFormat.getName());
        holder.commit.setText(myCommitsFormat.getCommits());
        holder.message.setText(myCommitsFormat.getMessage());
        holder.date.setText(myCommitsFormat.getDatetime());

    }

    public AdapterView(List<MyCommitsFormat> myCommitsFormatList){
        commitsFormatList = myCommitsFormatList;
    }

    @Override
    public int getItemCount() {
        return commitsFormatList.size();
    }

    public class MyHolderView extends RecyclerView.ViewHolder{

        public TextView nameCommiter,commit,message,date;

        public MyHolderView(View itemView) {
            super(itemView);
            nameCommiter = (TextView) itemView.findViewById(R.id.name);
            commit = (TextView) itemView.findViewById(R.id.commit);
            message = (TextView) itemView.findViewById(R.id.message);
            date = (TextView) itemView.findViewById(R.id.datetime);
        }
    }
}
