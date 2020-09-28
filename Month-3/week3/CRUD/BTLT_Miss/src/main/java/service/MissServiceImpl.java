package service;

import model.Miss;
import model.Province;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MissServiceImpl implements MissService {
    public static final Map<Integer, Miss> missList = new HashMap<>();


    static {
        ProvinceService provinceService=new ProvinceServiceImpl();

        missList.put(1, new Miss(1, "Do Chanh Tin", "20/1/1995", "16 Hà Nội", "0000000000", "docanhtin@gmail.com", "00000000000", "sinh vien", "DH", "Kinh", "CodeGymHue", 17, 65, "Ca hat", "https://sohanews.sohacdn.com/thumb_w/660/2019/11/28/t4-1574938681503641538952-crop-15749388500231394954615.jpg", "Hà Nội"));
        missList.put(2, new Miss(2, "Vo Long", "20/1/1995", "16 Hà Nội", "0000000000", "docanhtin@gmail.com", "00000000000", "sinh vien", "DH", "Kinh", "CodeGymHue", 17, 65, "Ca hat", "https://kenh14cdn.com/2019/1/5/photo-1-1546660022372257373934.jpg", "Hà Nội"));
        missList.put(3, new Miss(3, "Le Hiep", "20/1/1995", "16 Hà Nội", "0000000000", "docanhtin@gmail.com", "00000000000", "sinh vien", "DH", "Kinh", "CodeGymHue", 17, 65, "Ca hat", "https://nguoinoitieng.tv/images/nnt/97/0/bcjl.jpg", "Hà Nội"));
        missList.put(4, new Miss(4, "Le Tan Phuc", "20/1/1995", "16 Hà Nội", "0000000000", "docanhtin@gmail.com", "00000000000", "sinh vien", "DH", "Kinh", "CodeGymHue", 17, 65, "Ca hat", "https://i.pinimg.com/originals/4d/44/a8/4d44a8ec81325e4444c0319526862c38.jpg", "Hà Nội"));
        missList.put(5, new Miss(5, "Nguyen Van Huong", "20/1/1995", "16 Hà Nội", "0000000000", "docanhtin@gmail.com", "00000000000", "sinh vien", "DH", "Kinh", "CodeGymHue", 17, 65, "Ca hat", "https://vnn-imgs-f.vgcloud.vn/2020/09/26/20/suc-khoe-cua-huong-giang-xuong-doc-vi-phau-thuat-qua-nhieu.jpg", "Hà Nội"));
    }


    @Override
    public List<Miss> findAll() {
        return new ArrayList<>(missList.values());
    }

    @Override
    public void save(Miss miss) {
        missList.put(miss.getId(), miss);
    }

    @Override
    public Miss findById(int id) {
        return missList.get(id);
    }

    @Override
    public void update(int id, Miss miss) {
        missList.put(id, miss);
    }

    @Override
    public void remove(int id) {
        missList.remove(id);

    }
    @Override
    public List<Miss> checkStatus() {
        List<Miss> missArrayList=new ArrayList<>();
        for (Miss miss:missList.values()){
//            if (miss.isDuyet())
                missArrayList.add(miss);
        }
        return missArrayList;
    }
}
