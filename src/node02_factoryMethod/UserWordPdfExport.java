package node02_factoryMethod;


public class UserWordPdfExport implements ExportFile {
    @Override
    public void export() {
        System.out.println("user word pdf export");
    }
}
