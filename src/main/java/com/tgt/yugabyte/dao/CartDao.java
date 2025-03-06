package com.tgt.yugabyte.dao;

import com.datastax.oss.driver.api.mapper.annotations.Dao;
import com.datastax.oss.driver.api.mapper.annotations.Insert;
import com.datastax.oss.driver.api.mapper.annotations.Select;

import java.util.UUID;

import com.tgt.yugabyte.models.Carts;

@Dao
public interface CartDao {
    @Select
    Carts findById(UUID id, UUID itemId);

    @Insert
    void save(Carts cart);

}
