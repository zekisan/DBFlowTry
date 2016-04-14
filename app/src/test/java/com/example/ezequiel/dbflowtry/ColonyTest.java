package com.example.ezequiel.dbflowtry;

import com.example.ezequiel.dbflowtry.util.ValidationFailException;
import com.example.ezequiel.dbflowtry.vo.Colony;

import org.junit.Test;

public class ColonyTest {

    @Test
    public void validColony(){
        Colony colony = new Colony();
        colony.setName("Nova Colônia");
        colony.validate();
    }

    @Test(expected = ValidationFailException.class)
    public void colonyWithNullName(){
        Colony colony = new Colony();
        colony.setName(null);
        colony.validate();
    }
}
