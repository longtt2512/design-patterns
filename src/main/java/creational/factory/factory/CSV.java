package creational.factory.factory;

public class CSV implements Document {
    public String getDocumentType() {
        return DocumentType.CSV.name();
    }
}
