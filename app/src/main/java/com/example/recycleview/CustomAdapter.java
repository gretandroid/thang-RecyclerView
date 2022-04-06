package com.example.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder>{

    // faux données que on veut afficher dans RecyclerView
    String[] list ;

    public CustomAdapter(String[] list) {
        this.list = list;
    }

    // cette methode va creer la view à partir de row.xml et va permetre
    // instancier la view holder avec cette vue
    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // LayoutInflater permetre de creer (inflater) des views correspondants
        // aux fichiers xml
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row, parent, false);
        return new CustomViewHolder(view);
    }

    /**
     * Cette methode va permetre de renseigner le text view avec une valeur
     * qui provient de la liste définie plus haut
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.getTextView1().setText(list[position]);
        holder.getTextView2().setText(list[position]);
        holder.getTextView3().setText(list[position]);
        holder.getImageView().setImageResource(R.drawable.ic_launcher_background);
    }

    /**
     * Le cyclerView a besoin de connaitre le nombre d'élément à traiter
     * @return
     */
    @Override
    public int getItemCount() {
        return list.length;
    }
}
