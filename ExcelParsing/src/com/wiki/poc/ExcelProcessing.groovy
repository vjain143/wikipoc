@Grab(group='org.apache.poi', module='poi', version='3.16')
@Grab(group='org.apache.poi', module='poi-ooxml', version='3.16')

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFCellUtil;
import org.apache.poi.poifs.filesystem.POIFSFileSystem
import org.apache.poi.ss.usermodel.*
import org.apache.poi.ss.util.CellRangeAddress;

Workbook wb = WorkbookFactory.create(new File("/Users/vjain143/Data/CodePlaygraound/ExcelParsing/resources/abc.xlsx"));
Sheet mySheet = wb.getSheetAt(0);


Iterator<Row> rowIter = mySheet.rowIterator();

System.out.println(mySheet.getRow(3).getCell(1));