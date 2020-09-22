package node02_factoryMethod;


public class LogWordExport implements ExportFile {
    @Override
    public void export() {
        System.out.println("log 日志 word 导出");
    }
}
