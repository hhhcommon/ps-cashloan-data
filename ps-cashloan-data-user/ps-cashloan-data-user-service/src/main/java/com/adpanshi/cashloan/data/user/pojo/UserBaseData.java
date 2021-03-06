package com.adpanshi.cashloan.data.user.pojo;

import com.adpanshi.cashloan.common.enums.OrganizationEnum;
import com.adpanshi.cashloan.common.utils.BeanUtil;

/**
 * Created by zsw on 2018/7/15 0015.
 */
public class UserBaseData implements java.io.Serializable, BeanUtil.ConversionCustomizble {
    private static final long serialVersionUID = 1L;
    private Integer countryType;//国家
    private Integer productType;//产品类型
    private String aadhaarNo;//身份证
    private String name;//姓名
    private String mobile;//手机号
    private String email;//邮箱
    private String deviceFingerprint;//设备指纹

    public Integer getCountryType() {
        return countryType;
    }

    public void setCountryType(Integer countryType) {
        this.countryType = countryType;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public String getAadhaarNo() {
        return aadhaarNo;
    }

    public void setAadhaarNo(String aadhaarNo) {
        this.aadhaarNo = aadhaarNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDeviceFingerprint() {
        return deviceFingerprint;
    }

    public void setDeviceFingerprint(String deviceFingerprint) {
        this.deviceFingerprint = deviceFingerprint;
    }

    @Override
    public void convertOthers(Object o) {
        Object countryType = BeanUtil.getPropValue(o, "countryType");
        if (countryType != null && countryType instanceof OrganizationEnum.CountryType) {
            this.setCountryType(((OrganizationEnum.CountryType) countryType).getValue());
        }

        Object productType = BeanUtil.getPropValue(o, "productType");
        if (productType != null && productType instanceof OrganizationEnum.ProductType) {
            this.setProductType(((OrganizationEnum.ProductType) productType).getValue());
        }
    }
}
