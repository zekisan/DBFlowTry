package com.example.ezequiel.dbflowtry.vo;

import com.example.ezequiel.dbflowtry.model.DemoDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ForeignKey;
import com.raizlabs.android.dbflow.annotation.ModelContainer;
import com.raizlabs.android.dbflow.annotation.OneToMany;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.sql.language.SQLite;
import com.raizlabs.android.dbflow.structure.BaseModel;

import java.util.List;

@ModelContainer
@Table(database = DemoDatabase.class)
public class Queen extends BaseModel{

    //region Members
    @PrimaryKey(autoincrement = true)
    long id;

    @Column
    String name;

    @Column
    @ForeignKey(saveForeignKeyModel = false)
    Colony colony;

    List<Ant> ants;
    //endregion

    //region Methods
    @OneToMany(methods = { OneToMany.Method.SAVE, OneToMany.Method.DELETE }, variableName = "ants")
    public List getMyAnts() {
        if(ants == null || ants.isEmpty()){
            ants = SQLite.select()
                    .from(Ant.class)
                    .where(Ant_Table.queenForeignKeyContainer_id.eq(id))
                    .queryList();
        }
        return ants;
    }
    //endregion
}
