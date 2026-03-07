package com.example.reports;

/**
 * TODO (student):
 * Extract expensive loading logic from ReportFile into this RealSubject.
 */
public class RealReport implements Report {

    private final String reportId;
    private final String title;
    private final String classification;
    ReportFile reportFile = null;

    public RealReport(String reportId, String title, String classification) {
        this.reportId = reportId;
        this.title = title;
        this.classification = classification;
    }

    @Override
    public void display(User user) {
        // System.out.println("TODO: implement via real loading");

        if (reportFile == null) {
            reportFile = new ReportFile(reportId, title, classification);
        }
        reportFile.display(user);
    }

    public String getClassification() {
        return classification;
    }
}
