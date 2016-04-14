package com.example.ezequiel.dbflowtry.vo;

import com.example.ezequiel.dbflowtry.model.DemoDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ForeignKey;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.structure.BaseModel;
import com.raizlabs.android.dbflow.structure.container.ForeignKeyContainer;

@Table(database = DemoDatabase.class)
public class Ant extends BaseModel{

    @PrimaryKey(autoincrement = true)
    long id;

    @Column
    String type;

    @Column
    boolean isMale;

    // The container will lazy load the relationship and only run the query on DB for the Queen when we call toModel()
    @ForeignKey(saveForeignKeyModel = false)
    ForeignKeyContainer<Queen> queenForeignKeyContainer;

    // Example of setting the model for the queen
    public void associateQueen(Queen queen){
        queenForeignKeyContainer = FlowManager.getContainerAdapter(Queen.class).toForeignKeyContainer(queen);
    }



}
