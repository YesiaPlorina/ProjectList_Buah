package com.example.yesiaplorina.projectlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends BaseAdapter {

    //1.deklarasi

    Context context;
    String[] namabuah;
    int[] gambarbuah;

    //2.constructor

    public CustomListAdapter(Context context, String[] namabuah, int[] gambarbuah) {
        this.context = context;
        this.namabuah = namabuah;
        this.gambarbuah = gambarbuah;
    }

    @Override
    public int getCount() {
        return namabuah.length;
    }//jumlah data

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //a.sambungin layout item

        View itemView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);

        //b.deklarasi komponen yang ada di layout item

        TextView tvNama = itemView.findViewById(R.id.item_nama);

        ImageView ivGambar = itemView.findViewById(R.id.item_gambar);

        //c.set data di masing2 komponen

        tvNama.setText(namabuah[position]);
        ivGambar.setImageResource(gambarbuah[position]);



        return itemView;
    }
}
