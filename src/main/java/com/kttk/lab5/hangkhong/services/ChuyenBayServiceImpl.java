package com.kttk.lab5.hangkhong.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kttk.lab5.hangkhong.entities.ChuyenBay;
import com.kttk.lab5.hangkhong.entities.MayBay;
import com.kttk.lab5.hangkhong.entities.NhanVien;
import com.kttk.lab5.repository.ChuyenBayRepository;

@Service
public class ChuyenBayServiceImpl implements ChuyenBayService {
  @Autowired
  private ChuyenBayRepository chuyenBayRepository;

  @Override
  public List<ChuyenBay> findByGaDi(String gaDi) {
    List<ChuyenBay> chuyenBays = chuyenBayRepository.findByGaDi(gaDi);
    return chuyenBays;
  }

  @Override
  public List<ChuyenBay> findByGaDen(String gaDen) {
    List<ChuyenBay> chuyenBays = chuyenBayRepository.findByGaDen(gaDen);
    return chuyenBays;
  }

  @Override
  public List<ChuyenBay> findByDoDai(int doDai, String operator) {
    List<ChuyenBay> chuyenBays = chuyenBayRepository.findByDoDai(doDai, operator);
    return null;
  }

  @Override
  public List<ChuyenBay> findByGaDiGaDen(String gaDi, String gaDen) {
    List<ChuyenBay> chuyenBays = chuyenBayRepository.findByGaDiGaDen(gaDi, gaDen);
    return chuyenBays;
  }

    
}
