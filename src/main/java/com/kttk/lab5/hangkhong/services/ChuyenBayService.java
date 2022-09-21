package com.kttk.lab5.hangkhong.services;

import java.util.List;

import com.kttk.lab5.hangkhong.entities.ChuyenBay;
import com.kttk.lab5.hangkhong.entities.MayBay;
import com.kttk.lab5.hangkhong.entities.NhanVien;

public interface ChuyenBayService {
  List<ChuyenBay> findByGaDi(String gaDi);
  List<ChuyenBay> findByGaDen(String gaDi);
  List<ChuyenBay> findByDoDai(int doDai, String operator);
  List<ChuyenBay> findByGaDiGaDen(String gaDi, String gaDen);
}
