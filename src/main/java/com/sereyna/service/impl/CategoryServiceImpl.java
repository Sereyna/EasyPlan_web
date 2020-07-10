package com.sereyna.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sereyna.mapper.CategoryMapper;
import com.sereyna.pojo.Category;
import com.sereyna.service.CategoryService;

@Service
public class CategoryServiceImpl  implements CategoryService{
	@Autowired(required = false)
	CategoryMapper categoryMapper;
	
	
	public List<Category> list(){
		return categoryMapper.list();
	};

}
