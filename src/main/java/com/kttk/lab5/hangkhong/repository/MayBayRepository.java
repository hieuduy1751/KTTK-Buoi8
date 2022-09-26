package com.kttk.lab5.hangkhong.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kttk.lab5.hangkhong.entities.MayBay;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay, String> {
  
  @Query(value = "select * from maybay m where m.tamBay ?2 ?1", nativeQuery = true)
  List<MayBay> findByTamBay(int tamBay, String operator);

  List<MayBay> findByLoai(String loai);  
}
