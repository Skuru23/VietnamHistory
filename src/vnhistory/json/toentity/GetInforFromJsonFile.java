package vnhistory.json.toentity;

import java.util.List;

import org.json.simple.JSONObject;

import vnhistory.entity.King;

public interface GetInforFromJsonFile {
	void getSingleEntityInfor(JSONObject vua, King king);
	void getEntityInfor(List<King> kingList);
}
