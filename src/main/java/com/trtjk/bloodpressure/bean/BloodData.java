package com.trtjk.bloodpressure.bean;

public class BloodData {
    private Long id;

    private Integer systoLicpressure;

    private Integer diastoLicpressure;

    private Integer pulse;

    private String time;

    private Boolean level;

    private String imei;

    private Boolean mode;

    private String sn;

    private String key;

    private String unique;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSystoLicpressure() {
        return systoLicpressure;
    }

    public void setSystoLicpressure(Integer systoLicpressure) {
        this.systoLicpressure = systoLicpressure;
    }

    public Integer getDiastoLicpressure() {
        return diastoLicpressure;
    }

    public void setDiastoLicpressure(Integer diastoLicpressure) {
        this.diastoLicpressure = diastoLicpressure;
    }

    public Integer getPulse() {
        return pulse;
    }

    public void setPulse(Integer pulse) {
        this.pulse = pulse;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public Boolean getLevel() {
        return level;
    }

    public void setLevel(Boolean level) {
        this.level = level;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    public Boolean getMode() {
        return mode;
    }

    public void setMode(Boolean mode) {
        this.mode = mode;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getUnique() {
        return unique;
    }

    public void setUnique(String unique) {
        this.unique = unique == null ? null : unique.trim();
    }
}