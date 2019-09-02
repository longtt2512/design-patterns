package creational.factory.factory;

public class Excel implements Document {
    public String getDocumentType() {
        return DocumentType.EXCEL.name();
    }
}
