package com.kttk.lab5.hangkhong.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kttk.lab5.hangkhong.entities.NhanVien;
import com.kttk.lab5.repository.NhanVienRepository;

@Service
public class NhanVienServiceImpl implements NhanVienService {
  @Autowired
  NhanVienRepository nhanVienRepository;

  @Override
  public Long calculateTongLuong() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<NhanVien> findByLuong(int luong, String operator) {
    List<NhanVien> nhanViens = nhanVienRepository.findByLuong(luong, operator);
    return nhanViens;
  }

  @Override
  public List<NhanVien> findByLoaiMayBay(String loai) {
    List<NhanVien> nhanViens = nhanVienRepository.findByLoaiMayBay(loai);
    return nhanViens;
  }

  @Override
  public List<NhanVien> findByMaMayBay(int maMayBay) {
    List<NhanVien> nhanViens = nhanVienRepository.findByMaMayBay(maMayBay);
    return nhanViens;
  }
  
}
