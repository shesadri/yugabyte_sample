package com.tgt.yugabyte.models;

import com.datastax.oss.driver.api.mapper.annotations.ClusteringColumn;
import com.datastax.oss.driver.api.mapper.annotations.Entity;
import com.datastax.oss.driver.api.mapper.annotations.PartitionKey;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Entity
public class Carts {

    @PartitionKey
    private UUID id;

    @ClusteringColumn
    private UUID itemId;
    private boolean allowOnlyWicItemsInCart;
    private String bags;
    private BigDecimal balanceDue;
    private Instant createdAt;
    private String itemAvailability;
    private boolean itemCircleMembershipGiftCard;
    private Instant itemCreatedAt;
    private String itemPurchaseLimitsInfo;
    private int itemQuantity;
    private String state;
    private boolean testCart;
    private String totalDeliveryCharges;
    private String totalDeliveryServiceFee;
    private BigDecimal totalHandling;
    private BigDecimal totalShipping;

    private String type;
    private Instant updatedAt;

    // Getters and Setters
    public UUID getId() {
        return id;
    }

    public String getBags() {
        return bags;
    }

    public String getTotalDeliveryCharges() {
        return totalDeliveryCharges;
    }

    public String getState() {
        return state;
    }

    public String getTotalDeliveryServiceFee() {
        return totalDeliveryServiceFee;
    }

    public String getType() {
        return type;
    }

    public UUID getItemId() {
        return itemId;
    }

    public String getItemAvailability() {
        return itemAvailability;
    }

    public BigDecimal getBalanceDue() {
        return balanceDue;
    }

    public BigDecimal getTotalHandling() {
        return totalHandling;
    }

    public boolean isAllowOnlyWicItemsInCart() {
        return allowOnlyWicItemsInCart;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public boolean isItemCircleMembershipGiftCard() {
        return itemCircleMembershipGiftCard;
    }

    public void setItemPurchaseLimitsInfo(String itemPurchaseLimitsInfo) {
        this.itemPurchaseLimitsInfo = itemPurchaseLimitsInfo;
    }

    public void setItemCircleMembershipGiftCard(boolean itemCircleMembershipGiftCard) {
        this.itemCircleMembershipGiftCard = itemCircleMembershipGiftCard;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public void setItemId(UUID itemId) {
        this.itemId = itemId;
    }

    public void setItemCreatedAt(Instant itemCreatedAt) {
        this.itemCreatedAt = itemCreatedAt;
    }

    public void setItemAvailability(String itemAvailability) {
        this.itemAvailability = itemAvailability;
    }
    public void setBags(String bags) {
        this.bags = bags;
    }

    public BigDecimal getTotalShipping() {
        return totalShipping;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTotalShipping(BigDecimal totalShipping) {
        this.totalShipping = totalShipping;
    }

    public void setTotalHandling(BigDecimal totalHandling) {
        this.totalHandling = totalHandling;
    }

    public void setBalanceDue(BigDecimal balanceDue) {
        this.balanceDue = balanceDue;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setAllowOnlyWicItemsInCart(boolean allowOnlyWicItemsInCart) {
        this.allowOnlyWicItemsInCart = allowOnlyWicItemsInCart;
    }

    public void setTestCart(boolean testCart) {
        this.testCart = testCart;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public void setTotalDeliveryCharges(String totalDeliveryCharges) {
        this.totalDeliveryCharges = totalDeliveryCharges;
    }

    public void setTotalDeliveryServiceFee(String totalDeliveryServiceFee) {
        this.totalDeliveryServiceFee = totalDeliveryServiceFee;
    }

    public boolean isTestCart() {
        return testCart;
    }

    public Instant getItemCreatedAt() {
        return itemCreatedAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }


    public String getItemPurchaseLimitsInfo() {
        return itemPurchaseLimitsInfo;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Carts{" +
                "id=" + id +
                ", itemId=" + itemId +
                ", allowOnlyWicItemsInCart=" + allowOnlyWicItemsInCart +
                ", bags='" + bags + '\'' +
                ", balanceDue=" + balanceDue +
                ", createdAt=" + createdAt +
                ", itemAvailability='" + itemAvailability + '\'' +
                ", itemCircleMembershipGiftCard=" + itemCircleMembershipGiftCard +
                ", itemCreatedAt=" + itemCreatedAt +
                ", itemPurchaseLimitsInfo='" + itemPurchaseLimitsInfo + '\'' +
                ", itemQuantity=" + itemQuantity +
                ", state='" + state + '\'' +
                ", testCart=" + testCart +
                ", totalDeliveryCharges='" + totalDeliveryCharges + '\'' +
                ", totalDeliveryServiceFee='" + totalDeliveryServiceFee + '\'' +
                ", totalHandling=" + totalHandling +
                ", totalShipping=" + totalShipping +
                ", type='" + type + '\'' +
                ", updatedAt=" + updatedAt +
                '}';
    }
}


