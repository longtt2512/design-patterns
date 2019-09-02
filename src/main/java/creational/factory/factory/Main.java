package creational.factory.factory;

public class Main {

    public static void main(String[] args) {
        DocumentFactory factory = new DocumentFactory();
        Document excel = factory.getDocumentByType(DocumentType.EXCEL);
        System.out.println("File Type: " + excel.getDocumentType());
        Document csv = factory.getDocumentByType(DocumentType.CSV);
        System.out.println("File Type: " + csv.getDocumentType());
    }
}
