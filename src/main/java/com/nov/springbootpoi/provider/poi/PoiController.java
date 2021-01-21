package com.nov.springbootpoi.provider.poi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: november
 * Date: 2021/1/21 12:36 下午
 */
public class PoiController {
    @Autowired
    private PoiService poiService;

    /**
     * 上传
     * @param file
     * @param request
     * @return
     */
    @RequestMapping(value = "/fileUpload",method = RequestMethod.POST,
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Object> fileUpload(@RequestParam("file") MultipartFile file, HttpServletRequest request){
        return poiService.fileUpload(file);
    }

    /**
     * 下载
     * @param response
     */
    @RequestMapping(value = "downLoadExcel", method = RequestMethod.GET)
    public void downLoadExcel(HttpServletResponse response){
        poiService.downLoadExcel(response);
    }
}
