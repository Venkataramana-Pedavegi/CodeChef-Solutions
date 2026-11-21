        validateContent(content);
        return "PDF Preview: " + content;
    }

    @Override
    public String encrypt(String content, String password) {
interface DocumentExporter {
    String export(String documentName, String content);
}

interface DocumentPreviewer {
    String preview(String content);
}

interface DocumentEncryptor {
    String encrypt(String content, String password);
}

// Exports documents as PDF and supports previewing and encryption.
class PdfExporter implements DocumentExporter, DocumentPreviewer, DocumentEncryptor {

    @Override
    public String export(String documentName, String content) {
        validateDocument(documentName, content);
        return "PDF export completed: " + documentName;
    }

    @Override
    public String preview(String content) {