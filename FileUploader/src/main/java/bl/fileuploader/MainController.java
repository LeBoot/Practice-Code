/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.fileuploader;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Boone
 */
@Controller
public class MainController {
    
    @GetMapping({"/", "/home"})
    public String displayHomePage() {
        return "file-uploader";
    }
    
    @ResponseBody
    @PostMapping("/add-file")
    public ResponseEntity addFile(
            @RequestParam("fileInput") MultipartFile mp3File,
            @RequestParam("nameOfFile") String nameOfFile
    ) {
        String mp3url = "/mp3/" + mp3File.getOriginalFilename();
        
        //try to save file locally
        try {
            //Get filename and build a local filepath
            String filename = mp3File.getOriginalFilename();
            String directory = "C:\\Repos\\Practice-Code\\FileUploader\\src\\main\\resources\\static\\mp3";
            String filepath = Paths.get(directory, filename).toString();
            
            //Save file locally
            BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(filepath)));
            stream.write(mp3File.getBytes());
            stream.close();
        } catch (IOException e) {
            return new ResponseEntity(e, HttpStatus.BAD_REQUEST);
        }
        
//        String sellerUsername = SecurityUtils.getUserName();
//        User user = userService.findByUsername(sellerUsername);
//        int serverUserId = user.getUserId();
//        Seller seller = sellerService.findByUserId(serverUserId);
//        seller.getUser().setAcctStatus(4);
//        seller.setPublicName(publicName);
//        seller.setPublicCompany(publicCompany);
//        seller.setPublicIntroduction(publicIntroduction);
//        seller.setPhotoUrl(photoUrl);
//        sellerService.save(seller);
        
        
        return new ResponseEntity("New File Created Successfully", HttpStatus.CREATED);
        
    }
    
}

//@ResponseBody
//    @PostMapping("/seller/edit-public-profile-details/")
//    public ResponseEntity editPublicProfileDetails(@RequestParam("sellerAccountPagePublicProfileDetailsPublicName") String publicName,
//            @RequestParam("sellerAccountPagePublicProfileDetailsPublicCompany") String publicCompany,
//            @RequestParam("sellerAccountPagePublicProfileDetailsPublicIntroduction") String publicIntroduction,
//            @RequestParam("sellerAccountPagePublicProfileDetailsPublicImageUpload") MultipartFile photoFile) {
//        String photoUrl = "/uploaded-photos/" + photoFile.getOriginalFilename();
//        try {
//            // Get the filename and build the local file path (be sure that the
//            // application have write permissions on such directory)
//            String filename = photoFile.getOriginalFilename();
//            String directory = "C:\\Users\\Executor\\Desktop\\public_html\\dev10-software-guild-files\\Capstone\\Website\\imaginapainting\\src\\main\\resources\\static\\uploaded-photos";
//            String filepath = Paths.get(directory, filename).toString();
//            // Save the file locally
//            BufferedOutputStream stream
//                    = new BufferedOutputStream(new FileOutputStream(new File(filepath)));
//            stream.write(photoFile.getBytes());
//            stream.close();
//        } catch (IOException e) {
//            return new ResponseEntity(e, HttpStatus.BAD_REQUEST);
//        }
//        String sellerUsername = SecurityUtils.getUserName();
//        User user = userService.findByUsername(sellerUsername);
//        int serverUserId = user.getUserId();
//        Seller seller = sellerService.findByUserId(serverUserId);
//        seller.getUser().setAcctStatus(4);
//        seller.setPublicName(publicName);
//        seller.setPublicCompany(publicCompany);
//        seller.setPublicIntroduction(publicIntroduction);
//        seller.setPhotoUrl(photoUrl);
//        sellerService.save(seller);
//        return new ResponseEntity("Successfully updated public profile details.", HttpStatus.OK);
//    }