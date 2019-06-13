package entity;

import javax.persistence.*;

@Entity
@Table(name = "Tool")
public class Tool {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tool_id")
    @SequenceGenerator(sequenceName = "TOOL_SEQ", name = "tool_id", allocationSize = 1)
    private int id;

    @Column(name = "name")
    private String nameTool;
    @Column(name = "production_increase")
    private int productionPercentge;
    @Column(name = "price")
    private String priceTool;
    @Column(name = "sale")
    private String saleTool;

    @ManyToOne
    Earner earner;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameTool() {
        return nameTool;
    }

    public void setNameTool(String nameTool) {
        this.nameTool = nameTool;
    }

    public int getProductionPercentge() {
        return productionPercentge;
    }

    public void setProductionPercentge(int productionPercentge) {
        this.productionPercentge = productionPercentge;
    }

    public String getPriceTool() {
        return priceTool;
    }

    public void setPriceTool(String priceTool) {
        this.priceTool = priceTool;
    }

    public String getSaleTool() {
        return saleTool;
    }

    public void setSaleTool(String saleTool) {
        this.saleTool = saleTool;
    }
}
