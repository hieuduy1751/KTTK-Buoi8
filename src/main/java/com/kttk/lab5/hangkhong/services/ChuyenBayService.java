package com.kttk.lab5.hangkhong.services;

import java.util.List;

import com.kttk.lab5.hangkhong.entities.ChuyenBay;
import com.kttk.lab5.hangkhong.entities.MayBay;
import com.kttk.lab5.hangkhong.entities.NhanVien;

public interface ChuyenBayService {
  List<ChuyenBay> findByGaDi(String gaDi);
  List<ChuyenBay> findByGaDen(String gaDi);
  List<MayBay> findByTamBay(int tamBay, String operator);
  List<NhanVien> findByLuong(int luong, String operator);
  List<ChuyenBay> findByDoDai(int doDai, String operator);
  List<ChuyenBay> findByGaDiGaDen(String gaDi, String gaDen);
  List<MayBay> findByLoai(String loai);
  Long calculateTongLuong();
  List<NhanVien> findByLoaiMayBay(String loai);
  List<NhanVien> findByMaMayBay(int maMayBay);
}
