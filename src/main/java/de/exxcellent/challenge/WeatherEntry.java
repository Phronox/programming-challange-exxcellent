package de.exxcellent.challenge;

import java.util.ArrayList;
import java.util.Map;

public class WeatherEntry extends Entry{
  private float mxt;
  private float mnt;
  private float avt;
  private float avdp;
  private float onehrp_tpcpn;
  private float pdir;
  private float avsp;
  private float dir;
  private float mxs;
  private float skyc;
  private float mxr;
  private float mn;
  private float r_avslp;

  public WeatherEntry(ArrayList<String> columnNames,String entryID, ArrayList<Float> entries) {
    super(columnNames,entryID,entries);
    mxt = entryMap.get("MxT");
    mnt = entryMap.get("MnT");
    avt = entryMap.get("AvT");
    avdp = entryMap.get("AvDP");
    onehrp_tpcpn = entryMap.get("1HrP TPcpn");
    pdir = entryMap.get("PDir");
    avsp = entryMap.get("AvSp");
    dir = entryMap.get("Dir");
    mxs = entryMap.get("MxS");
    skyc = entryMap.get("SkyC");
    mxr = entryMap.get("MxR");
    mn = entryMap.get("Mn");
    r_avslp = entryMap.get("R AvSLP");
  }

  public float getMxt() {
    return mxt;
  }

  public void setMxt(float mxt) {
    this.mxt = mxt;
  }

  public float getMnt() {
    return mnt;
  }

  public void setMnt(float mnt) {
    this.mnt = mnt;
  }

  public float getAvt() {
    return avt;
  }

  public void setAvt(float avt) {
    this.avt = avt;
  }

  public float getAvdp() {
    return avdp;
  }

  public void setAvdp(float avdp) {
    this.avdp = avdp;
  }

  public float getOnehrp_tpcpn() {
    return onehrp_tpcpn;
  }

  public void setOnehrp_tpcpn(float onehrp_tpcpn) {
    this.onehrp_tpcpn = onehrp_tpcpn;
  }

  public float getPdir() {
    return pdir;
  }

  public void setPdir(float pdir) {
    this.pdir = pdir;
  }

  public float getAvsp() {
    return avsp;
  }

  public void setAvsp(float avsp) {
    this.avsp = avsp;
  }

  public float getDir() {
    return dir;
  }

  public void setDir(float dir) {
    this.dir = dir;
  }

  public float getMxs() {
    return mxs;
  }

  public void setMxs(float mxs) {
    this.mxs = mxs;
  }

  public float getSkyc() {
    return skyc;
  }

  public void setSkyc(float skyc) {
    this.skyc = skyc;
  }

  public float getMxr() {
    return mxr;
  }

  public void setMxr(float mxr) {
    this.mxr = mxr;
  }

  public float getMn() {
    return mn;
  }

  public void setMn(float mn) {
    this.mn = mn;
  }

  public float getR_avslp() {
    return r_avslp;
  }

  public void setR_avslp(float r_avslp) {
    this.r_avslp = r_avslp;
  }
}
