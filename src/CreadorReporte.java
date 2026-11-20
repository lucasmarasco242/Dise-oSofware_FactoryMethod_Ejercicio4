public abstract class CreadorReporte {
    public abstract ExportadorReporte crearExportador();

    public void generarReporte(String encabezado, String datos) {
        ExportadorReporte exportador = crearExportador();
        if (exportador.validarDatos(encabezado, datos)) {
            exportador.exportar(encabezado, datos);
        } else {
            System.out.println("Datos inválidos para exportar el reporte.");
        }
    }
}