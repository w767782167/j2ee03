package com.ectxm._06upload;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {

	@RequestMapping("/download")
	public void download(HttpServletResponse resp){
		
		FileInputStream is = null;
		try {
			resp.setHeader("content-disposition", "attachment;filename=a.jpg");
		    is = new FileInputStream(new File("D:/a.jpg"));
			ServletOutputStream os = resp.getOutputStream();
			IOUtils.copy(is, os);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(is!=null)
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	@RequestMapping("/upload")
	public void upload(MultipartFile file){
		System.out.println("文件上传");
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		InputStream is = null;
		FileOutputStream os = null;
		
		try {
			 is = file.getInputStream();
			 os = new FileOutputStream(new File("D:/a.jpg"));
			IOUtils.copy(is, os);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(is!=null){
				try {
					is.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(os!=null){
				try {
					os.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}
	}
}
