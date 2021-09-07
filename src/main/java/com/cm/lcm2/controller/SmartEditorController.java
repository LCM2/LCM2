package com.cm.lcm2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SmartEditorController {

	@RequestMapping(value="smarteditorMultiImageUpload")
	public String singleImageUpload(HttpServletRequest req) throws Exception {
		
//		String callback = smartEditor.getCallback();
//		String callback_func = smartEditor.getCallback_func();
//		String fileResult = "";
//		String result = "";
//		
//		MultipartFile multipartFile = smartEditor.getFiledata();
//		
//		try {
//			if(multipartFile != null && multipartFile.getSize() > 0 && !"".equals(multipartFile.getName()) ) {
//				if( multipartFile.getContentType().toLowerCase().startsWith("image/") ){
//					String originalName = multipartFile.getName();
//					String uploadPath = req.getServletContext().getRealPath("/img");
//					String path = uploadPath + "/smarteditor/";
//					File file = new File(path);
//					
//					//경로가 없다면
//					if(!file.exists()) {
//						file.mkdirs();
//					}
//					
//					String fileName = UUID.randomUUID().toString();
//					smartEditor.getFiledata().transferTo(new File(path + fileName));
//					fileResult += "&bNewLine=true&sFileName=" + originalName
//								 + "&sFileURL=/img/smarteditor/" + fileName;
//				}else {
//					fileResult += "&errstr=error";
//				}
//			}else {
//				fileResult += "&errstr=error";
//			}
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		result = "redirect" + callback + "?callback_func=" + URLEncoder.encode(callback_func, "UTF-8") + fileResult;
//		return result;
		return null;
	}
}
