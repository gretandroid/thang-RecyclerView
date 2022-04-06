package com.example.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder>{

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

    public static class CustomViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView1;
        TextView textView2;
        TextView textView3;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.text1);
            textView2 = itemView.findViewById(R.id.text2);
            textView3 = itemView.findViewById(R.id.text3);
            imageView= itemView.findViewById(R.id.imageView);
        }

        public TextView getTextView1() {
            return textView1;
        }

        public void setTextView1(TextView textView) {
            this.textView1 = textView;
        }

        public ImageView getImageView() {
            return imageView;
        }

        public void setImageView(ImageView imageView) {
            this.imageView = imageView;
        }

        public TextView getTextView2() {
            return textView2;
        }

        public void setTextView2(TextView textView2) {
            this.textView2 = textView2;
        }

        public TextView getTextView3() {
            return textView3;
        }

        public void setTextView3(TextView textView3) {
            this.textView3 = textView3;
        }
    }
}
