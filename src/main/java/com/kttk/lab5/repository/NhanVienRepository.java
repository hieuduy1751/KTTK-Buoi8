package com.kttk.lab5.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kttk.lab5.hangkhong.entities.NhanVien;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, String> {

  @Query("select n from nhanvien n where n.Luong ?2 ?1")
  List<NhanVien> findByLuong(int luong, String operator); 
  
  @Query("select n from nhanvien n join chungnhan c join maybay m on n.MaNV = c.MaNV and c.MaMB = m.MaMB where m.Loai = ?1")
  List<NhanVien> findByLoaiMayBay(String loai);

  @Query("select n from nhanvien n join chungnhan c on n.MaNV = c.MaNV where c.MaMayBay = ?1")
  List<NhanVien> findByMaMayBay(int maMayBay);

  @Query("select sum(n.Luong) from nhanvien n")
  Long calculateTongLuong();
}
