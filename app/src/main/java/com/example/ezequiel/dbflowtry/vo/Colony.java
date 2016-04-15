package com.example.ezequiel.dbflowtry.vo;

import com.example.ezequiel.dbflowtry.model.DemoDatabase;
import com.example.ezequiel.dbflowtry.util.Validation;
import com.example.ezequiel.dbflowtry.util.ValidationFailException;
import com.raizlabs.android.dbflow.StringUtils;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ModelContainer;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

@ModelContainer
@Table(database = DemoDatabase.class)
public class Colony extends BaseModel implements Validation {

    // region Members

    @PrimaryKey(autoincrement = true)
    long id;

    @Column
    String name;

    // endregion Members

    // region Accessors

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // endregion Accessors

    //region Inherited Methods
    @Override
    public void validate() {
        if(!StringUtils.isNotNullOrEmpty(name)){
            throw new ValidationFailException("Nome da Colônia não pode ser nulo.");
        }
    }
    //endregion
}
