package polymorphism01;

abstract class ImportFile {
  abstract void nameOfImporter();
}

public class Runner {
  public void run(ImportFile o) {
  //   if (o instanceof JSONImporter) {
  //     ((JSONImporter) o).importJSON();
  //   } else if (o instanceof XMLImporter) {
  //     ((XMLImporter) o).importXML();
  //   } else if (o instanceof CSVImporter) {
  //     ((CSVImporter) o).importCSV();
  //   }
  // }
    o.nameOfImporter();
  }

}

//ImportFile.nameOfImporter
//ImportFile var = new ImportFile