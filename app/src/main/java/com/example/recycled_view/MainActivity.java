package com.example.recycled_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recy;
    private ArrayList<Titular> datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recy=findViewById(R.id.recy);
        datos=new ArrayList<Titular>();
        for(int i=0;i<50;i++){
            datos.add(new Titular("Nombre "+i," Apellido "+i,"Telefono:"+i));
        }

        Adaptador_Titulares adaptador_titulares=new Adaptador_Titulares(datos);
        recy.setHasFixedSize(true);
        recy.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recy.setLayoutManager(new GridLayoutManager(this,2));
        recy.setAdapter(adaptador_titulares);
      adaptador_titulares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Mi App","Pulsado el elemento"+recy.getChildAdapterPosition(v));
            }
        });
    }
}