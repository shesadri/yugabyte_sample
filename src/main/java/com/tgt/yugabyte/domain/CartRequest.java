package com.tgt.yugabyte.domain;

import com.datastax.oss.driver.api.mapper.annotations.ClusteringColumn;
import com.datastax.oss.driver.api.mapper.annotations.PartitionKey;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public class CartRequest {
    private UUID id;
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getItemId() {
        return itemId;
    }

    public void setItemId(UUID itemId) {
        this.itemId = itemId;
    }

    public boolean isAllowOnlyWicItemsInCart() {
        return allowOnlyWicItemsInCart;
    }

    public void setAllowOnlyWicItemsInCart(boolean allowOnlyWicItemsInCart) {
        this.allowOnlyWicItemsInCart = allowOnlyWicItemsInCart;
    }

    public String getBags() {
        return bags;
    }

    public void setBags(String bags) {
        this.bags = bags;
    }

    public BigDecimal getBalanceDue() {
        return balanceDue;
    }

    public void setBalanceDue(BigDecimal balanceDue) {
        this.balanceDue = balanceDue;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public String getItemAvailability() {
        return itemAvailability;
    }

    public void setItemAvailability(String itemAvailability) {
        this.itemAvailability = itemAvailability;
    }

    public boolean isItemCircleMembershipGiftCard() {
        return itemCircleMembershipGiftCard;
    }

    public void setItemCircleMembershipGiftCard(boolean itemCircleMembershipGiftCard) {
        this.itemCircleMembershipGiftCard = itemCircleMembershipGiftCard;
    }

    public Instant getItemCreatedAt() {
        return itemCreatedAt;
    }

    public void setItemCreatedAt(Instant itemCreatedAt) {
        this.itemCreatedAt = itemCreatedAt;
    }

    public String getItemPurchaseLimitsInfo() {
        return itemPurchaseLimitsInfo;
    }

    public void setItemPurchaseLimitsInfo(String itemPurchaseLimitsInfo) {
        this.itemPurchaseLimitsInfo = itemPurchaseLimitsInfo;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isTestCart() {
        return testCart;
    }

    public void setTestCart(boolean testCart) {
        this.testCart = testCart;
    }

    public String getTotalDeliveryCharges() {
        return totalDeliveryCharges;
    }

    public void setTotalDeliveryCharges(String totalDeliveryCharges) {
        this.totalDeliveryCharges = totalDeliveryCharges;
    }

    public String getTotalDeliveryServiceFee() {
        return totalDeliveryServiceFee;
    }

    public void setTotalDeliveryServiceFee(String totalDeliveryServiceFee) {
        this.totalDeliveryServiceFee = totalDeliveryServiceFee;
    }

    public BigDecimal getTotalHandling() {
        return totalHandling;
    }

    public void setTotalHandling(BigDecimal totalHandling) {
        this.totalHandling = totalHandling;
    }

    public BigDecimal getTotalShipping() {
        return totalShipping;
    }

    public void setTotalShipping(BigDecimal totalShipping) {
        this.totalShipping = totalShipping;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }


    public boolean getAllowOnlyWicItemsInCart() {
        return this.allowOnlyWicItemsInCart;
    }
}