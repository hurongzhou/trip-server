package com.trip.controller;

import com.trip.common.APITripResult;
import com.trip.common.StringUtil;
import com.trip.entity.Image;
import com.trip.service.ImageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

@Controller
public class FileUploadController {

    @Resource
    ImageService imageService;

    @RequestMapping("fileUpload.json")
    @ResponseBody
    public APITripResult fileUpload(HttpServletRequest request, MultipartFile file,String type,Integer foreignId){
        APITripResult api=new APITripResult();
        try {
            Image image=new Image();
            if (type.equals("store")){
                image.setStoreId(foreignId);
            }
            if (type.equals("commodity")){
                image.setCommodityId(foreignId);
            }
            if (type.equals("restaurant")){
                image.setRestaurantId(foreignId);
            }
            if (type.equals("dishes")){
                image.setDishesId(foreignId);
            }
            if (type.equals("viewpoint")){
                image.setViewpointId(foreignId);
            }
//            String path = request.getSession().getServletContext().getRealPath("upload");
            String path="/Users/hurong/upload";
            String originalFileName=file.getOriginalFilename();
            image.setImageName(originalFileName);
            String fileName = StringUtil.getUUID()+originalFileName;
            String url=path+"/"+fileName;
            image.setUrl(url);
            File targetFile = new File(path, fileName);
            //保存
            file.transferTo(targetFile);
            imageService.addImage(image);
            api.setMassage("上传成功！");
            api.setStatus(APITripResult.SUCCESS);
        }catch (Exception e) {
            e.printStackTrace();
            api.setMassage(e.getMessage());
            api.setStatus(APITripResult.SYSTEM_ERROR);
        }
        return api;
    }

    @RequestMapping("download.json")
    public void download(HttpServletRequest request, HttpServletResponse response,String fileUrl){
        try {
            String realPath=fileUrl;
            String fileName = realPath.substring(realPath.lastIndexOf("/")+1);//获取要下载的文件名
            //设置content-disposition响应头控制浏览器以下载的形式打开文件，中文文件名要使用URLEncoder.encode方法进行编码，否则会出现文件名乱码
            response.setHeader("content-disposition", "attachment;filename="+ URLEncoder.encode(fileName, "UTF-8"));
            InputStream in = new FileInputStream(realPath);//获取文件输入流
            int len = 0;
            byte[] buffer = new byte[1024];
            OutputStream out = response.getOutputStream();
            while ((len = in.read(buffer)) > 0) {
                out.write(buffer,0,len);//将缓冲区的数据输出到客户端浏览器
            }
            in.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
