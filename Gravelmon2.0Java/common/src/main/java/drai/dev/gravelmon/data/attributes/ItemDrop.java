package drai.dev.gravelmon.data.attributes;

public class ItemDrop {
    private String itemId;
    private int chance;
    private int quantityMin;
    private int quantityMax;

    public ItemDrop(String itemId, int chance, int quantityMin, int quantityMax) {
        this.itemId = itemId;
        this.chance = chance;
        this.quantityMin = quantityMin;
        this.quantityMax = quantityMax;
    }

    public int getChance() {
        return chance;
    }

    public String getItemId() {
        return itemId;
    }

    public int getQuantityMin() {
        return quantityMin;
    }

    public int getQuantityMax() {
        return quantityMax;
    }
}
