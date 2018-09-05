package com.zzh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzh.bean.Customer;
import com.zzh.bean.QueryVo;
import com.zzh.common.utils.Page;
import com.zzh.dao.CustomerMapper;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customerMapper;
	// 通过四个条件 查询分页对象
	public Page<Customer> selectPageByQueryVo(QueryVo vo) {
		Page<Customer> page = new Page<Customer>();
		//每页数
		page.setSize(5);
		vo.setSize(5);
		if (null != vo) {
			// 判断当前页
			if (null != vo.getPage()) {
				page.setPage(vo.getPage());
				vo.setStartRow((vo.getPage() -1)*vo.getSize());
			}
			if(null != vo.getCustName() && !"".equals(vo.getCustName().trim())){
				vo.setCustName(vo.getCustName().trim());
			}
			if(null != vo.getCustSource() && !"".equals(vo.getCustSource().trim())){
				vo.setCustSource(vo.getCustSource().trim());
			}
			if(null != vo.getCustIndustry() && !"".equals(vo.getCustIndustry().trim())){
				vo.setCustIndustry(vo.getCustIndustry().trim());
			}
			if(null != vo.getCustLevel() && !"".equals(vo.getCustLevel().trim())){
				vo.setCustLevel(vo.getCustLevel().trim());
			}
			//总条数
			page.setTotal(customerMapper.customerCountByQueryVo(vo));
			page.setRows(customerMapper.selectCustomerListByQueryVo(vo));
		}
		return page;

	}
	
	//通过ID查询客户
	public Customer selectCustomerById(Integer id){
		return customerMapper.selectCustomerById(id);
	}
	
	//修改客户通过ID
	public void updateCustomerById(Customer customer){
		customerMapper.updateCustomerById(customer);
	}
	
	//通过ID 删除客户
	public void deleteCustomerById(Integer id){
		customerMapper.deleteCustomerById(id);
	}
}
