package com.christmas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

import java.beans.Transient;

public class LightsTest{
    @Test
    void TurnOnLight(){
        Lights light = new Lights();
        light.TurnOnLights();
    }

    @Test
    void TurnOnAllLights(){
        Lights light = new Lights();
        light.TurnOnLights(CordinatePair(0, 0, 999, 999));
        for(int i = 0; i < 1000; i++){
            for(int j = 0; j < 1000; j++){
                assertThat(light.getLight(i, j).isOn, is(true));
            }
        }
    }
}
