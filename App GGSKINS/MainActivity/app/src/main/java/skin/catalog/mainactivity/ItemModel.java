package skin.catalog.mainactivity;

public class ItemModel {

    private String name,wear,caseitem,priceitem,marketitem;
    private int imgitem;

    public ItemModel() {
    }

    public ItemModel(String name, String wear, String caseitem, String priceitem, String marketitem, int imgitem) {
        this.name = name;
        this.wear = wear;
        this.caseitem = caseitem;
        this.priceitem = priceitem;
        this.marketitem = marketitem;
        this.imgitem = imgitem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWear() {
        return wear;
    }

    public void setWear(String wear) {
        this.wear = wear;
    }

    public String getCaseitem() {
        return caseitem;
    }

    public void setCaseitem(String caseitem) {
        this.caseitem = caseitem;
    }

    public String getPriceitem() {
        return priceitem;
    }

    public void setPriceitem(String priceitem) {
        this.priceitem = priceitem;
    }

    public String getMarketitem() {
        return marketitem;
    }

    public void setMarketitem(String marketitem) {
        this.marketitem = marketitem;
    }

    public int getImgitem() {
        return imgitem;
    }

    public void setImgitem(int imgitem) {
        this.imgitem = imgitem;
    }
}
