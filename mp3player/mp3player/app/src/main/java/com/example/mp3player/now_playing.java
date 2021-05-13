package com.example.mp3player;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class now_playing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // Create an ArrayList of Song objects
        ArrayList<Song> Songs = new ArrayList<>();
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

        ImageButton nextSong = findViewById(R.id.next_button);
        TextView songName = findViewById(R.id.song_name);
        TextView artistName = findViewById(R.id.artist_name);
        ImageView albumArt = findViewById(R.id.now_playing_image);

        nextSong.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the now playing View is clicked on.
            @Override
            public void onClick(View view) {

            }
        });
    }
}