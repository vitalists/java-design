package factoryMethod.cap1;

/**
 * pdf导出具体工厂
 */
public class PDFExportFactory implements ExportFactory {
    @Override
    public ExportFile createExport(String name) {
        if ("log".equals(name)) {
            return new LogPdfExport();
        } else if ("userWord".equals(name)) {
            return new UserWordPdfExport();
        }
        return null;
    }
}
