package com.ew.views;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.ew.beans.StudentInfo;

public class StudentExcelView extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map<String, Object> dataMap,
			HSSFWorkbook hssfWorkbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		HSSFSheet sheet = hssfWorkbook.createSheet("Students");
		List<StudentInfo> students = (List<StudentInfo>) dataMap
				.get("students");

		for (int row = 0; row < students.size(); row++) {
			HSSFRow record = sheet.createRow(row);
			HSSFCell cell1 = record.createCell(0);
			cell1.setCellValue(students.get(row).getId());
			HSSFCell cell2 = record.createCell(1);
			cell2.setCellValue(students.get(row).getName());
		}

	}

}
