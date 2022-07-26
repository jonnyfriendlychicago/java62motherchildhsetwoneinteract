package com.jonfriend.java62motherchildhsetwoneinteract.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jonfriend.java62motherchildhsetwoneinteract.models.HouseMdl;
//import com.jonfriend.java62motherchildhsetwoneinteract.models.TwinoneMdl;

@Repository
public interface HouseRpo extends CrudRepository<HouseMdl, Long> {
	
	List<HouseMdl> findAll();
	
	HouseMdl findByIdIs(Long id);

// JF something about service below is busted, won't work.  Revisit.
//	List<HouseMdl> findAllByTwinoneMdl(TwinoneMdl twinoneMdl);
//	
//	List<TwinoneMdl> findByTwinoneMdlNotContains(TwinoneMdl twinoneMdl);
}
