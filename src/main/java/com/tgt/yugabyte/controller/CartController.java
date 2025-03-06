package com.tgt.yugabyte.controller;

import com.datastax.oss.driver.api.core.CqlSession;
import com.tgt.yugabyte.config.CassandraConfig;
import com.tgt.yugabyte.dao.CartDao;
import com.tgt.yugabyte.domain.CartRequest;
import com.tgt.yugabyte.mapper.CartMapper;
import com.tgt.yugabyte.mapper.CartMapperBuilder;
import com.tgt.yugabyte.mapper.CartRequestDomainMapper;
import com.tgt.yugabyte.models.Carts;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

@Controller("/cart")
public class CartController {

    private final CartRequestDomainMapper cartMapper;
    private final CassandraConfig cassandraConfig;
    private final CqlSession session;


    @Inject
    public CartController(CartRequestDomainMapper cartMapper) {

        this.cartMapper = cartMapper;
        cassandraConfig = new CassandraConfig();
        session = cassandraConfig.getSession();
    }
    @Post(
            uri = "/save",
            produces = "application/json",
            consumes = "application/json"
    )
public HttpResponse<Carts> saveCart(@Body CartRequest inputRequest) {


    Carts cart = cartMapper.toEntity(inputRequest);
        CartMapper cartMapper = new CartMapperBuilder(session).build();
        CartDao cartDao = cartMapper.cartDao();
        cartDao.save(cart);
        return HttpResponse.created(cart);
}

}

