package com.kttk.lab5.hangkhong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kttk.lab5.hangkhong.entities.MayBay;
import com.kttk.lab5.hangkhong.services.MayBayService;

@RestController
@RequestMapping("/api/v1/may-bay")
public class MayBayController {
  @Autowired
  MayBayService mayBayService;

  @GetMapping("/tam-bay/{operator}/{tamBay}")
  public List<MayBay> getMayBayByTamBay(@PathVariable(name = "operator") String operator, @PathVariable(name = "tamBay") int tamBay) {
    return mayBayService.findByTamBay(tamBay, operator);
  }

  @GetMapping("/loai/{loai}")
  public List<MayBay> getMayBayByLoai(@PathVariable(name = "loai") String loai) {
    return mayBayService.findByLoai(loai);
  }

}
