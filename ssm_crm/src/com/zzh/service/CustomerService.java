package com.zzh.service;

import com.zzh.bean.Customer;
import com.zzh.bean.QueryVo;
import com.zzh.common.utils.Page;

public interface CustomerService {
	// 通过四个条件 查询分页对象
	public Page<Customer> selectPageByQueryVo(QueryVo vo);
	
	//通过ID查询客户
	public Customer selectCustomerById(Integer id);
	
	//通过ID修改客户
	public void updateCustomerById(Customer customer);
	
	//通过ID 删除客户
	public void deleteCustomerById(Integer id);
}
