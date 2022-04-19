package br.atividade.recycleview.marcos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DogsAdapter extends RecyclerView.Adapter<DogsAdapter.ViewHolder> {

    private List<Dogs> dogList;

    public DogsAdapter(List<Dogs> dogList) {
        this.dogList = dogList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dogs_rows, parent, false);

        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Dogs dog = this.dogList.get(position);
        holder.bind(dog);

    }

    @Override
    public int getItemCount() {
        return this.dogList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(br.atividade.recycleview.marcos.Dogs dog) {
            TextView txtName = itemView.findViewById(R.id.txt_dogs_name);
            TextView txtRace = itemView.findViewById(R.id.txt_dogs_race);
            TextView txtAge = itemView.findViewById(R.id.txt_dogs_age);
            TextView txtColor = itemView.findViewById(R.id.txt_dogs_color);
            LinearLayout linearLayout = itemView.findViewById(R.id.dogs_item);

            txtName.setText(dog.getName());
            txtRace.setText(dog.getRace());
            txtAge.setText(dog.getAge());
            txtColor.setText(dog.getColor());
            linearLayout.setBackgroundResource(dog.getBackgroundColor());
        }
    }
}
