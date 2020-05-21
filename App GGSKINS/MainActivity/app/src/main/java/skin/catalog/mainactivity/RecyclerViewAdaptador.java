package skin.catalog.mainactivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder>{

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView name,wear,caseitem,priceitem,marketitem;
        ImageView imgitem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name=(TextView)itemView.findViewById(R.id.itemname);
            wear =(TextView)itemView.findViewById(R.id.itemwear);
            caseitem=(TextView)itemView.findViewById(R.id.itemcase);
            priceitem=(TextView)itemView.findViewById(R.id.itemprice);
            marketitem=(TextView)itemView.findViewById(R.id.itemmarket);
            imgitem=(ImageView) itemView.findViewById(R.id.itemimg);

        }
    }

    public List<ItemModel> itemlista;

    public RecyclerViewAdaptador(List<ItemModel> itemlista) {
        this.itemlista = itemlista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.name.setText(itemlista.get(position).getName());
        holder.wear.setText(itemlista.get(position).getWear());
        holder.caseitem.setText(itemlista.get(position).getCaseitem());
        holder.priceitem.setText(itemlista.get(position).getPriceitem());
        holder.marketitem.setText(itemlista.get(position).getMarketitem());
        holder.imgitem.setImageResource(itemlista.get(position).getImgitem());
    }

    @Override
    public int getItemCount() {
        return itemlista.size();
    }
}
