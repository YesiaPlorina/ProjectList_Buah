package com.example.yesiaplorina.projectlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomPagerAdapter extends PagerAdapter {

    //1.deklarasi

    Context context;
    String[] namabuah;
    int[] gambarbuah;

    //2.constructor

    public CustomPagerAdapter(Context context, String[] namabuah, int[] gambarbuah) {
        this.context = context;
        this.namabuah = namabuah;
        this.gambarbuah = gambarbuah;
    }

    @Override
    public int getCount() {
        return namabuah.length;
    }//jumlah data

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (LinearLayout) o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        //a.sambungin layout item

        View itemView = LayoutInflater.from(context).inflate(R.layout.pager_item, container, false);

        //b.deklarasi komponen yang ada di layout item

        TextView tvNama = itemView.findViewById(R.id.item_nama);

        ImageView ivGambar = itemView.findViewById(R.id.item_gambar);

        //c.set data di masing2 komponen

        tvNama.setText(namabuah[position]);
        ivGambar.setImageResource(gambarbuah[position]);

        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
