package com.zzh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzh.bean.BaseDict;
import com.zzh.dao.BaseDictMapper;

@Service
public class BaseDictServiceImpl implements BaseDictService{
	@Autowired
	private BaseDictMapper baseDictMapper;
	
	@Override
	public List<BaseDict> selectSourceById(String id) {
		return baseDictMapper.selectSourceById(id);
	}
}
