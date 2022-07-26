package com.jonfriend.java62motherchildhsetwoneinteract.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jonfriend.java62motherchildhsetwoneinteract.models.TwinoneMdl;
import com.jonfriend.java62motherchildhsetwoneinteract.models.UserMdl;

@Repository
public interface UserRpo extends CrudRepository<UserMdl, Long> {
    
    Optional<UserMdl> findByEmail(String email);
    
    // JRF 724
    List<UserMdl> findAll();
    
    UserMdl findByIdIs(Long id);
    
    
    // end of rpo   
}