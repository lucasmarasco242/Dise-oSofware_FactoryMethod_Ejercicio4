public class ExportadorCSV implements ExportadorReporte {
    public boolean validarDatos(String encabezado, String datos) {
        return encabezado != null && !encabezado.isEmpty() && datos != null && !datos.isEmpty();
    }

    public void exportar(String encabezado, String datos) {
        System.out.println("Exportando CSV -> " + encabezado + ";" + datos);
    }
}