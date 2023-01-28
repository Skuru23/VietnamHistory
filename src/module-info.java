/**
 * 
 */
/**
 * @author Admin
 *
 */
module VietnamHistory {
	requires javafx.base;
    requires javafx.controls;
    requires javafx.media;
    requires javafx.web;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.swing;
    requires javafx.swt;
	requires org.jsoup;
	requires json.simple;
	requires java.xml.crypto;
	
	opens vnhistory.entity to org.json.simple;
	
    exports vnhistory.entity;
    exports vnhistory.crawler;
}