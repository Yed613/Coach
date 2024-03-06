package com.example.coach.modele;

public class Profil {
    // constantes
    private static final Integer minFemme = 15;
    private static final Integer maxFemme = 30;
    private static final Integer minHomme = 10;
    private static final Integer maxHomme = 25;
    private Integer poids;
    private Integer age;
    private Integer sexe;
    private Integer taille;
    private float img = 0;
    private String message = "";

    public Profil(Integer poids, Integer age, Integer sexe, Integer taille) {
        this.poids = poids;
        this.age = age;
        this.sexe = sexe;
        this.taille = taille;
    }

    public Integer getPoids() {
        return poids;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSexe() {
        return sexe;
    }

    public Integer getTaille() {
        return taille;
    }

    public float getImg() {
        if(img == 0){
            float tailleCm = ((float)taille)/100;
            img = (float)((1.2 * poids/(tailleCm*tailleCm)) + (0.23 * age) - (10.83 * sexe) - 5.4);
        }
        return img;
    }

    public String getMessage() {
        if(message.equals("")){
            message = "normal";
            Integer min = minFemme, max = maxFemme;
            if(sexe == 1){
                min = minHomme;
                max = maxHomme;
            }
            img = getImg();
            if(img<min){
                message = "trop faible";
            }else{
                if(img>max){
                    message = "trop élevé";
                }
            }
        }
        return message;
    }
}
