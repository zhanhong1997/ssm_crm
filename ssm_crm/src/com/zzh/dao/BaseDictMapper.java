package com.zzh.dao;

import java.util.List;

import com.zzh.bean.BaseDict;

public interface BaseDictMapper {
	public List<BaseDict> selectSourceById(String id);
}
