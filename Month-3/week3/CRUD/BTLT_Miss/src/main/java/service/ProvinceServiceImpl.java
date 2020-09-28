package service;

import model.Miss;
import model.Province;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProvinceServiceImpl implements ProvinceService {
    public static final Map<Long, Province> provinceList = new HashMap<>();

    static {
        provinceList.put(1L, new Province(1L, "An Giang"));
        provinceList.put(2L, new Province(2L, "Bà Rịa - Vũng Tàu"));
        provinceList.put(3L, new Province(3L, "Bắc Giang"));
        provinceList.put(4L, new Province(4L, "Bắc Kạn"));
        provinceList.put(5L, new Province(5L, "Bạc Liêu"));
        provinceList.put(6L, new Province(6L, "Bắc Ninh"));
        provinceList.put(7L, new Province(7L, "Bến Tre"));
        provinceList.put(8L, new Province(8L, "Bình Định"));
        provinceList.put(9L, new Province(9L, "Bình Dương"));
        provinceList.put(10L, new Province(10L, "Bình Phước"));
        provinceList.put(11L, new Province(11L, "Bình Thuận"));
        provinceList.put(12L, new Province(12L, "Cà Mau"));
        provinceList.put(13L, new Province(13L, "Cao Bằng"));
        provinceList.put(14L, new Province(14L, "Đắk Lắk"));
        provinceList.put(15L, new Province(15L, "Đắk Nông"));
        provinceList.put(16L, new Province(16L, "Điện Biên"));
        provinceList.put(17L, new Province(17L, "Đồng Nai"));
        provinceList.put(18L, new Province(18L, "Đồng Tháp"));
        provinceList.put(19L, new Province(19L, "Gia Lai"));
        provinceList.put(20L, new Province(20L, "Hà Giang"));
        provinceList.put(21L, new Province(21L, "Hà Nam"));
        provinceList.put(22L, new Province(22L, "Hà Tĩnh"));
        provinceList.put(23L, new Province(23L, "Hải Dương"));
        provinceList.put(24L, new Province(24L, "Hậu Giang"));
        provinceList.put(25L, new Province(25L, "Hòa Bình"));
        provinceList.put(26L, new Province(26L, "Hưng Yên"));
        provinceList.put(27L, new Province(27L, "Khánh Hòa"));
        provinceList.put(28L, new Province(28L, "Kiên Giang"));
        provinceList.put(29L, new Province(29L, "Kon Tum"));
        provinceList.put(30L, new Province(30L, "Lai Châu"));
        provinceList.put(31L, new Province(31L, "Lâm Đồng"));
        provinceList.put(32L, new Province(32L, "Lạng Sơn"));
        provinceList.put(33L, new Province(33L, "Lào Cai"));
        provinceList.put(34L, new Province(34L, "Long An"));
        provinceList.put(35L, new Province(35L, "Nam Định"));
        provinceList.put(36L, new Province(36L, "Nghệ An"));
        provinceList.put(37L, new Province(37L, "Ninh Bình"));
        provinceList.put(38L, new Province(38L, "Ninh Thuận"));
        provinceList.put(39L, new Province(39L, "Phú Thọ"));
        provinceList.put(40L, new Province(40L, "Quảng Bình"));
        provinceList.put(41L, new Province(41L, "Quảng Nam"));
        provinceList.put(42L, new Province(42L, "Quảng Ngãi"));
        provinceList.put(43L, new Province(43L, "Quảng Ninh"));
        provinceList.put(44L, new Province(44L, "Quảng Trị"));
        provinceList.put(45L, new Province(45L, "Sóc Trăng"));
        provinceList.put(46L, new Province(46L, "Sơn La"));
        provinceList.put(47L, new Province(47L, "Tây Ninh"));
        provinceList.put(48L, new Province(48L, "Thái Bình"));
        provinceList.put(49L, new Province(49L, "Thái Nguyên"));
        provinceList.put(50L, new Province(50L, "Thanh Hóa"));
        provinceList.put(51L, new Province(51L, "Thừa Thiên Huế"));
        provinceList.put(52L, new Province(52L, "Tiền Giang"));
        provinceList.put(53L, new Province(53L, "Trà Vinh"));
        provinceList.put(54L, new Province(54L, "Tuyên Quang"));
        provinceList.put(55L, new Province(55L, "Vĩnh Long"));
        provinceList.put(56L, new Province(56L, "Vĩnh Phúc"));
        provinceList.put(57L, new Province(57L, "Yên Bái"));
        provinceList.put(58L, new Province(58L, "Phú Yên"));
        provinceList.put(59L, new Province(59L, "Cần Thơ"));
        provinceList.put(60L, new Province(60L, "Đà Nẵng"));
        provinceList.put(61L, new Province(61L, "Hải Phòng"));
        provinceList.put(62L, new Province(62L, "Hà Nội"));
        provinceList.put(63L, new Province(63L, "TP HCM"));


    }

    @Override
    public List<Province> findAll() {
        return new ArrayList<>(provinceList.values());
    }

    @Override
    public Province findById(Long id) {
        return provinceList.get(id);
    }
}
