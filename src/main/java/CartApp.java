import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.uuid.Uuids;
import com.tgt.yugabyte.config.CassandraConfig;
import com.tgt.yugabyte.dao.CartDao;
import com.tgt.yugabyte.mapper.CartMapper;
import com.tgt.yugabyte.mapper.CartMapperBuilder;
import com.tgt.yugabyte.models.Carts;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.Instant;

public class CartApp {
    public static void main(String[] args) {
        System.out.println("Hello, CartApp!");
        CassandraConfig cassandraConfig = new CassandraConfig();
        CqlSession session = cassandraConfig.getSession();
        CartMapper cartMapper = new CartMapperBuilder(session).build();
        CartDao cartDao = cartMapper.cartDao();
        Carts cart = new Carts();
        cart.setId(Uuids.timeBased());
        cart.setItemId(Uuids.timeBased());
        cart.setAllowOnlyWicItemsInCart(true);
        cart.setBags("Plastic");
        cart.setBalanceDue(new BigDecimal("100.50"));
        cart.setCreatedAt(Instant.now());
        cart.setItemAvailability("In Stock");
        cart.setItemCircleMembershipGiftCard(false);
        cart.setItemCreatedAt(Instant.now());
        cart.setItemPurchaseLimitsInfo("Limit 2 per customer");
        cart.setItemQuantity(1);
        cart.setState("New");
        cart.setTestCart(false);
        cart.setTotalDeliveryCharges("5.00");
        cart.setTotalDeliveryServiceFee("2.00");
        cart.setTotalHandling(new BigDecimal("1.50"));
        cart.setTotalShipping(new BigDecimal("10.00"));
        cart.setType("Regular");
        cart.setUpdatedAt(Instant.now());

        cartDao.save(cart);
        Carts fetchedCart = cartDao.findById(cart.getId(), cart.getItemId());
        System.out.println("Fetched Cart: " + fetchedCart.toString());

    }
}
