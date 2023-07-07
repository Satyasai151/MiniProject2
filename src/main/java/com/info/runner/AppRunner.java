package com.info.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.info.entity.EligibilityDetails;
import com.info.repository.EligibilityRepository;
@Component
public class AppRunner implements ApplicationRunner {
	@Autowired
	private EligibilityRepository repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		EligibilityDetails entity1 = new EligibilityDetails();
		entity1.setEligId(1);
		entity1.setName("sai");
		entity1.setEmail("sai123@gmail.com");
		entity1.setMobile(7788996655l);
		entity1.setGender('M');
		entity1.setSsn(21407760l);
		entity1.setPlanName("SNAP");
		entity1.setPlanStatus("approved");
		repo.save(entity1);
		EligibilityDetails entity2 = new EligibilityDetails();
		entity2.setEligId(2);
		entity2.setName("kishore");
		entity2.setEmail("kishore23@gmail.com");
		entity2.setMobile(7788996655l);
		entity2.setGender('M');
		entity2.setSsn(21407760l);
		entity2.setPlanName("CCAP");
		entity2.setPlanStatus("denied");
		repo.save(entity2);
		EligibilityDetails entity3 = new EligibilityDetails();
		entity3.setEligId(3);
		entity3.setName("Ganesh");
		entity3.setEmail("ganesh200@gmail.com");
		entity3.setMobile(7788996655l);
		entity3.setGender('M');
		entity3.setSsn(21407760l);
		entity3.setPlanName("QHP");
		entity3.setPlanStatus("closed");
		repo.save(entity3);
		
	}

}
