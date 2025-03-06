package com.tgt.yugabyte.mapper;

import com.datastax.oss.driver.api.mapper.annotations.DaoFactory;
import com.datastax.oss.driver.api.mapper.annotations.Mapper;

import com.tgt.yugabyte.dao.CartDao;

@Mapper
public interface CartMapper {
    @DaoFactory
    CartDao cartDao();
}
