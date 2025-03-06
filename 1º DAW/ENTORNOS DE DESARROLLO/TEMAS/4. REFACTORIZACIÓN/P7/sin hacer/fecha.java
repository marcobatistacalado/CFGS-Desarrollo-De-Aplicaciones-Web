/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizar1;

/**
 *
 * @author rosa
 */
public class fecha {
    public int x;
    public int m;
    public int año;

    public fecha(int dia, int mes, int anio) {
        this.x = dia;
        this.m = mes;
        this.año = anio;
    }

    public boolean valida() {
        if (this.x < 1 || this.x > 31) {
            return true;
        }
        if (this.m < 1 || this.m > 12) {
            return true;
        }
        // determinamos la cantidad de días del mes:
        int z = 0;
        switch (this.m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                z = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                z = 30;
                break;
            case 2:
                if ((this.año % 400 == 0) || ((this.año % 4 == 0) && (this.año % 100 != 0))) {
                    z = 29;
                } else {
                    z = 28;
                }
                break;

        }
        if (this.x > z) {
            return true;
        } else {
            return false;
        }
    }

}


