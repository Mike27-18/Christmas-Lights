package com.christmas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.beans.Transient;

public class LightsTest{
    @Test
    void TurnOnLight(){
        Lights light = new Lights();
        light.TurnOnLight();
    }

}
