package com.example.teste;

//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;




public class ListaPresencaProfessor extends AppCompatActivity {

    private EditText pesquisa;
    private ArrayList<String> teste = new ArrayList<String>();
    private ListView lista;
    private Button busca;


    private void listar(String local){
        FirebaseFirestore db =FirebaseFirestore.getInstance();

        if(local.equals("")){

        }
        else{
            com.google.firebase.firestore.Query first = db.collection("/Turmas/"+local)
                    .limit(25);
            first.get()
                    .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                        @Override
                        public void onSuccess(QuerySnapshot documentSnapshots) {
                            DocumentSnapshot lastVisible = documentSnapshots.getDocuments()
                                    .get(documentSnapshots.size() -1);

                            Query next = db.collection("/Turmas/"+local)
                                    .orderBy("nome")
                                    .startAfter(lastVisible)
                                    .limit(25);
                        }
                    });
            first.addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(@Nullable QuerySnapshot value, @Nullable FirebaseFirestoreException error) {
                    for(QueryDocumentSnapshot querySnapshot: value){
                        if(querySnapshot==null){
                            teste.add("null");
                        }else{
                            String nome = (String) querySnapshot.getData().get("nome");
                            teste.add(nome);
                        }
                    }
                    ArrayAdapter<String> teste1 = new ArrayAdapter<String>(ListaPresencaProfessor.this, android.R.layout.simple_list_item_1,teste);
                    lista.setAdapter(teste1);
                }
            });
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_presenca_professor);
        pesquisa=findViewById(R.id.editPalavraProfessor);
        busca=findViewById(R.id.Buscar);
        lista = (ListView) findViewById(R.id.listVPesquisaProfessor);
        busca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String palavra=pesquisa.getText().toString();
                listar(palavra);
            }
        });
    }
}