package repasoArraysFechasExcep;

public class prueba {
    public static void main(String[] args) {
        String dniCompleto = "12345678A"; // Reemplaza esto con tu DNI completo
        String ultimosCuatroDigitos = obtenerUltimosCuatroDigitosSinLetra(dniCompleto);

        System.out.println("Los últimos cuatro dígitos del DNI (sin la letra) son: " + ultimosCuatroDigitos);
    }

    private static String obtenerUltimosCuatroDigitosSinLetra(String dniCompleto) {
        // Asumiendo que el DNI tiene al menos 5 caracteres (4 dígitos + 1 letra)
        int longitud = dniCompleto.length();
        return dniCompleto.substring(longitud - 5, longitud - 1);
    }
}
