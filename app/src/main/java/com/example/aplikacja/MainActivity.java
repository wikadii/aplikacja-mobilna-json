package com.example.aplikacja;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroupQuestions;
    RadioButton radioButtonA, radioButtonB, radioButtonC;
    Button buttonNext;
    TextView textViewQuestionContent;
    ArrayList<Question> questionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        radioGroupQuestions = findViewById(R.id.radioGroup);

        radioButtonA = findViewById(R.id.radioButton);
        radioButtonB = findViewById(R.id.radioButton2);
        radioButtonC = findViewById(R.id.radioButton3);

        buttonNext = findViewById(R.id.button);

        textViewQuestionContent = findViewById(R.id.textViewQuestion);

    }
}
//json validator
//public repozytorium
//nowy plik db.json w repozytorium (nowym)
//https://my-json-server.typicode.com/wikadii/nazwa_repo
//aplikacja w android studio
//dodac dependencies     implementation("com.squareup.retrofit2:retrofit:2.9.0")
//    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
//dodac do manifestu nad <application>    <uses-permission android:name="android.permission.INTERNET"/>

