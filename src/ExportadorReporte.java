public interface ExportadorReporte {
    boolean validarDatos(String encabezado, String datos);
    void exportar(String encabezado, String datos);
}