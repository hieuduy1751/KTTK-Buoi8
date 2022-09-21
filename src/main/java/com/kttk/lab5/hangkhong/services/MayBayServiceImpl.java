package com.kttk.lab5.hangkhong.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kttk.lab5.hangkhong.entities.MayBay;
import com.kttk.lab5.repository.MayBayRepository;

@Service
public class MayBayServiceImpl implements MayBayService {
  @Autowired
  MayBayRepository mayBayRepository;

  @Override
  public List<MayBay> findByTamBay(int tamBay, String operator) {
    List<MayBay> mayBays = mayBayRepository.findByTamBay(tamBay, operator);
    return mayBays;
  }

  @Override
  public List<MayBay> findByLoai(String loai) {
    List<MayBay> mayBays = mayBayRepository.findByLoai(loai);
    return mayBays;
  }
  
}
