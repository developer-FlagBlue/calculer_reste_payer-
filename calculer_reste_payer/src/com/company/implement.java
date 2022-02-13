package com.company;

import java.nio.charset.MalformedInputException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class implement implements interfaces {
    // La formule suivant est utilisée pour calculer le reste à payer sur votre prêt pour chaque mois restant
    // B = L[(1 + r)n - (1 + r)p] / [(1 + r)n - 1]

    @Override
    public double calculetReste(models model) {
        float v = (1 + model.r) * model.n;
        float w = (1 + model.r) * model.p;
        double B = model.L * (v - w) / (v - 1);
        return B;


    }

    public void calcul(models l) {

        System.out.println("bien arrvé " + l.taux);
    }

    @Override
    public void validationEnter(Scanner scanner, models modelObjet) {
        //r = est votre taux d'intérêt mensuel,
        //float r = taux / percentage;
        while (true) {
            System.out.println("entrez votre taux d'intérêt mensuel: ");

            try {
                modelObjet.taux = scanner.nextFloat();
                if (modelObjet.taux >= 0 && modelObjet.taux <= 100)
                    //System.out.println("********"+ model.taux);
                    calcul(modelObjet);
                break;

            } catch (InputMismatchException error) {
                scanner.nextFloat();
                System.out.println("Enter value between 0 and 100");
            }
            System.out.println("********" + modelObjet.taux);

        }


    }

}
