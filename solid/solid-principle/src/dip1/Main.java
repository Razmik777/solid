package dip1;

import dip1.model.Report;
import dip1.model.ReportManager;
import dip1.model.util.ConsolePrinter;
import dip1.model.util.ReportPrinter;
import logger.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Log.log(Main.class.getName());

    public static void main(String[] args) {
        log.log(Level.INFO, "Method main in model package started");
        Report report = new Report();
        report.calculate();
        ReportManager re = new ReportManager(new ConsolePrinter());
        re.toOutput(report.getItems());
    }
}

// public class Report {
//     private List<ReportItem> items; // report data

//     // calculate report data
//     public void calculate() {
//         items = new ArrayList<ReportItem>();
//         items.add(new ReportItem("First", (float) 5));
//         items.add(new ReportItem("Second", (float) 6));
//     }

//     public void output() {
//         ReportPrinter reportPrint = new ReportPrinter();
//         reportPrint.output(items);
//     }
// }