package controller;

import form.MyUploadForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller

public class MyFileUploadController {

    @GetMapping(value = "/uploadOneFile")
    public String uploadOneFileHandler(Model model) {
//        MyUploadForm myUploadForm = new MyUploadForm();
//        model.addAttribute("myUploadForm", myUploadForm);
        // Forward to "/WEB-INF/pages/uploadOneFile.jsp".
        return "index";
    }

    // POST: Xử lý Upload
    @PostMapping(value = "/uploadOneFile")
    public String uploadOneFileHandlerPOST(Model model, @RequestParam("fileUpdate") MultipartFile fileUpdate) {
        MyUploadForm myUploadForm = new MyUploadForm();
        myUploadForm.setFileUpdate(fileUpdate);
        myUploadForm.upLoadFile();
        model.addAttribute("image", myUploadForm.image);
        return "_menu";
    }

}