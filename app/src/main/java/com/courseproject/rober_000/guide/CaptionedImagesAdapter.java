package com.courseproject.rober_000.guide;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class CaptionedImagesAdapter extends RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder> {

    private String captions[];
    private String descriptions[];
    private String imgLinks[];
    private Listener listener;

    public static interface Listener{
        public void onClick(int position);
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;

        public ViewHolder(CardView view) {
            super(view);
            cardView = view;
        }
    }

    @Override
    public CaptionedImagesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView cardView = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_caption_image, parent, false);
        return new ViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        CardView cardView = holder.cardView;
        ImageView imageView = (ImageView) cardView.findViewById(R.id.info_img);
        Picasso.with(cardView.getContext())
                .load(imgLinks[position])
                .placeholder(R.drawable.graph)
                .into(imageView);
        imageView.setContentDescription(captions[position]);
        TextView captionView = (TextView) cardView.findViewById(R.id.caption_txt);
        captionView.setText(captions[position]);
        TextView textView = (TextView) cardView.findViewById(R.id.description_txt);
        textView.setText(descriptions[position]);
        cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (listener != null) {
                    listener.onClick(position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return captions.length;

    }

    public CaptionedImagesAdapter(String captions[], String descriptions[], String imgLinks[]) {
        this.captions = captions;
        this.descriptions = descriptions;
        this.imgLinks = imgLinks;
    }
}