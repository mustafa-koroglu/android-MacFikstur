package com.example.superlig;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Karsilasmalar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karsilasmalar);

        RecyclerView recyclerView=findViewById(R.id.recylerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        
        KarsilasmalarData[] karsilasmalarData= new KarsilasmalarData[]{
                new KarsilasmalarData("Başaksehir Başakşehir Fatih Terim Stadyumu","Trabzonspor Şenol Güneş Stadyumu","26.12.2020 Saat:19.00",R.drawable.basaks,R.drawable.ts),
                new KarsilasmalarData("Galatasaray Türk Telekom Stadyumu","Sivasspor Sivas 4 Eylül Stadyumu","25.12.2020 Saat:20.00",R.drawable.gs,R.drawable.sivas),
                new KarsilasmalarData("Beşiktaş Bjk İnönü Stadyumu","Aytemiz Alanyaspor Bahçeşehir Okulları Stadyumu","27.12.2020 Saat:21.45",R.drawable.besiktas,R.drawable.alanya),
                new KarsilasmalarData("Fenerbahçe Şükrü Saraçoğlu Stadyumu","Göztepe İzmir Atatürk Stadyumu","27.12.2020 Saat:20.00",R.drawable.fb,R.drawable.goztepe),
                new KarsilasmalarData("Gaziantep Gaziantep Stadyumu","Denizlispor Denizli Atatürk Stadyumu","26.12.2020 Saat:17.00",R.drawable.gaziantep,R.drawable.denizlispor),
                new KarsilasmalarData("Gençlerbirliği Eryaman Stadyumu","Antalyaspor Antalya Stadyumu","25.12.2020 Saat:20.00",R.drawable.gbirligi,R.drawable.antalya),
                new KarsilasmalarData("Malatyaspor Malatya Stadyumu","Rizespor Didi Stadyumu","26.12.2020 Saat:21.00",R.drawable.malatya,R.drawable.rizespor),
                new KarsilasmalarData("Konyaspor KonyaBB Stadyumu","Kasımpaşa RTE Stadyumu","27.12.2020 Saat:21.45",R.drawable.konya,R.drawable.kasimpasa),
                new KarsilasmalarData("Ankaragücü Eryaman Stadyumu","Kayserispor KadirHas Stadyumu ","25.12.2020 Saat:19.00",R.drawable.agucu,R.drawable.kayseri)

        };

        KarsilasmalarAdapter karsilasmalarAdapter= new KarsilasmalarAdapter(karsilasmalarData,Karsilasmalar.this);
        recyclerView.setAdapter(karsilasmalarAdapter);

    }
}