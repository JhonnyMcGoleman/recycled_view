package com.example.recycled_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptador_Titulares extends RecyclerView.Adapter<Adaptador_Titulares.TitularesViewHolder> /*implements View.OnClickListener*/{

    private ArrayList<Titular> datos;
    private View.OnClickListener listener;

    public void setOnClickListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    public Adaptador_Titulares(ArrayList<Titular> datos) {
        this.datos = datos;
    }


    public static class TitularesViewHolder extends RecyclerView.ViewHolder{
        private TextView txtTitulo;
        private TextView txtsubTitulo;
        private TextView txttelefono;

        public TitularesViewHolder(View itemView){
            super(itemView);
            this.txtTitulo=itemView.findViewById(R.id.titulo);
            this.txtsubTitulo=itemView.findViewById(R.id.subtitulo);
            this.txttelefono=itemView.findViewById(R.id.telefono);
        }

        public void bindTitular(Titular titular){
            txtTitulo.setText(titular.getTitulo());
            txtsubTitulo.setText(titular.getSubtitulo());
            txttelefono.setText(titular.getTelefono());
        }
    }

    @Override

    public TitularesViewHolder onCreateViewHolder(ViewGroup viewGroup,int viewType){
        View itemView= LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_component,viewGroup,false);
        TitularesViewHolder tvh=new TitularesViewHolder(itemView);
        return tvh;
    }

    @Override
    public void onBindViewHolder(@NonNull TitularesViewHolder holder,int position){
        Titular titular=datos.get(position);
        holder.bindTitular(titular);
    }
    public int getItemCount(){
        return datos.size();
    }

}
