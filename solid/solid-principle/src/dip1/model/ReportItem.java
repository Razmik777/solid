package dip1.model;

import java.util.List;

public class ReportItem implements Reportable {
    private final String description;
    private final float amount;

    public ReportItem(String description, float amount){
        this.description = description;
        this.amount = amount;
    }
    public String getDescription(){
        return description;
    }
    public float getAmount(){
        return amount;
    }
    @Override
    public void output(List<ReportItem> reports) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'output'");
    }
}
