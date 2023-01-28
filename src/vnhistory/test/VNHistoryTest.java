package vnhistory.test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import vnhistory.crawler.KingCrawler;
import vnhistory.entity.King;
import vnhistory.json.toentity.GetKing;
import vnhistory.resources.Resources;

public class VNHistoryTest {

	public static void main(String[] args) {
		
		//GHI VAO FILE JSON
//		KingCrawler crawler = new KingCrawler();
//		try {
//			crawler.getSingleEntityInfor(Resources.wikiLink + "/wiki/Kinh_Dương_vương");
//			crawler.getSingleEntityInfor(Resources.wikiLink + "/wiki/Lạc_Long_Quân");
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println(crawler.vuaArray);
//		
//		try (FileWriter file = new FileWriter("VNHistoryData/vua.json")){
//			  file.write(crawler.vuaArray.toJSONString());
//			  file.flush();
//		  } catch (Exception e) {
//			  e.printStackTrace();
//		}
		
		
		//DOC TU FILE JSON
		List<King> king = new ArrayList<>();
		GetKing getKing = new GetKing();
		
		getKing.getEntityInfor(king);
		for(King a: king) {
			System.out.println(a.toString());
		}
		
	}

}
