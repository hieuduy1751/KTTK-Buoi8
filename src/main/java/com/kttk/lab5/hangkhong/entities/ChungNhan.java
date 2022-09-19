package com.kttk.lab5.hangkhong.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "chungnhan")
public class ChungNhan {
  @OneToOne
  @JoinColumn(name = "fk_nhanvien")
  private NhanVien nhanVien;
  @OneToOne
  @JoinColumn(name = "fk_maybay")
  private MayBay mauBay;

  public ChungNhan() {
  }

  public ChungNhan(NhanVien nhanVien, MayBay mauBay) {
    this.nhanVien = nhanVien;
    this.mauBay = mauBay;
  }

  public NhanVien getNhanVien() {
    return nhanVien;
  }

  public void setNhanVien(NhanVien nhanVien) {
    this.nhanVien = nhanVien;
  }

  public MayBay getMauBay() {
    return mauBay;
  }

  public void setMauBay(MayBay mauBay) {
    this.mauBay = mauBay;
  }

  @Override
  public String toString() {
    return "ChungNhan [mauBay=" + mauBay + ", nhanVien=" + nhanVien + "]";
  }

}
