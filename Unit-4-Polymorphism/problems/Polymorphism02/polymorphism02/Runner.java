package polymorphism02;

interface MyImporter {
  void runMyImporter();
}

public class Runner {
  public void run(MyImporter o) {
    // if (o instanceof JSONImporter) {
    //   ((JSONImporter) o).importJSON();
    // } else if (o instanceof XMLImporter) {
    //   ((XMLImporter) o).importXML();
    // } else if (o instanceof CSVImporter) {
    //   ((CSVImporter) o).importCSV();
    // }
    o.runMyImporter();
  }
}
