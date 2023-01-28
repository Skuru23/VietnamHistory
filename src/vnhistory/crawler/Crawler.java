package vnhistory.crawler;

import java.io.IOException;

public interface Crawler {
	void getSingleEntityInfor(String link) throws IOException;
	void getEntityinfor(String link) throws IOException;
}
