package abc.bean;

public class Territories {
    private String TerritoryID;
    private String TerritoryDescription;
    private int RegionID;

    public Territories() {
    }

    public String getTerritoryID() {
        return this.TerritoryID;
    }

    public void setTerritoryID(String TerritoryID) {
        this.TerritoryID = TerritoryID;
    }

    public String getTerritoryDescription() {
        return this.TerritoryDescription;
    }

    public void setTerritoryDescription(String TerritoryDescription) {
        this.TerritoryDescription = TerritoryDescription;
    }

    public int getRegionID() {
        return this.RegionID;
    }

    public void setRegionID(int RegionID) {
        this.RegionID = RegionID;
    }

}
