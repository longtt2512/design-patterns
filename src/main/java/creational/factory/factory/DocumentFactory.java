package creational.factory.factory;

public class DocumentFactory {

    public Document getDocumentByType(DocumentType documentType) {
        switch (documentType) {
            case CSV:
                return new CSV();
            case EXCEL:
                return new Excel();
            default:
                throw new IllegalArgumentException();
        }
    }
}
