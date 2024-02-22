package com.ecommercebackend.www.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommercebackend.www.Model.Seller;
import com.ecommercebackend.www.Repo.SellerRepository;

@Service
public class SellerService {

    @Autowired
    SellerRepository sellerRepository;
    
    public Seller addSellerDetails(Seller s) {
        return sellerRepository.save(s);
    }
 
    public List<Seller> getSellerDetails() {
        return sellerRepository.findAll();
    }
 
    public Seller getSellerDetailsById(int seller_Id) {
        return sellerRepository.findById(seller_Id).orElse(null);
    }
  
    public Seller deleteSellerById(int Seller_Id) {
        Seller old_seller = sellerRepository.findById(Seller_Id).orElse(null);
        if (old_seller != null) {
            sellerRepository.delete(old_seller);
            return old_seller;
        }
        return null;
    }
 
    public Seller updateSellerById(int seller_Id, Seller s) {
        Seller old_seller = sellerRepository.findById(seller_Id).orElse(null);
        if (old_seller != null) {
            old_seller.setSeller_FirstName(s.getSeller_FirstName());
            old_seller.setSeller_LastName(s.getSeller_LastName());
            old_seller.setSeller_Age(s.getSeller_Age());
            old_seller.setSeller_Dob(s.getSeller_Dob());
            old_seller.setSeller_Email(s.getSeller_Email());
            old_seller.setSeller_Password(s.getSeller_Password());
            old_seller.setSeller_Phone(s.getSeller_Phone());
            old_seller.setSeller_Address(s.getSeller_Address());
            return sellerRepository.save(old_seller);
        }
        return null;
    }
}
