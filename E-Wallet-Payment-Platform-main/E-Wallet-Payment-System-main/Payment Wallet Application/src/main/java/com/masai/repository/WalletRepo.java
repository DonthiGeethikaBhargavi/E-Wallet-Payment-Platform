/**
 * 
 */
package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Wallet;


@Repository
public interface WalletRepo extends JpaRepository<Wallet, String> {

}
