package com.kttk.lab5.hangkhong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kttk.lab5.hangkhong.entities.ChuyenBay;
import com.kttk.lab5.hangkhong.services.ChuyenBayService;

@RestController
@RequestMapping("/api/v1/chuyen-bay")
public class ChuyenBayController {
  @Autowired
  ChuyenBayService chuyenBayService;

  @GetMapping("/ga-di/{gaDi}")
  public List<ChuyenBay> getChuyenBayByGaDi(@PathVariable(name = "gaDi") String gaDi) {
    return chuyenBayService.findByGaDi(gaDi);
  }

  @GetMapping("/ga-den/{gaDen}")
  public List<ChuyenBay> getChuyenBayByGaDen(@PathVariable(name = "gaDen") String gaDen) {
    return chuyenBayService.findByGaDen(gaDen);
  }

  @GetMapping("/do-dai/{operator}/{doDai}")
  public List<ChuyenBay> getChuyenBayByDoDai(@PathVariable(name = "operator") String operator, @PathVariable(name = "doDai") int doDai) {
    return chuyenBayService.findByDoDai(doDai, operator);
  }

  @GetMapping("/{gaDi}/{gaDen}")
  public List<ChuyenBay> getChuyenBayByGaDiGaDen(@PathVariable(name = "gaDi") String gaDi, @PathVariable(name = "gaDen") String gaDen) {
    return chuyenBayService.findByGaDiGaDen((gaDi), gaDen);
  }

}
