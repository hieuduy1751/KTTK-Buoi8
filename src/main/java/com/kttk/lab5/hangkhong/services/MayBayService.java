package com.kttk.lab5.hangkhong.services;

import java.util.List;

import com.kttk.lab5.hangkhong.entities.MayBay;

public interface MayBayService {
  List<MayBay> findByTamBay(int tamBay, String operator);

  List<MayBay> findByLoai(String loai);
}
