public class CreadorReportePDF extends CreadorReporte {
    public ExportadorReporte crearExportador() {
        return new ExportadorPDF();
    }
}
