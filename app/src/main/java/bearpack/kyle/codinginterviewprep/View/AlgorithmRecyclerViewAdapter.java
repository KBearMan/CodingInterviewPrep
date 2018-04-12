package bearpack.kyle.codinginterviewprep.View;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import bearpack.kyle.codinginterviewprep.Model.Algorithm;
import bearpack.kyle.codinginterviewprep.R;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Shiva on 3/15/2018.
 */

public class AlgorithmRecyclerViewAdapter extends RecyclerView.Adapter<AlgorithmRecyclerViewAdapter.AlgorithmViewHolder>
{
    private List<Algorithm> algorithmList;
    private View.OnClickListener clickListener;

    public AlgorithmRecyclerViewAdapter(List<Algorithm> algorithmList, View.OnClickListener clickListener)
    {
        this.algorithmList = algorithmList;
        this.clickListener = clickListener;
    }


    @NonNull
    @Override
    public AlgorithmViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        return new AlgorithmViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_list_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AlgorithmViewHolder holder, int position)
    {
        Algorithm algorithm = algorithmList.get(position);
        holder.name.setText(algorithm.getAlgoName());
        holder.bigOValue.setText(algorithm.getBig_o());
       // holder.icon.setImageResource(Integer.parseInt(algorithm.getImageSRC()));
        holder.itemView.setTag(algorithm);
        holder.itemView.setOnClickListener(clickListener);
    }

    @Override
    public int getItemCount()
    {
        return algorithmList.size();
    }

    public void addItems(List<Algorithm> algoList) {
        this.algorithmList.addAll(algoList);
        notifyDataSetChanged();
    }

    public void addItem(Algorithm algo) {
        this.algorithmList.add(algo);
        notifyDataSetChanged();
    }

    static class AlgorithmViewHolder extends RecyclerView.ViewHolder
    {
    @BindView(R.id.rec_view_item_name) TextView name;
    @BindView(R.id.rec_view_item_trait_label) TextView bigOLabel;
    @BindView(R.id.rec_view_item_trait_value) TextView bigOValue;
    @BindView(R.id.rec_view_item_icon) ImageView icon;

        public AlgorithmViewHolder(View itemView)
        {
            super(itemView);
            ButterKnife.bind(this,itemView);
            bigOLabel.setText("Worst Case Big O:");
        }
    }
}
