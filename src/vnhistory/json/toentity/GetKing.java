package vnhistory.json.toentity;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import vnhistory.entity.King;

public class GetKing implements GetInforFromJsonFile{
	private JSONParser parser = new JSONParser();

	@Override
	public void getSingleEntityInfor(JSONObject vua, King king) {
		// TODO Auto-generated method stub
		JSONObject kingObj = (JSONObject) vua.get("Vua");
		
		String ten = (String) kingObj.get("Ten");
		king.setTen(ten);
		
		String dynasty = (String) kingObj.get("Thoi ky/Trieu Dai");
		king.setDynasty(dynasty);
		
		String birth = (String) kingObj.get("Sinh");
		king.setBirthDate(birth);

		String death = (String) kingObj.get("Mat");
		king.setDeathDate(death);
		
		String cha = (String) kingObj.get("Than phu");
		king.setFather(cha);
		
		String me = (String) kingObj.get("Than mau");
		king.setMother(me);
		
		String time = (String) kingObj.get("Tri Vi");
		king.setThoiGianTriVi(time);
		
		String tien = (String) kingObj.get("Tien nhiem");
		king.setTienNhiem(tien);
		
		String ke = (String) kingObj.get("Ke nhiem");
		king.setKeNhiem(ke);
		
		String noi = (String) kingObj.get("An tang");
		king.setNoiAnNghi(noi);
	}

	@Override
	public void getEntityInfor(List<King> kingList) {
		// TODO Auto-generated method stub
		try (FileReader reader = new FileReader("VNHistoryData/vua.json")) {
			Object obj = parser.parse(reader);
			
			JSONArray array = (JSONArray) obj;
			
			for(int i = 0; i < array.size(); i++) {
				King king = new King();
				getSingleEntityInfor((JSONObject) array.get(i), king);
				kingList.add(king);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
