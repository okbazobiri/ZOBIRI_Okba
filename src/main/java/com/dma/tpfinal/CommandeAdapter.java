package com.dma.tpfinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/*public class CommandeAdapter extends RecyclerView.Adapter<CommandeAdapter.ViewHolder> {
    Context context;
    list<Achat> achatlist;

    public CommandeAdapter(Context context, list<Achat> achatlist) {
        this.context = context;
        this.achatlist = achatlist;
    }

    public void setAchatlist(list<Achat> achatlist) {
        this.achatlist = achatlist;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CommandeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.item_liste,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CommandeAdapter.ViewHolder holder, int position) {
        holder.num_commande.setText(achatlist.get(position).getNom());
        holder.commande.setText(achatlist.get(position).getNumero());
        holder.date.setText(achatlist.get(position).getNumero());
    }

    @Override
    public int getItemCount() {
        if(achatlist!=null) return achatlist.size();
        return 0;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView num_commande;
        TextView commande;
        TextView date;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            num_commande=itemView.findViewById(R.id.et_num_commande);
            commande=itemView.findViewById(R.id.et_commande);
            date=itemView.findViewById(R.id.et_date_commande);
        }
    }
}*/
