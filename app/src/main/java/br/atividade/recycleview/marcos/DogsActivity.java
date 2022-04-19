package br.atividade.recycleview.marcos;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;


public class DogsActivity extends AppCompatActivity {

    RecyclerView rvDisciplines;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogs);

        rvDisciplines = findViewById(R.id.rv_dogs);
        rvDisciplines.setLayoutManager(new LinearLayoutManager(this));

        List<Dogs> dogs = new ArrayList<>();
        dogs.add(new br.atividade.recycleview.marcos.Dogs("Rex", "5", "Pastor belga", "Cinza" , R.color.gray));
        dogs.add(new br.atividade.recycleview.marcos.Dogs("Tobias", "3", "Chow chow",  "Cinza" ,R.color.gray));
        dogs.add(new br.atividade.recycleview.marcos.Dogs("Mel", "6", "Fila brasileiro", "Marrom" ,R.color.brown));
        dogs.add(new br.atividade.recycleview.marcos.Dogs("Mia", "4", "Golden Retriever", "Amarelo" ,R.color.yellow));
        dogs.add(new br.atividade.recycleview.marcos.Dogs("Luna", "5", "Husky", "Cinza" ,R.color.gray));

        DogsAdapter adapter = new DogsAdapter(dogs);

        rvDisciplines.setAdapter(adapter);
    }
}