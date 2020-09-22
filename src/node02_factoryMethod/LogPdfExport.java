package node02_factoryMethod;


public class LogPdfExport implements ExportFile {
    @Override
    public void export() {
        System.out.println("log pdf 导出");
    }
}
