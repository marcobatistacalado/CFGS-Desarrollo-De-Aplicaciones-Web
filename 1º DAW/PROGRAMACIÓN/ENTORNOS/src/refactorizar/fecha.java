/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizar;

/**
 *
 * @author rosa
 */
public class fecha {
    private int dd;
    private int mm;
    private int yyyy;

    public fecha(int dia, int mes, int anio) {
        this.dd = dia;
        this.mm = mes;
        this.yyyy = anio;
    }

    public boolean validarFecha() {
        validarDia();
        validarMes();
        // determinamos la cantidad de días del mes:
        int z = diaMes();
        if (this.getDd() > z) {
            return true;
        } else {
            return false;
        }
    }

	private int diaMes() {
		int z=0;

        switch (this.getMm()) {
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
                if ((this.getYyyy() % 400 == 0) || ((this.getYyyy() % 4 == 0) && (this.getYyyy() % 100 != 0))) {
                    z = 29;
                } else {
                    z = 28;
                }
                break;

        }
		return z;
	}

	private boolean validarMes() {
		if (this.getMm() < 1 || this.getMm() > 12) {
            return true;
        }
		return false;
	}

	private boolean validarDia() {
		if (this.getDd() < 1 || this.getDd() > 31) {
            return true;
        }
		return false;
	}

	private int getDd() {
		return dd;
	}

	private int getMm() {
		return mm;
	}

	private int getYyyy() {
		return yyyy;
	}

}