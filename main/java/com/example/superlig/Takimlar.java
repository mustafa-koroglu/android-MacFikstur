package com.example.superlig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class Takimlar extends AppCompatActivity {
    ListView listView;
    ArrayList<Takim> takimlar=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takimlar);
        listView=findViewById(R.id.listView1);
        takimlar.add(new Takim("Başakşehir",R.drawable.basaks));
        takimlar.add(new Takim("Trabzonspor",R.drawable.ts));
        takimlar.add(new Takim("Galatasaray",R.drawable.gs));
        takimlar.add(new Takim("Sivasspor",R.drawable.sivas));
        takimlar.add(new Takim("Beşiktaş",R.drawable.besiktas));
        takimlar.add(new Takim("Alanyaspor",R.drawable.alanya));
        takimlar.add(new Takim("Fenerbahçe",R.drawable.fb));
        takimlar.add(new Takim("Göztepe",R.drawable.goztepe));
        takimlar.add(new Takim("Gaziantep",R.drawable.gaziantep));
        takimlar.add(new Takim("Denizlispor",R.drawable.denizlispor));
        takimlar.add(new Takim("Gençlerbirliği",R.drawable.gbirligi));
        takimlar.add(new Takim("Antalyaspor",R.drawable.antalya));
        takimlar.add(new Takim("Malatyaspor",R.drawable.malatya));
        takimlar.add(new Takim("Rizespor",R.drawable.rizespor));
        takimlar.add(new Takim("Konyaspor",R.drawable.konya));
        takimlar.add(new Takim("Kasımpaşa",R.drawable.kasimpasa));
        takimlar.add(new Takim("Ankaragücü",R.drawable.agucu));
        takimlar.add(new Takim("Kayserispor",R.drawable.kayseri));

        TakimAdapter takimAdapter= new TakimAdapter(takimlar, this);
        listView.setAdapter(takimAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent git= new Intent(Takimlar.this,Karsilasmalar.class);
                startActivity(git);
            }
        });



    }
}