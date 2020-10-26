package form;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;

public class MyUploadForm {

    private String description;
    public String image;

    public MultipartFile fileUpdate2;

    // Upload files.

    private MultipartFile fileUpdate;

    public String getDescription() {

        return description;

    }

    public void setDescription(String description) {

        this.description = description;

    }

    public MultipartFile getFileDatas() {

        return fileUpdate;

    }

    public void setFileUpdate(MultipartFile fileUpdate) {

        this.fileUpdate = fileUpdate;

    }
    public boolean upLoadFile(){
        try {
            String fileNameAndPath ="F:\\CODE GYM\\Month-4\\week1\\TH_LoadImage\\target\\SpringMVC\\WEB-INF\\uploads\\";
            image = "http://localhost:8080/uploads/"+fileUpdate.getOriginalFilename();
            fileUpdate.transferTo(new File(fileNameAndPath + fileUpdate.getOriginalFilename()));
            return true;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
//    public boolean upServer(){
//        try {
//            String fileNameAndPath ="F:\\CODE GYM\\Month-4\\week1\\TH_Uploadfile\\src\\main\\webapp\\WEB-INF\\uploads\\";
//            fileUpdate2.transferTo(new File(fileNameAndPath + fileUpdate2.getOriginalFilename()));
//            return true;
//        }catch (Exception ex){
//            System.out.println(ex.getMessage());
//            return false;
//        }
//    }

}