package com.example.recycleview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder{

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
