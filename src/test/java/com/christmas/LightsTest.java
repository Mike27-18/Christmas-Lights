package com.christmas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

import java.beans.Transient;

public class LightsTest{
    @Test
    @Disabled
    void TurnOnLight(){
        Lights light = new Lights();
        light.TurnOn(CordinatePair.of(0, 0, 0, 0));
    }

    @Test
    void TurnOnAllLights(){
        Lights light = new Lights();
        light.TurnOn(CordinatePair.of(0, 0, 999, 999));
        for(int i = 0; i < 1000; i++){
            for(int j = 0; j < 1000; j++){
                assertEquals(light.getLight(i, j).isOn(), true);
            }
        }
    }
}
