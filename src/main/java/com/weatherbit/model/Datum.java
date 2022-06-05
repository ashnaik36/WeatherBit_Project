package com.weatherbit.model;

import java.util.HashMap;
import java.util.Map;
public class Datum {

    private Double rh;
    private String pod;
    private Integer lon;
    private Integer pres;
    private String timezone;
    private String obTime;
    private String countryCode;
    private Integer clouds;
    private Integer ts;
    private Integer solarRad;
    private String stateCode;
    private String city_name;
    private Double windSpd;
    private String windCdirFull;
    private String windCdir;
    private Integer slp;
    private Integer vis;
    private Integer hAngle;
    private String sunset;
    private Integer dni;
    private Double dewpt;
    private Integer snow;
    private Integer uv;
    private Integer precip;
    private Integer windDir;
    private String sunrise;
    private Integer ghi;
    private Integer dhi;
    private Integer aqi;
    private Integer lat;
    private Weather weather;
    private String datetime;
    private Double temp;
    private String station;
    private Double elevAngle;
    private Double appTemp;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Double getRh() {
        return rh;
    }

    public void setRh(Double rh) {
        this.rh = rh;
    }

    public String getPod() {
        return pod;
    }

    public void setPod(String pod) {
        this.pod = pod;
    }

    public Integer getLon() {
        return lon;
    }

    public void setLon(Integer lon) {
        this.lon = lon;
    }

    public Integer getPres() {
        return pres;
    }

    public void setPres(Integer pres) {
        this.pres = pres;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getObTime() {
        return obTime;
    }

    public void setObTime(String obTime) {
        this.obTime = obTime;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Integer getClouds() {
        return clouds;
    }

    public void setClouds(Integer clouds) {
        this.clouds = clouds;
    }

    public Integer getTs() {
        return ts;
    }

    public void setTs(Integer ts) {
        this.ts = ts;
    }

    public Integer getSolarRad() {
        return solarRad;
    }

    public void setSolarRad(Integer solarRad) {
        this.solarRad = solarRad;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getCityName() {
        return city_name;
    }

    public void setCityName(String city_name) {
        this.city_name = city_name;
    }

    public Double getWindSpd() {
        return windSpd;
    }

    public void setWindSpd(Double windSpd) {
        this.windSpd = windSpd;
    }

    public String getWindCdirFull() {
        return windCdirFull;
    }

    public void setWindCdirFull(String windCdirFull) {
        this.windCdirFull = windCdirFull;
    }

    public String getWindCdir() {
        return windCdir;
    }

    public void setWindCdir(String windCdir) {
        this.windCdir = windCdir;
    }

    public Integer getSlp() {
        return slp;
    }

    public void setSlp(Integer slp) {
        this.slp = slp;
    }

    public Integer getVis() {
        return vis;
    }

    public void setVis(Integer vis) {
        this.vis = vis;
    }

    public Integer gethAngle() {
        return hAngle;
    }

    public void sethAngle(Integer hAngle) {
        this.hAngle = hAngle;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Double getDewpt() {
        return dewpt;
    }

    public void setDewpt(Double dewpt) {
        this.dewpt = dewpt;
    }

    public Integer getSnow() {
        return snow;
    }

    public void setSnow(Integer snow) {
        this.snow = snow;
    }

    public Integer getUv() {
        return uv;
    }

    public void setUv(Integer uv) {
        this.uv = uv;
    }

    public Integer getPrecip() {
        return precip;
    }

    public void setPrecip(Integer precip) {
        this.precip = precip;
    }

    public Integer getWindDir() {
        return windDir;
    }

    public void setWindDir(Integer windDir) {
        this.windDir = windDir;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public Integer getGhi() {
        return ghi;
    }

    public void setGhi(Integer ghi) {
        this.ghi = ghi;
    }

    public Integer getDhi() {
        return dhi;
    }

    public void setDhi(Integer dhi) {
        this.dhi = dhi;
    }

    public Integer getAqi() {
        return aqi;
    }

    public void setAqi(Integer aqi) {
        this.aqi = aqi;
    }

    public Integer getLat() {
        return lat;
    }

    public void setLat(Integer lat) {
        this.lat = lat;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public Double getElevAngle() {
        return elevAngle;
    }

    public void setElevAngle(Double elevAngle) {
        this.elevAngle = elevAngle;
    }

    public Double getAppTemp() {
        return appTemp;
    }

    public void setAppTemp(Double appTemp) {
        this.appTemp = appTemp;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
