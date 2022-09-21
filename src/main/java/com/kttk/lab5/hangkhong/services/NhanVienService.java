package com.kttk.lab5.hangkhong.services;

import java.util.List;

import com.kttk.lab5.hangkhong.entities.NhanVien;

public interface NhanVienService {
  Long calculateTongLuong();

  List<NhanVien> findByLuong(int luong, String operator);

  List<NhanVien> findByLoaiMayBay(String loai);

  List<NhanVien> findByMaMayBay(int maMayBay);  
}
