package com.wine.web.repositories;

import org.springframework.data.repository.CrudRepository;

import com.wine.web.entities.Admin;

public interface AdminRepository extends CrudRepository<Admin, Integer>
{
	public Admin findByAdminEmail(String email);
}
