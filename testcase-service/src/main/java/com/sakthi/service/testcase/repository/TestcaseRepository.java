package com.sakthi.service.testcase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sakthi.service.testcase.entity.Testcase;


@Repository
public interface TestcaseRepository extends JpaRepository<Testcase, Long>{

}
