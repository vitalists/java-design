package factoryMethod.cap1;
public class TestApp {
    public static void main(String[] args) {
        ExportFactory exportFactory = new PDFExportFactory();
        ExportFile exportFile = exportFactory.createExport("log");
        exportFile.export();

        ExportFactory wordExportFactory = new WordExportFactory();
        ExportFile exportFile2 = wordExportFactory.createExport("userWord");
        exportFile2.export();
    }
}
