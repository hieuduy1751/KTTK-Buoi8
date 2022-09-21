package com.kttk.lab5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kttk.lab5.hangkhong.entities.MayBay;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay, String> {
  @Query("select m from maybay m where m.TamBay ?2 ?1")
  List<MayBay> findByTamBay(int tamBay, String operator);

  List<MayBay> findByLoai(String loai);  
}
