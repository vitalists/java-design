package factoryMethod.cap1;


public class LogPdfExport implements ExportFile {
    @Override
    public void export() {
        System.out.println("log pdf 导出");
    }
}
