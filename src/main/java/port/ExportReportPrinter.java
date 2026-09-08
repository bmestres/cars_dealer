package port;

import domain.Exportable;

public class ExportReportPrinter {

    public ExportReportPrinter() {
    }

    public void printReport(Exportable exportable) {
        System.out.println("Documento de exportación generado:");
        System.out.println(exportable.getExportInfo());
    }
}
