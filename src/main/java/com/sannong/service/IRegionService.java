package com.sannong.service;

import com.sannong.domain.region.City;
import com.sannong.domain.region.District;
import com.sannong.domain.region.Province;

import java.util.List;

/**
 * Created by Bright Huang on 10/26/14.
 */
public interface IRegionService {
    public List<Province> getProvinces();
    public List<City> getCities(Long provinceIndex);
    public List<District> getDistricts(Long cityIndex);
    public Province getProvince(long provinceIndex);
    public City getCity(long cityIndex);
    public District getDistrict(long districtIndex);
}
