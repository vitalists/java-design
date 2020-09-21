package factoryMethod.cap1;

/**
 * @author 李彬
 * @description
 * @date 2020-09-21 16:09
 **/
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
