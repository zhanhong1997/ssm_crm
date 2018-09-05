package com.zzh.service;

import java.util.List;

import com.zzh.bean.BaseDict;

public interface BaseDictService {
	public List<BaseDict> selectSourceById(String id);
}
