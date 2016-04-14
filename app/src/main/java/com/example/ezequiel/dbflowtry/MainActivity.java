package com.example.ezequiel.dbflowtry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ezequiel.dbflowtry.vo.Colony;
import com.raizlabs.android.dbflow.sql.language.Select;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Colony> colonyList = new Select().from(Colony.class).queryList();
        if (colonyList == null || colonyList.isEmpty()){
            Colony colony = new Colony();
            colony.setName("Primeira Colônia");
            colony.save();
        }
    }
}
