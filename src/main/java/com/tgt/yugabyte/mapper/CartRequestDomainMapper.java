package com.tgt.yugabyte.mapper;

import com.tgt.yugabyte.domain.CartRequest;
import com.tgt.yugabyte.models.Carts;
import jakarta.inject.Singleton;

@Singleton
public class CartRequestDomainMapper {

    public Carts toEntity(CartRequest cartRequest) {
        Carts carts = new Carts();
        carts.setId(cartRequest.getId());
        carts.setItemId(cartRequest.getItemId());
        carts.setAllowOnlyWicItemsInCart(cartRequest.getAllowOnlyWicItemsInCart());
        carts.setBags(cartRequest.getBags());
        carts.setBalanceDue(cartRequest.getBalanceDue());
        carts.setCreatedAt(cartRequest.getCreatedAt());
        carts.setItemAvailability(cartRequest.getItemAvailability());
        carts.setItemCircleMembershipGiftCard(cartRequest.isItemCircleMembershipGiftCard());
        carts.setAllowOnlyWicItemsInCart(cartRequest.isAllowOnlyWicItemsInCart());
        carts.setTotalDeliveryCharges(cartRequest.getTotalDeliveryCharges());
        return carts;
    }


}
