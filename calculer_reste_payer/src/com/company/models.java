package com.company;

public class models {
    /*
              r = est votre taux d'intérêt mensuel, calculé en divisant votre taux d'intérêt annuel par 12.
              L = montant de l'emprunt
              P = nombre de paiement qui a été réalisé
              n = le nombre de paiement total
           n*/
    final byte percentage = 100;
    final byte Moths_in_year = 12;
    float taux;
    float r = taux / percentage;
    int p;
    int n;
    double L;
    float tauxAnnuel = taux * Moths_in_year;


}
