package com.company;

import java.util.Scanner;

public interface interfaces {
    // La formule suivant est utilisée pour calculer le reste à payer sur votre prêt pour chaque mois restant
    // B = L[(1 + r)n - (1 + r)p] / [(1 + r)n - 1]
    double calculetReste(models model);

    void validationEnter(Scanner scanner, models modelObjet);
}
