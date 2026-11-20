Ejercicio 4 - Fábrica de Exportadores de Reportes Financieros

Explicación del programa

En este ejercicio se implementó el patrón de diseño Factory Method para exportar reportes financieros en formato PDF y CSV realizando una validación previa de los datos, sin utilizar librerías externas ni imports.
El programa cuenta con:
- Una interfaz ExportadorReporte con los métodos validarDatos(String encabezado, String datos) y exportar(String encabezado, String datos).
- Dos clases concretas (ExportadorPDF y ExportadorCSV) que validan y exportan según su formato.
- Una clase abstracta CreadorReporte con el método de fábrica crearExportador() y el método generarReporte(String encabezado, String datos) que valida y ejecuta la exportación.
- Dos clases creadoras concretas (CreadorReportePDF y CreadorReporteCSV) que devuelven el exportador correspondiente.

Luego, dentro del método main, se utilizan los creadores para generar los reportes en ambos formatos.

Lógica utilizada

La lógica del programa consiste en:
- Centralizar en CreadorReporte el flujo de crear el exportador, validar los datos y exportar.
- Delegar la creación de cada exportador concreto a su respectiva subclase creadora.
- Encapsular la lógica de validación y formato dentro de cada clase exportadora.

Resultado de la ejecución

La ejecución del programa muestra en la consola lo siguiente:
Exportando PDF -> [Balance Mensual] Ingresos: 150000; Gastos: 90000
Exportando CSV -> Balance Mensual;Ingresos: 150000; Gastos: 90000

Captura de pantalla

<img width="791" height="188" alt="image" src="https://github.com/user-attachments/assets/f82cfbbe-e824-40da-9eb4-39f196aab1b9" />
