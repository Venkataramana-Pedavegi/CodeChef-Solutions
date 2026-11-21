# OOPSFUND11

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Lab - Document Export System

Hey Developers! 👋 Welcome to the  **Document Export System**  lab!

This lab is based on two SOLID principles: the  **Interface Segregation Principle (ISP)**  and the  **Dependency Inversion Principle (DIP)**, the fourth and fifth of the five SOLID principles.

- ISP says that a class should not be forced to implement methods it does not need. PDF, CSV, and JSON exporters support different capabilities, so each exporter should implement only the interfaces that match what it supports.
- DIP says that high-level modules should depend on abstractions rather than concrete implementations. The report service should work with any exporter through the DocumentExporter interface instead of depending on a specific exporter class.

You will implement exporters with different capabilities and a report service that works with any of them without changes.

 **Project Structure** 
You are given the following file:

- Codechef.java → Contains the DocumentExporter, DocumentPreviewer, and DocumentEncryptor interfaces, the PdfExporter, CsvExporter, and JsonExporter classes, the ReportService class, and a main method that demonstrates the workflow.

Complete the TODOs in `Codechef.java`.  **This is the only file you need to edit.** 

 **Note:**  Starter code will not compile at first. `main` and the `@Override` methods in `PdfExporter` and `CsvExporter` need those classes to implement the correct interfaces. Errors go away once you update their class declarations.

#### Task

 **1. Implement `PdfExporter`** 

PDF export supports exporting, previewing, and encryption.

- Update the class declaration so PdfExporter implements DocumentExporter, DocumentPreviewer, and DocumentEncryptor.
- Implement export(String documentName, String content): Validate the document name and content using the provided validateDocument() method. The document name is checked first. Return "PDF export completed: " followed by the document name.
- Implement preview(String content): Validate the content using the provided validateContent() method. Return "PDF Preview: " followed by the content.
- Implement encrypt(String content, String password): Validate the content first using validateContent(). If the password is null, empty, or whitespace only, throw an IllegalArgumentException with the message Password is required. Otherwise, return "PDF document encrypted successfully". Encryption is only simulated, so do not change or encrypt the content.

The provided validation helpers throw an `IllegalArgumentException` with these exact messages:

- Document name is required if the document name is null, empty, or blank.
- Document content is required if the content is null, empty, or blank.

 **2. Implement `CsvExporter`** 

CSV export supports exporting and previewing, but not encryption.

- Update the class declaration so CsvExporter implements DocumentExporter and DocumentPreviewer.
- Implement export(String documentName, String content): Validate the document name and content using the provided validateDocument() method. Return "CSV export completed: " followed by the document name.
- Implement preview(String content): Validate the content using the provided validateContent() method. Return "CSV Preview: " followed by the content.

The helpers throw the same exceptions and messages as in `PdfExporter`.

 **3. Implement `JsonExporter`** 

JSON export supports exporting only. It does not support previewing or encryption. No validation helpers are provided in this class.

Implement `export(String documentName, String content)` by performing these checks in the following order:

- If the document name is null, empty, or blank, throw an IllegalArgumentException with the message Document name is required.
- If the content is null, empty, or blank, throw an IllegalArgumentException with the message Document content is required.
- Otherwise, return "JSON export completed: " followed by the document name.

`JsonExporter` must implement only the `DocumentExporter` interface.

 **4. Implement `ReportService`** 

The constructor is already provided. It rejects a `null` exporter with an `IllegalArgumentException` and the message `Document exporter cannot be null`.

Implement `exportReport(String documentName, String content)`:

- If the document name is null, empty, or blank, throw an IllegalArgumentException with the message Document name is required. Do this before calling the exporter, so the exporter is not called for an invalid name.
- Otherwise, delegate to the injected DocumentExporter by calling its export() method, and return its result.
- Do not validate the content here. Content validation is the exporter's job.

`ReportService` must not contain format-specific export logic. It must work with any implementation of `DocumentExporter`.

#### Important Rules
- Do not change the given class names, method names, or constructor signatures. The only declarations you may change are the class declarations of PdfExporter and CsvExporter, as described in the tasks.
- Use the provided validation helpers in PdfExporter and CsvExporter.
- Implement only the capabilities each exporter supports, and do not add methods for capabilities it does not support: PdfExporter: exporting, previewing, and encryption. CsvExporter: exporting and previewing. JsonExporter: exporting only.
- ReportService must depend on the DocumentExporter interface, not on PdfExporter, CsvExporter, or JsonExporter. It must not use instanceof, if-else, or switch to choose behavior based on the exporter type.
- Complete only the TODOs in Codechef.java.
#### Example

 **Input used in `main()`:**  Document name: `StudentReport`, content: `Student: Alice, Score: 95`

 **Expected Output:** 

```
PDF export completed: StudentReport
CSV export completed: StudentReport
JSON export completed: StudentReport
PDF Preview: Student: Alice, Score: 95
PDF document encrypted successfully

```

 **Explanation:** 

- The first three lines come from the same ReportService code working with the PDF, CSV, and JSON exporters.
- The fourth line comes from a DocumentPreviewer reference to a PdfExporter.
- The fifth line comes from a DocumentEncryptor reference to a PdfExporter.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T13:54:54.303Z  

```cpp
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
```

---

[View on CodeChef](https://www.codechef.com/problems/OOPSFUND11)