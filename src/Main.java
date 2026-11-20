public class Main {
    public static void main(String[] args) {
        CreadorReporte creadorPDF = new CreadorReportePDF();
        creadorPDF.generarReporte("Balance Mensual", "Ingresos: 150000; Gastos: 90000");

        CreadorReporte creadorCSV = new CreadorReporteCSV();
        creadorCSV.generarReporte("Balance Mensual", "Ingresos: 150000; Gastos: 90000");
    }
}