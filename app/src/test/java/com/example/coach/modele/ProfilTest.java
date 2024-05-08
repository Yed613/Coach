package com.example.coach.modele;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProfilTest {
    // création d'un profil de test : femme 67kg 1m65 35ans
    private Profil profil = new Profil(67,35,0,165);
    // img correspondant
    private float img = (float)32.2;
    //message correspondant
    private String message = "trop élevé";

    @Test
    public void getImg() {
        assertEquals(img, profil.getImg(), (float)0.1);
    }
    @Test
    public void getMessage() {
        assertEquals(message, profil.getMessage());
    }
}