//package newarch.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.BufferedOutputStream;
//import java.io.File;
//import java.io.FileOutputStream;
//
//@Controller
//public class FileUploadController {
//
//    @RequestMapping(value = "/upload", method = RequestMethod.GET)
//    public @ResponseBody String provideUploadInfo() {
//        return "Вы можете загружать файл с использованием того же URL.";
//    }
//
//    @RequestMapping(value = "/upload", method = RequestMethod.POST)
//    public @ResponseBody String handleFileUpload(@RequestParam("name") String name,
//                                                 @RequestParam("file") MultipartFile file1) {
//        if (!file1.isEmpty()) {
//            try {
//                byte[] bytes = file1.getBytes();
//                BufferedOutputStream stream =
//                        new BufferedOutputStream(new FileOutputStream(new File(name + "-uploaded")));
//                stream.write(bytes);
//                stream.close();
//                return "Вы удачно загрузили " + name + " в " + name + "-uploaded !";
//            } catch (Exception e) {
//                return "Вам не удалось загрузить " + name + " => " + e.getMessage();
//            }
//        } else {
//            return "Вам не удалось загрузить " + name + " потому что файл пустой.";
//        }
//    }
//
//}

