package com.kttk.lab5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kttk.lab5.hangkhong.entities.ChuyenBay;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {
  List<ChuyenBay> findByGaDi(String gaDi);

  List<ChuyenBay> findByGaDen(String gaDi);

  @Query("select c from chuyenbay c where c.DoDai ?2 ?1")
  List<ChuyenBay> findByDoDai(int doDai, String operator);

  @Query("select c from chuyenbay c where c.GaDi = ?1 and c.GaDen = ?2")
  List<ChuyenBay> findByGaDiGaDen(String gaDi, String gaDen);

}
