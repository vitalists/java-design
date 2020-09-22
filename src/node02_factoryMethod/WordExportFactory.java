package node02_factoryMethod;

/**
 * word导出具体工厂
 */
public class WordExportFactory implements ExportFactory  {
    @Override
    public ExportFile createExport(String name) {
        if ("log".equals(name)) {
            return new LogWordExport();
        } else if ("userWord".equals(name)) {
            return new UserWordWordExport();
        }
        return null;
    }
}
