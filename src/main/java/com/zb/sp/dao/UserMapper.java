package com.zb.sp.dao;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    public List<Map> search(Map map);

    public List<Map> findByName(Map map);
}
