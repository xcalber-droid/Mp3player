package com.example.mp3player;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_listview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        // Create an ArrayList of Song objects
        ArrayList<Song> Songs = new ArrayList<Song>();
        Songs.add(new Song("Ikk Pal", "Ammy Virk", R.drawable.ikk_pal));
        Songs.add(new Song("Beparwaiyan", "Jaz Dhami", R.drawable.beparwaiyan));
        Songs.add(new Song("Bol Do Na Zara", "Emraar Fakhri  ", R.drawable.bol_do_na_zara));
        Songs.add(new Song("Hamdard", "Arijit Singh", R.drawable.hamdard));
        Songs.add(new Song("Is Pyar Se Meri Taraf Na Dekho", " Alka Yagnik", R.drawable.is_pyar_se_meri_taraf_na_dekho));
        Songs.add(new Song("Sohne Lagde", "Sidhu Moose Wala", R.drawable.sohne_lagde));
        Songs.add(new Song("Tere Bagair ", "Amrinder Gill", R.drawable.tere_bagair));
        Songs.add(new Song("Phir Bhi Tumko Chaahunga", "Arijit Singh", R.drawable.phir_bhi_tumko_chaahunga));
        Songs.add(new Song("Sahan To Pyariya", "Garry Sandhu", R.drawable.sahan_to_pyariya));
        Songs.add(new Song("Ae Dil Hai Mushkil", "Pritam", R.drawable.ae_dil_hai_mushkil));

        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter songAdapter = new SongAdapter(this, Songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_song);
        listView.setAdapter(songAdapter);
    }
}