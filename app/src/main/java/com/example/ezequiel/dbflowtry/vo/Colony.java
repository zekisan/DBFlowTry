package com.example.ezequiel.dbflowtry.vo;

import com.example.ezequiel.dbflowtry.model.DemoDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ModelContainer;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

@ModelContainer
@Table(database = DemoDatabase.class)
public class Colony extends BaseModel{

    @PrimaryKey(autoincrement = true)
    long id;

    @Column
    String name;

}
