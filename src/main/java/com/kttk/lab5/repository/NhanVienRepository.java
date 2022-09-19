package com.kttk.lab5.repository;

import org.springframework.data.repository.Repository;

import com.kttk.lab5.hangkhong.entities.NhanVien;

@org.springframework.stereotype.Repository
public interface NhanVienRepository extends Repository<NhanVien, String> {
  
}
