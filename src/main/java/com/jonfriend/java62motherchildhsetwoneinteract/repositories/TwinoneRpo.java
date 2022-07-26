package com.jonfriend.java62motherchildhsetwoneinteract.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jonfriend.java62motherchildhsetwoneinteract.models.TwintwoMdl;
import com.jonfriend.java62motherchildhsetwoneinteract.models.TwinoneMdl;

@Repository
public interface TwinoneRpo extends CrudRepository<TwinoneMdl, Long> {
	
	List<TwinoneMdl> findAll();
	
	TwinoneMdl findByIdIs(Long id);
	
	List<TwinoneMdl> findAllByTwintwoMdl(TwintwoMdl twintwoMdl);
	
	List<TwinoneMdl> findByTwintwoMdlNotContains(TwintwoMdl twintwoMdl);
}
