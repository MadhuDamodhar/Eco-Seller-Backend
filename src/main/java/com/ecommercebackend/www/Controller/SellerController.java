package com.ecommercebackend.www.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecommercebackend.www.Model.Seller;
import com.ecommercebackend.www.Service.SellerService;
@CrossOrigin(origins = "http://localhost:3000")
@Controller
@RequestMapping("/api/seller")
public class SellerController {
    
    @Autowired
    SellerService sellerService;

    @PostMapping("/addSeller")
    public ResponseEntity<Seller> addSellerDetails(@RequestBody Seller s){
        return new ResponseEntity<>(sellerService.addSellerDetails(s), HttpStatus.CREATED);
    }
    
    @GetMapping("/getSellerDetails")
    public ResponseEntity<List<Seller>> getSellerDetails(){
        return new ResponseEntity<>(sellerService.getSellerDetails(), HttpStatus.OK);
    }
    
    @GetMapping("/getSeller/{seller_Id}")
    public ResponseEntity<Seller> getSellerDetailsById(@PathVariable int seller_Id) {
        Seller seller = sellerService.getSellerDetailsById(seller_Id);
        if (seller != null) {
            return new ResponseEntity<>(seller, HttpStatus.FOUND);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deleteSeller/{Seller_id}")
    public ResponseEntity<Seller> deleteSellerById(@PathVariable int Seller_id){
        Seller deletedSeller = sellerService.deleteSellerById(Seller_id);
        if (deletedSeller != null) {
            return new ResponseEntity<>(deletedSeller, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PostMapping("/updateSeller/{seller_id}")
    public ResponseEntity<Seller> updateSellerById(@PathVariable int seller_id, @RequestBody Seller s) {
        Seller updatedSeller = sellerService.updateSellerById(seller_id, s);
        if (updatedSeller != null) {
            return new ResponseEntity<>(updatedSeller, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
