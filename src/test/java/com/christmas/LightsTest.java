package com.chirstmas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.beans.Transient;

class LightsTest{
    @Test
    void TurnOnLight(){
        Lights light = new Lights();
        light.TurnOnLight(1);
    }

}
