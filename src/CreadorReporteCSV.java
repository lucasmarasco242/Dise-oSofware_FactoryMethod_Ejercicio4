public class CreadorReporteCSV extends CreadorReporte {
    public ExportadorReporte crearExportador() {
        return new ExportadorCSV();
    }
}