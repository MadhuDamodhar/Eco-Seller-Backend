package com.ecommercebackend.www.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommercebackend.www.Model.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Integer>{

}
