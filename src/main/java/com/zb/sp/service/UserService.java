package com.zb.sp.service;

import java.util.List;
import java.util.Map;

public interface UserService {
    public List<Map> search(Map map);

    public List<Map> findByName(Map map);
}
